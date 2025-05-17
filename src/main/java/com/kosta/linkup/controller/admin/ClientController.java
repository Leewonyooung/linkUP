/**
 * ClientController.java
 * GET : 업체(구인자)의 상세 정보를 렌더링
 * POST : //
 */
package com.kosta.linkup.controller.admin;
/**
 * ClientController.java
 * GET : 업체(구인자)의 상세 정보를 렌더링
 */

import com.kosta.linkup.dto.ClientUserDetail;
import com.kosta.linkup.service.admin.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ClientController {

    private final IClientService clientService;

    @Autowired
    public ClientController(IClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/admin/client")
    public String showClientDetail(@RequestParam("clientid") String clientId, Model model) {
        try {
            ClientUserDetail client = clientService.selectClientById(clientId);
            model.addAttribute("client", client);
        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("error", "Client not found");
        }
        return "admin/client_detail"; // => /WEB-INF/views/admin/client_detail.jsp
    }
}
