package jdbctasks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "Ajay@9484";

        String sql = "CREATE TABLE Students (" +
                     "id INT PRIMARY KEY," +
                     "name VARCHAR(50)," +
                     "email VARCHAR(100))";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement()) {

            stmt.execute(sql);
            System.out.println("Students table created.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

