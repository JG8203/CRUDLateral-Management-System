<%-- 
    Document   : editValuation
    Created on : Nov 19, 2023, 12:43:12 PM
    Author     : armaine
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit Valuation</title>
</head>
<body>
    <h1>Edit Valuation</h1>
    <form action="path-to-servlet" method="post">
        <!-- Pre-populate form fields with valuation data -->
        Collateral ID: <input type="text" name="collateralId" value="[Existing Collateral ID]"><br>
        Current Value: <input type="text" name="currentValue" value="[Existing Current Value]"><br>
        <!-- Add other fields -->
        <input type="submit" value="Update Valuation">
    </form>
</body>
</html>
