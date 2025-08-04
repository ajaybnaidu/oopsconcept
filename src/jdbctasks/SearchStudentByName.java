package jdbctasks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class SearchStudentByName {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "Ajay@9484";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name to search: ");
        String nameInput = scanner.nextLine();

        String searchSQL = "SELECT * FROM Students WHERE name = ?";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(searchSQL)) {

            pstmt.setString(1, nameInput);
            ResultSet rs = pstmt.executeQuery();

            boolean found = false;
            while (rs.next()) {
                found = true;
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");

                System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email);
            }

            if (!found) {
                System.out.println("No records found for name: " + nameInput);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        scanner.close();
    }
}

