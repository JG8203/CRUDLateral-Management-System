<%-- 
    Document   : addValuation.jsp
    Created on : Nov 19, 2023, 12:42:39 PM
    Author     : armaine
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Valuation</title>
</head>
<body>
    <h1>Add New Valuation</h1>
    <form action="path-to-servlet" method="post">
        <!-- Form fields for valuation data -->
        Collateral ID: <input type="text" name="collateralId"><br>
        Current Value: <input type="text" name="currentValue"><br>
        <!-- Add other fields as necessary -->
        <input type="submit" value="Add Valuation">
    </form>
</body>
</html>
