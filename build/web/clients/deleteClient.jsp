<%-- 
    Document   : deleteClient
    Created on : Nov 19, 2023, 10:57:01 AM
    Author     : armaine
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete Client</title>
</head>
<body>
    <h1>Confirm Delete</h1>
    <p>Are you sure you want to delete this client?</p>
    <!-- Form for deletion confirmation -->
    <form action="path-to-servlet" method="post">
        <input type="hidden" name="id" value="[Client ID]">
        <input type="submit" value="Delete">
    </form>
    <a href="listClients.jsp">Cancel</a>
</body>
</html>

