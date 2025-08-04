package jdbctasks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class CallGetStudentById {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "Ajay@9484";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student ID to search: ");
        int id = scanner.nextInt();

        String callSQL = "{call getStudentById(?)}";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             CallableStatement cstmt = conn.prepareCall(callSQL)) {
            cstmt.setInt(1, id);
            ResultSet rs = cstmt.executeQuery();

            boolean found = false;
            while (rs.next()) {
                found = true;
                int sid = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");

                System.out.println("ID: " + sid + ", Name: " + name + ", Email: " + email);
            }

            if (!found) {
                System.out.println("No student found with ID: " + id);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

