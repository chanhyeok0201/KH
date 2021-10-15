<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:import url="/WEB-INF/views/layout/header.jsp" />

<script type="text/javascript">
$(document).ready(function() {
	
	//글쓰기 버튼 누르면 이동
	$("#btnWrite").click(function() {
		location.href="/ad/notice/write";
	});
	
});
</script>


<div class="container">

<div class="boardtitle">
<h1 style= "text-align :center;" >공지사항 관리</h1>
<hr>
</div>

<table class="table table-hover">
<colgroup>
	<col style="width: 83px">
	<col style="width: 400px">
	<col style="width: 83px">
	<col style="width: 83px">
	<col style="width: 160px">
</colgroup>
<thead>
  <tr>
    <th class="tg-18bt" style= "text-align :center;">글번호</th>
    <th class="tg-18bt" style= "text-align :center;">제목</th>
    <th class="tg-18bt">작성자</th>
    <th class="tg-18bt">조회수</th>
    <th class="tg-18bt">작성일</th>
  </tr>
</thead>
<tbody>
<c:forEach items="${adNoticeList }" var="adNotice">
  <tr>
    <td class="tg-xphl" style= "text-align :center;" >${adNotice.boardNo }</td>
    <td class="tg-xphl" ><a href="/ad/notice/view?boardNo=${adNotice.boardNo }">
		${adNotice.boardTitle }
		</a></td>
<%--     <td class="tg-xphl">${free.userId }</td> --%>
    <td class="tg-xphl" >${adNotice.userNick }</td>
    <td class="tg-xphl" >${adNotice.hit }</td>
    <td class="tg-xphl" >${adNotice.boardDate }</td>
  </tr>
</c:forEach>
</tbody>
</table>

<div id="btnBox" class="btn">
	<button id="btnWrite" class="btnBox" >글작성</button>
</div>

<!-- .container -->
</div>

<c:import url="/WEB-INF/views/layout/paging.jsp" />

<c:import url="/WEB-INF/views/layout/footer.jsp" />