<%-- 
    Document   : addCollaterals
    Created on : 11 20, 23, 6:56:40 PM
    Author     : ccslearner
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*, collateralsmgt.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Collateral</title>
    </head>
    <body>
    <form action="add_collateral_processing.jsp">
            <jsp:useBean id="CollateralObj" class="collateralsmgt.collaterals" scope="session"/>
            <!-- Form fields for collaterals.java data -->
            Type:           <input type="text"      id="collateral_type"     name="collateral_type"><br>
            Value:          <input type="number"    id="collateral_value"    name="collateral_value"><br>
            Description:    <input type="text"      id="collateral_desc"     name="collateral_desc"><br>
            Client ID:      <select                 id="client_id"           name="client_id">
            <%
                CollateralObj.listCollateral();
                for (int i=1; i <= Collections.max(CollateralObj.client_idList); i++) {
            %>
            <option value="<%=i%>">Client #<%=i%></option>
            <%
                }
            %>
            </select><br>   
            Location:       <input type="text"      id="location"            name="location">
            <!-- Add other fields as necessary -->
            <input type="submit" value="Add Collateral">
        </form>
    </body>
</html>
