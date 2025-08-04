package jdbctasks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateStudentEmail {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "Ajay@9484";
        String updateSQL = "UPDATE Students SET email = ? WHERE id = ?";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(updateSQL)) {
            pstmt.setString(1, "newajay@example.com");
            pstmt.setInt(2, 1); 
            int rowsAffected = pstmt.executeUpdate();
            System.out.println(rowsAffected + " record(s) updated.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

