import java.sql.Connection;
import java.sql.DriverManager;

public class gg {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/SchoolManagmentSystem",
                    "postgres",
                    "#Ademokkaaa0327"
            );
            System.out.println("Connected successfully!");
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
