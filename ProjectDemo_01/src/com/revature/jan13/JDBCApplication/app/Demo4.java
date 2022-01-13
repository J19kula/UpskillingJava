package com.revature.jan13.JDBCApplication.app;

import java.sql.*;
import java.util.Scanner;

public class Demo4 {
    // Prepared statement
    public static void main(String[] args) throws SQLException {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306";
        String username = "root";
        String password = "root";

        Connection conn = null;
        PreparedStatement pstmt = null;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter id: ");
        int id = input.nextInt();
        System.out.print("Enter first name: ");
        String fn = input.next();
        System.out.print("Enter last name: ");
        String ln = input.next();
        System.out.print("Enter email: ");
        String email = input.next();


        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, username, password);
            pstmt = conn.prepareStatement("INSERT INTO student VALUES(?,?,?,?)");
            pstmt.setInt(1, id);
            pstmt.setString(2, fn);
            pstmt.setString(3, ln);
            pstmt.setString(4, email);
           if (1 == pstmt.executeUpdate()){
               System.out.println("Inserted successfully");
           }
           else{
               System.out.println("Failed to insert");
           }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        finally {
            assert false;
            pstmt.close();
            conn.close();
        }
    }
}
