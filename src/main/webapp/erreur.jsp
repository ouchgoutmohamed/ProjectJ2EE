<%--
  Created by IntelliJ IDEA.
  User: AdMin
  Date: 19/05/2024
  Time: 19:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String errorMessage = (String) request.getAttribute("errorMessage");
    if(errorMessage != null){
%>
<p><%= errorMessage %></p>
<%
    }
%>
</body>
</html>
