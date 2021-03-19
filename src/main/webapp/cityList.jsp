<%@ page language="java" contentType="text/html; charset=UTF-8"
         isELIgnored="false" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>
城市列表2
<br>
<c:forEach items="${cityList}" var="cl">
    ${cl.cityId}&nbsp;&nbsp;&nbsp;&nbsp;
    ${cl.cityName}&nbsp;&nbsp;&nbsp;&nbsp;
    ${cl.cityCode}<br>
</c:forEach>
</body>
</html>
