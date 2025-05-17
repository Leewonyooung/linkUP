package com.kosta.linkup.controller.admin;

import com.kosta.linkup.dto.AdminProject;
import com.kosta.linkup.dto.AdminProjectDetail;
import com.kosta.linkup.service.admin.IProjectService;
import com.kosta.linkup.util.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/admin/project")
public class ProjectController {

    private final IProjectService projectService;

    @Autowired
    public ProjectController(IProjectService projectService) {
        this.projectService = projectService;
    }

    /**
     * ✅ 목록 조회 or 상세 조회
     * - /admin/project → 목록
     * - /admin/project?projectid=3 → 상세
     */
    @GetMapping
    public String handleProjectRequest(
            @RequestParam(value = "id", required = false) Integer projectId,
            @RequestParam(value = "page", defaultValue = "1") int curPage,
            @RequestParam(value = "keyword", required = false) String keyword,
            @RequestParam(value = "settleStatus", required = false) String settleStatus,
            @RequestParam(value = "startDate", required = false) String startDate,
            @RequestParam(value = "endDate", required = false) String endDate,
            Model model
    ) {
        if (projectId != null) {
            // ✅ 상세 조회
            try {
                AdminProjectDetail detail = projectService.selectProjectDetail(projectId);
                model.addAttribute("project", detail);
                return "admin/project_detail";
            } catch (Exception e) {
                e.printStackTrace();
                model.addAttribute("errorMessage", "프로젝트 상세 정보를 가져오지 못했습니다.");
                return "error/500";
            }
        } else {
            // ✅ 목록 조회
            model.addAttribute("now", new Date());

            // 빈 문자열 처리
            keyword = (keyword != null && keyword.trim().isEmpty()) ? null : keyword;
            settleStatus = (settleStatus != null && settleStatus.trim().isEmpty()) ? null : settleStatus;
            startDate = (startDate != null && startDate.trim().isEmpty()) ? null : startDate;
            endDate = (endDate != null && endDate.trim().isEmpty()) ? null : endDate;

            int perPage = 8;
            int offset = (curPage - 1) * perPage;

            try {
                List<AdminProject> projectList = projectService.getPagedProjects(offset, perPage, keyword, settleStatus, startDate, endDate);
                int totalCount = projectService.getTotalProjectCount(keyword, settleStatus, startDate, endDate);
                PageInfo pageInfo = projectService.calculatePageInfo(curPage, perPage, totalCount);

                model.addAttribute("projectList", projectList);
                model.addAttribute("pageInfo", pageInfo);
                model.addAttribute("totalCount", totalCount);

                return "admin/project_list";
            } catch (Exception e) {
                e.printStackTrace();
                model.addAttribute("errorMessage", "프로젝트 목록을 가져오지 못했습니다.");
                return "error/500";
            }
        }
    }
}
