<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
        <!DOCTYPE html>
        <html lang="en">

        <head>
            <meta charset="UTF-8">
            <meta http-equiv="X-UA-Compatible" content="IE=edge">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Document</title>
            <style>
                .flex box {
                    display: flex;
                }
            </style>
        </head>

        <body>

            <h1>로그인 페이지</h1>
            <hr />
            <ul>
                <div class="flex box">
                    <a href="/loginForm">로그인</a>
                    <a href="/joinForm">회원가입</a>
                </div>
            </ul>
            <form action="/join" method="post">
                <table border="1">
                    <tr>
                        <th>유저네임</th>
                        <td><input type="text" name="username" placeholder="Enter username" required></td>
                    </tr>
                    <tr>
                        <th>패스워드</th>
                        <td> <input type="password" name="password" placeholder="Enter password" required><br /></td>
                    </tr>
                </table>
                <button type="submit">로그인</button>
            </form>
           <br />
            <hr />
            <div class="footer_box">
                <i>Created By Apple</i><br />
                <i>부산 진구 중앙대로 708</i><br />
            </div>

        </body>

        </html>
