/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assigments10;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author mark-4304
 */
public class DBTester {

    public static Scanner scan = new Scanner(System.in);
    private static String operation;

    public static void main(String args[]) throws SQLException {
        Connection con = null;
        PreparedStatement stmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");

            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/mysql", "root", "");
            do {
                System.out.println("Type your Operation ( insert (i) /update (u) /view (v) ):: ");
                operation = scan.next();

                switch (operation) {
                    case "i":
                        insert(con, stmt);
                        break;
                    case "u":
                        update(con, stmt);
                        break;
                    case "v":
                        viewTable(con);
                        break;
                    default:
                        System.out.println("Ooops !!! you are typed wrongly ....");
                        break;
                }
                System.out.println("Do you want to contiune ( y / n ) :: ");
                operation = scan.next();
            } while (operation.equals("y"));

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            con.close();
        }

    }

    private static void viewTable(Connection con) throws SQLException {
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from test.MySampleTable");
        System.out.println("-----------------------------------------------");
        System.out.println("NAME\t EmpID\t Product");
        System.out.println("-----------------------------------------------");
        while (rs.next()) {
            System.out.println(rs.getString(1) + "\t  " + rs.getString(2) + "\t  " + rs.getString(3));
        }
        System.out.println("----------------------------I-------------------");
    }

    private static void insert(Connection con, PreparedStatement stmt) throws SQLException {
        stmt = (PreparedStatement) con.prepareStatement("insert into test.MySampleTable values ( ?, ?, ? );");

        System.out.println("Enter the Employee Name :: ");
        String name = scan.next();

        System.out.println("Enter the Employee Id   :: ");
        String empId = scan.next();

        System.out.println("Enter the Product name  :: ");
        String product = scan.next();

        stmt.setString(1, name);
        stmt.setString(2, empId);
        stmt.setString(3, product);
        System.out.println("-----------------------------------------------");
        int rows = stmt.executeUpdate();
        System.out.println("Rows impacted : " + rows);
        System.out.println("-----------------------------------------------");
    }

    private static void update(Connection con, PreparedStatement stmt) throws SQLException {
        String sql = "UPDATE test.MySampleTable set name=? WHERE empid=?";
        stmt = (PreparedStatement) con.prepareStatement(sql);

        System.out.println("Enter the Employee Id           :: ");
        String empId = scan.next();

        System.out.println("Enter the Update Employee name  :: ");
        String newName = scan.next();

        stmt.setString(1, newName);
        stmt.setString(2, empId);

        System.out.println("-----------------------------------------------");
        int rows = stmt.executeUpdate();
        System.out.println("Rows impacted : " + rows);
        System.out.println("-----------------------------------------------");
    }
}
