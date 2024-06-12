package furnituredb;import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbUtil {
    private static final String URL = "jdbc:mysql://192.168.18.245:3306/javadb_168";
    private static final String USER = "javadb_168"; // Your MySQL username
    private static final String PASS = "Sp3cJa5A2k24"; // Your MySQL password

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return DriverManager.getConnection(URL, USER, PASS);
    }
}
