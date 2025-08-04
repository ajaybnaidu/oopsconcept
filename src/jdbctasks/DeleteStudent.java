package jdbctasks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteStudent {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "Ajay@9484";
        String deleteSQL = "DELETE FROM Students WHERE id = ?";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(deleteSQL)) {
            pstmt.setInt(1, 4);

            int rowsAffected = pstmt.executeUpdate();
            System.out.println(rowsAffected + " record(s) deleted.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
