package clientsmgt;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;

public class clients {

    // Variables
    public int      client_id;
    public String   client_name;
    public int      client_contact;
    public String   client_address;
    public Date     membership_date = new Date();

    // Variable Lists
    public ArrayList<Integer>   client_idList       = new ArrayList<>();
    public ArrayList<String>    client_nameList     = new ArrayList<>();
    public ArrayList<Integer>   client_contactList  = new ArrayList<>();
    public ArrayList<String>    client_addressList  = new ArrayList<>();
    public ArrayList<Date>      membership_dateList = new ArrayList<>();

    public clients() {
    }

    public int addClient() {
        try {
            // Connect to the database
            String url = "jdbc:mysql://localhost:3306/collateral_db";
            Connection conn = DriverManager.getConnection(url, "root", "12345678");
            System.out.println("Connection Successful!");

            // Prepare SQL Statement to get the next Client ID
            PreparedStatement pstmt = conn.prepareStatement("SELECT MAX(client_id) + 1 AS newID FROM Client");
            ResultSet rst = pstmt.executeQuery();

            while (rst.next()) {
                client_id = rst.getInt("newID");
            }

            java.sql.Date client_membership_date = new java.sql.Date(membership_date.getTime());

            // Save the new client ID
            pstmt = conn.prepareStatement("INSERT INTO Client (client_id, client_name, client_contact, client_address, client_membership_date) VALUE (?, ?, ?, ?, ?)");
            pstmt.setInt(1, client_id);
            pstmt.setString(2, client_name);
            pstmt.setInt(3, client_contact);
            pstmt.setString(4, client_address);
            pstmt.setDate(5, client_membership_date);

            pstmt.executeUpdate();
            pstmt.close();
            conn.close();
            return 1;

        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
            e.printStackTrace();
            return 0;
        }
    }
    
    public int listClient() {
        try {
            String url = "jdbc:mysql://localhost:3306/collateral_db";
            Connection conn = DriverManager.getConnection(url, "root", "12345678");
            System.out.println("Connection Successful!");
            PreparedStatement pstmt = conn.prepareStatement("SELECT client_id, client_name, client_contact, client_address, client_membership_date FROM Client");
            ResultSet rst = pstmt.executeQuery();
            
            client_idList.clear();
            client_nameList.clear();
            client_contactList.clear();
            client_addressList.clear();
            membership_dateList.clear();
            
            while (rst.next()) {
                int client_id = rst.getInt("client_id");
                String client_name = rst.getString("client_name");
                int client_contact = rst.getInt("client_contact");
                String client_address = rst.getString("client_address");
                Date membership_date = rst.getDate("client_membership_date");

                client_idList.add(client_id);
                client_nameList.add(client_name);
                client_contactList.add(client_contact);
                client_addressList.add(client_address);
                membership_dateList.add(membership_date);
            }
            pstmt.close();
            conn.close();
            return 1;
        } catch (Exception e) {
            e.printStackTrace(); // Add this line to print the exception details
            return 0;
        }
    }

    public static void main(String[] args) {
        clients clientObj = new clients();
//        clientObj.client_name = "1";
//        clientObj.client_contact = 2;
//        clientObj.client_address = "3";
        System.out.println(clientObj.addClient());
    }
}
