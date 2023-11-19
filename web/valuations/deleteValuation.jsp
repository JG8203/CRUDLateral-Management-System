<%-- 
    Document   : deleteValuation
    Created on : Nov 19, 2023, 12:43:28 PM
    Author     : armaine
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete Valuation</title>
</head>
<body>
    <h1>Confirm Delete</h1>
    <p>Are you sure you want to delete this valuation?</p>
    <form action="path-to-servlet" method="post">
        <input type="hidden" name="id" value="[Valuation ID]">
        <input type="submit" value="Delete">
    </form>
    <a href="listValuations.jsp">Cancel</a>
</body>
</html>
