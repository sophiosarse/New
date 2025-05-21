import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    private static final String URL = "C:\\Users\\GeoComputers\\Desktop\\homework\\JDBC2\\JDBC2.iml";
    private static final String USER = "Sophio";
    private static final String PASSWORD = "#sophio13!"; // შეცვალე

    public static Connection getConnection() throws Exception {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
