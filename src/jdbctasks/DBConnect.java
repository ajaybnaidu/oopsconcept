package jdbctasks;

import java.sql.*;
public class DBConnect {
 public static void main(String[] args) {
 String url = "jdbc:mysql://localhost:3306/testdb"; 
 String username = "root";
 String password = "Ajay@9484";
 try {
 Class.forName("com.mysql.cj.jdbc.Driver"); 
 Connection conn = DriverManager.getConnection(url, username,password);
 System.out.println("Connected to DB!");
 conn.close();
 } catch (Exception e) {
 e.printStackTrace();
 }
 }}