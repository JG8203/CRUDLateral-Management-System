<%-- 
    Document   : find_collateral_processing
    Created on : 11 20, 23, 8:43:08 PM
    Author     : ccslearner
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*, collateralsmgt.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:useBean id="CollateralObj" class="collateralsmgt.collaterals" scope="session"/>
        <%
            int v_collateral_id     = Integer.parseInt(request.getParameter("collateral_id"));
            CollateralObj.client_id = v_collateral_id;
            CollateralObj.findCollateral();
        %>
        <title>Collateral ID# <%=v_collateral_id%></title>
        <style>
            p {text-align: justify;}
        </style>
    </head>
    <body>
        <h4>ID#: <%=v_collateral_id%></h4>
        <table>
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
        <tr>
            <td><%=v_collateral_id%></td>
            <td><%=CollateralObj.collateral_type%></td>
            <td><%=CollateralObj.collateral_value%></td>
            <td><%=CollateralObj.collateral_desc%></td>
            <td><%=CollateralObj.client_id%></td>
            <td><%=CollateralObj.location%></td>
            <td><%=CollateralObj.date_added%></td>
            <td><%=CollateralObj.last_valuation_date%></td>
            
        </tr>
        </table>
    </body>
</html>
