<%-- 
    Document   : listCollaterals
    Created on : 11 20, 23, 4:59:56 PM
    Author     : ccslearner
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*, collateralsmgt.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>List Collaterals</title>
    </head>
    <body>
        <h1>List of Collaterals</h1>
        
        <table>
        <jsp:useBean id="CollateralObj" class="collateralsmgt.collaterals" scope="session"/>
        <tr>
            <th>ID</th>
            <th>Type</th>
            <th>Value</th>
            <th>Description</th>
            <th>Client ID</th>
            <th>Location</th>
            <th>Date Added</th>
            <th>Last Valuated</th>
            
        </tr>
        <!-- Rows of collateral data -->
        <%
            CollateralObj.listCollateral();
            for (int i=0; i < CollateralObj.collateral_idList.size(); i++) {
                
         %>
        <tr>
            <td><%=CollateralObj.collateral_idList.get(i)%></td>
            <td><%=CollateralObj.collateral_typeList.get(i)%></td>
            <td><%=CollateralObj.collateral_valueList.get(i)%></td>
            <td><%=CollateralObj.collateral_descList.get(i)%></td>
            <td><%=CollateralObj.client_idList.get(i)%></td>
            <td><%=CollateralObj.locationList.get(i)%></td>
            <td><%=CollateralObj.date_addedList.get(i)%></td>
            <td><%=CollateralObj.last_valuationList.get(i)%></td>
            
        </tr>
        <%
            }
        %>
        </table>
        <a href="addCollateral.html">Add New Collateral</a>
        <form action="index.html">
            <input type="submit" value="Return to Menu">
        </form>
    </body>
</html>
