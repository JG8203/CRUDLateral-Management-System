<%-- 
    Document   : newjspsearchCollateral
    Created on : 11 20, 23, 8:06:52 PM
    Author     : ccslearner
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*, collateralsmgt.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search for a Collateral</title>
    </head>
    <body>
        <h1>Search for a Collateral!</h1>
        <jsp:useBean id="CollateralObj" class="collateralsmgt.collaterals" scope="session"/>
        
        <form action="find_collateral_processing.jsp">
            Collateral ID #: 
            <select id="collateral_id" name="collateral_id">
                <%
                    CollateralObj.listCollateral();
                    for (int i=0; i < CollateralObj.collateral_idList.size(); i++) {
                %>
                        <option value="<%= CollateralObj.collateral_idList.get(i)%>"><%=i+1%></option>
                <%
                    }
                %>
            </select>
            <input type="submit" value="Find Collateral">
         </form>
    </body>
</html>
