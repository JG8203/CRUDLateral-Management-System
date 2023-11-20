package collateralsmgt;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author ccslearner
 */

import java.util.*;
import java.util.Date;
import java.sql.*;

public class collaterals {

    // Variables
    public int collateral_id;
    public String collateral_type;
    public double collateral_value;
    public String collateral_desc;
    public int client_id;
    public String location;
    public Date date_added = new Date();
    public Date last_valuation_date = new Date();

    // Variable Lists
    public ArrayList<Integer> collateral_idList = new ArrayList<>();
    public ArrayList<String> collateral_typeList = new ArrayList<>();
    public ArrayList<Double> collateral_valueList = new ArrayList<>();
    public ArrayList<String> collateral_descList = new ArrayList<>();
    public ArrayList<Integer> client_idList = new ArrayList<>();
    public ArrayList<String> locationList = new ArrayList<>();
    public ArrayList<Date> date_addedList = new ArrayList<>();
    public ArrayList<Date> last_valuationList = new ArrayList<>();


    public collaterals() {
    }

    public int addCollateral() {

        try {
            // this is where we will put codes that will interact with databases
            // 1. Connect to our database
            String url = "jdbc:mysql://localhost:3306/collateral_db";
//            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, "root", "12345678");
            System.out.println("Connection Successful!");

            // 2. Prepare our SQL Statement
            //      2.1. To get the next Collateral ID
            PreparedStatement pstmt = conn.prepareStatement("SELECT MAX(collateral_id) + 1 AS newID FROM Collateral");
            ResultSet rst = pstmt.executeQuery();

            while (rst.next()) {
                collateral_id = rst.getInt("newID");
            }

            java.sql.Date sql_date_added = new java.sql.Date(date_added.getTime());

            //      2.2. Save The new collateral ID
            pstmt = conn.prepareStatement("INSERT INTO Collateral (collateral_id, collateral_type, collateral_value, collateral_desc, client_id, location, date_added) VALUE (?, ?, ?, ?, ?, ?, ?)");
            pstmt.setInt(1, collateral_id);
            pstmt.setString(2, collateral_type);
            pstmt.setDouble(3, collateral_value);
            pstmt.setString(4, collateral_desc);
            pstmt.setInt(5, client_id);
            pstmt.setString(6, location);
            pstmt.setDate(7, sql_date_added);

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

    public static void main(String args[]) {
        collaterals C = new collaterals();


        C.addCollateral();
    }
}
