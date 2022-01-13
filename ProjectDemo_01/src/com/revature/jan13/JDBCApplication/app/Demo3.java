package com.revature.jan13.JDBCApplication.app;

import java.sql.*;
import java.util.Scanner;

public class Demo3 {
    // Insert Statement
    public static void main(String[] args) throws SQLException {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306";
        String username = "root";
        String password = "root";

        Connection conn = null;
        Statement stmt = null;

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
            stmt = conn.createStatement();
            String sql = "INSERT INTO student VALUES ("+id+", '"+fn+"', '"+ln+"', '"+ email+"')";
            System.out.println("SQL to be executed: "+sql);
            int norec = stmt.executeUpdate(sql);
            if (norec != 0){
                System.out.println("Inserted successfully");
            }
            else{
                System.out.println("Failed to insert");
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        finally {
            assert stmt != null;
            stmt.close();
            conn.close();
        }
    }
}
