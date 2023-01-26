<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ include file="../layout/header.jsp" %>

        <h1>게시글 목록 페이지</h1>
        <ul style="padding: 0px;">
            <a href="/updateForm">회원정보</a>
            <a href="/logout">로그아웃</a>
        </ul>
        <table border="1">
            <tr>
                <th>번호</th>
                <th>제목</th>
                <th>작성일</th>
            </tr>
            <c:forEach items="${boardList}" var="board">
                <tr>
                    <td>${board.id}</td>
                    <td><a href="">${board.title}</a></td>
                    <td>${board.createdAt}</td>
                </tr>
            </c:forEach>
        </table>
        <a href="">글쓰기</a>
        <%@ include file="../layout/footer.jsp" %>