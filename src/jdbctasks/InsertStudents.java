package jdbctasks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertStudents {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "Ajay@9484";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement()) {

            String sql1 = "INSERT INTO Students VALUES (1, 'Ajay', 'ajay@example.com')";
            String sql2 = "INSERT INTO Students VALUES (2, 'Priya', 'priya@example.com')";

            stmt.executeUpdate(sql1);
            stmt.executeUpdate(sql2);

            System.out.println("Inserted 2 student records.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

