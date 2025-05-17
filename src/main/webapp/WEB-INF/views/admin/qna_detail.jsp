<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <c:set var="contextPath" value="${pageContext.request.contextPath }"/>
  <meta charset="UTF-8">
  <title>문의 상세 내역</title>
  <link rel="stylesheet" href="${contextPath}/css/admin/admin_header.css" />
  <link rel="stylesheet" href="${contextPath}/css/admin/qna_detail.css" />
  <script>
  const defaultOpenMenuId = "qaMenu";
  </script>
</head>

<body>
<jsp:include page="admin_header.jsp" />
<div class="layout-wrapper">
    <jsp:include page="menutap.jsp" />
  <div class="content">
    <div class="card detail-page">
      <h2 class="page-title">문의 상세 내역</h2>
      <div class="detail-info">
        <div><strong>작성자:</strong> <span>${qna.userId}</span></div>
        <div><strong>작성일:</strong> <span><fmt:formatDate value="${qna.questionDate}" pattern="yyyy-MM-dd" /></span></div>
        <div><strong>상태:</strong>
          <span class="status-label">
            <c:choose>
              <c:when test="${qna.answerContent != null && qna.answerContent != '(답변대기 중)'}">답변완료</c:when>
              <c:otherwise>미답변</c:otherwise>
            </c:choose>
          </span>
        </div>
      </div>
      <div class="question-section">
        <h3 class="question-title">질문 제목</h3>
        <pre class="question-content">${qna.questionContent}</pre>
      </div>
      <div class="answer-section">
        <form method="post" action="<c:url value='/admin/qna-answer'/>">
          <input type="hidden" name="qnaId" value="${qna.qnaId}" />
          <label for="answer" class="answer-label">답변 작성</label>
          <textarea id="answer" name="answerContent" placeholder="답변을 입력하세요..." rows="8" class="answer-textarea">
            <c:if test="${qna.answerContent != '(답변대기 중)'}">${qna.answerContent}</c:if>
          </textarea>
          <div class="actions">
            <button type="button" class="btn cancel" onclick="location.href='<c:url value='/admin/qna'/>'">취소</button>
            <button type="submit" class="btn confirm">답변 등록</button>
          </div>
        </form>
      </div>
    </div> <!-- card 끝 -->
  </div> <!-- content 끝 -->
</div> <!-- layout-wrapper 끝 -->
</body>
</html>