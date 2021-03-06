<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:import url="/WEB-INF/views/layout/header.jsp" />

<div class="container">
<div class="boardtitle">
<h1 style= "text-align :center; color: cornflowerblue;" >자유게시판 신고 목록</h1>
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
    <th class="tg-18bt">신고 번호</th>
    <th class="tg-18bt">제목</th>
    <th class="tg-18bt">작성자</th>
    <th class="tg-18bt">조회수</th>
    <th class="tg-18bt">작성일</th>
  </tr>
</thead>
<tbody>
<c:forEach items="${freeDeclareList }" var="freeDeclare">
  <tr>
    <td class="tg-xphl" style= "text-align: center;">${freeDeclare.boardNo }</td>
    <td class="tg-xphl" ><a href="/ad/freedeclare/view?boardNo=${freeDeclare.boardNo }">
		${freeDeclare.boardTitle }
		</a></td>
<%--     <td class="tg-xphl">${free.userId }</td> --%>
    <td class="tg-xphl" style= "text-align: center;">${freeDeclare.userNick }</td>
    <td class="tg-xphl" style= "text-align: center;">${freeDeclare.hit }</td>
    <td class="tg-xphl" style= "text-align: center;">${freeDeclare.boardDate }</td>
  </tr>
</c:forEach>
</tbody>
</table>

</div>


<c:import url="/WEB-INF/views/layout/paging.jsp" />

<c:import url="/WEB-INF/views/layout/footer.jsp" />
