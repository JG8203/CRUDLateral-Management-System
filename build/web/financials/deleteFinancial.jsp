<%-- 
    Document   : deleteFinancial
    Created on : Nov 19, 2023, 12:39:50 PM
    Author     : armaine
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete Financial Contract</title>
</head>
<body>
    <h1>Confirm Delete</h1>
    <p>Are you sure you want to delete this financial contract?</p>
    <form action="path-to-servlet" method="post">
        <input type="hidden" name="id" value="[Contract ID]">
        <input type="submit" value="Delete">
    </form>
    <a href="listFinancials.jsp">Cancel</a>
</body>
</html>
