<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Home</title>
</head>
<body>
    <h1>Hello world!!</h1>
    <img src="/img/main_01.jpg" width="800" heigth="300" alt="" />
 
    <table>
        <thead>
            <tr>
                <th>첫번째 컬럼 </th>
                <th>두번째 컬럼 </th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${testList}" var="test">
                <tr>
                    <td>${test.a1}</td>
                    <td>${test.a2}</td>
                </tr>
            </c:forEach>
            
        </tbody>
    </table>
 
 
</body>
</html>
