package jdbctasks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertUsingPreparedStatement {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "Ajay@9484";

        
        String insertSQL = "INSERT INTO Students (id, name, email) VALUES (?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(insertSQL)) {

            
            pstmt.setInt(1, 3);
            pstmt.setString(2, "Rahul");
            pstmt.setString(3, "rahul@example.com");
            pstmt.executeUpdate();

            
            pstmt.setInt(1, 4);
            pstmt.setString(2, "Sneha");
            pstmt.setString(3, "sneha@example.com");
            pstmt.executeUpdate();

            System.out.println("Inserted 2 student records using PreparedStatement.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
