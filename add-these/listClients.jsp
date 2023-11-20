<%-- 
    Document   : listClients
    Created on : 11 20, 23, 5:30:00 PM
    Author     : ccslearner
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*, clientsmgt.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>List Clients</title>
    </head>
    <body>
        <h1>List of Clients</h1>
        
        <table>
            <jsp:useBean id="ClientObj" class="clientsmgt.clients" scope="session"/>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Contact</th>
                <th>Address</th>
                <th>Membership Date</th>
            </tr>
            <!-- Rows of client data -->
            <%
                ClientObj.listClient();
                for (int i = 0; i < ClientObj.client_idList.size(); i++) {
            %>
            <tr>
                <td><%=ClientObj.client_idList.get(i)%></td>
                <td><%=ClientObj.client_nameList.get(i)%></td>
                <td><%=ClientObj.client_contactList.get(i)%></td>
                <td><%=ClientObj.client_addressList.get(i)%></td>
                <td><%=ClientObj.membership_dateList.get(i)%></td>
            </tr>
            <%
                }
            %>
        </table>
    </body>
</html>
