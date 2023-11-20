<%-- 
    Document   : add_clients_processing
    Created on : 11 19, 23, 4:30:25 PM
    Author     : ccslearner
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*, clientsmgt.*" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Client Processing</title>
    </head>
    <body>
        <form action="index.html">

            <jsp:useBean id="ClientObj" class="clientsmgt.clients" scope="session"/>
            <%
                // Retrieving form parameters
                String  v_client_name       = request.getParameter("client_name");
                int     v_client_contact    = Integer.parseInt(request.getParameter("client_contact"));
                String  v_client_address    = request.getParameter("client_address");

                // Setting JavaBean properties with form data
                ClientObj.client_name       = v_client_name;
                ClientObj.client_contact    = v_client_contact;
                ClientObj.client_address    = v_client_address;

                // Invoking the addClient method and capturing the status
                int status = ClientObj.addClient();
            %>

            <% 
                if (status == 1) {
            %>
            <h1>Adding Client Successful!</h1>
            <% 
                } else {
            %>
            <h1>Adding Client Failed!</h1>
            <% 
                }
            %>
            <input type="submit" value="Return to Menu">
        </form>
    </body>
</html>
