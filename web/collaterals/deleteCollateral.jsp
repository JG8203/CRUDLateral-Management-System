<%-- 
    Document   : deleteCollateral
    Created on : Nov 19, 2023, 1:00:03 AM
    Author     : armaine
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete Collateral</title>
</head>
<body>
    <h1>Confirm Delete</h1>
    <p>Are you sure you want to delete this collateral?</p>
    <!-- Form for deletion confirmation -->
    <form action="path-to-servlet" method="post">
        <input type="hidden" name="id" value="[Collateral ID]">
        <input type="submit" value="Delete">
    </form>
    <a href="listCollaterals.jsp">Cancel</a>
</body>
</html>

