<%-- 
    Document   : add_collateral_processing
    Created on : 11 19, 23, 3:52:10 PM
    Author     : ccslearner
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*, collateralsmgt.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Collateral Processing</title>
    </head>
    <body>
        <form action="index.html">

            <jsp:useBean id="CollateralObj" class="collateralsmgt.collaterals" scope="session"/>
            <%
                String v_collateral_type    = request.getParameter("collateral_type");
                double v_collateral_value   = Double.parseDouble(request.getParameter("collateral_value"));
                String v_collateral_desc    = request.getParameter("collateral_desc");
                int v_client_id             = Integer.parseInt(request.getParameter("client_id"));
                String v_location           = request.getParameter("location");

                CollateralObj.collateral_type = v_collateral_type;
                CollateralObj.collateral_value = v_collateral_value;
                CollateralObj.collateral_desc = v_collateral_desc;
                CollateralObj.client_id = v_client_id;
                CollateralObj.location = v_location;

                int status = CollateralObj.addCollateral();
                if (status==1) {
            %>
            <h1>Adding Collateral Successful!</h1>
            <%  } else {
            %>
            <h1>Adding Collateral Failed!</h1>
            <%  }
            %>
            <input type="submit" value="Return to Menu">
        </form>
    </body>
</html>
