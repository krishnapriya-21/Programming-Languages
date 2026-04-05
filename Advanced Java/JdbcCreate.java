import java.sql.*;

public class JdbcCreate {
    public static void main(String[] args) {
        try (Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb", "root", "password")) {

            // CREATE operation
            String sql = "INSERT INTO students (id, name) VALUES (?, ?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, 1);
            stmt.setString(2, "Alice");
            int rows = stmt.executeUpdate();

            System.out.println(rows + " record(s) inserted!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}