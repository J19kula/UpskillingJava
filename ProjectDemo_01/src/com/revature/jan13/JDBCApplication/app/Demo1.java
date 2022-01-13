package com.revature.jan13.JDBCApplication.app;

import java.sql.*;

public class Demo1 {
    // Doing a selct statement for all
    public static void main(String[] args) throws SQLException {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306";
        String username = "root";
        String password = "root";

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;


        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, username, password);
            stmt = conn.createStatement();
            String sql = "SELECT * FROM student";
            rs = stmt.executeQuery(sql);
            while (rs.next()){
                int slno = rs.getInt(1);
                String fn = rs.getString("firstname");
                String ln = rs.getString("lastname");
                String em = rs.getString("email");
                System.out.println(slno + " - " + fn + " " + ln + " "+em);
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+ " "+ rs.getString(3)+ " "+ rs.getString(4));
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        finally {

            assert rs != null;
            rs.close();
            stmt.close();
            conn.close();
        }
    }
}
