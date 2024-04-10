package quanlycuahanggiay_java.DAO;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConectToDB {

    private static final String DB_URL = "jdbc:sqlserver://DESKTOP-CCD18C2\\SQLEXPRESS:1433;databaseName=StoreManager;trustServerCertificate=true;";
    private static final String USER_NAME = "sa";
    private static final String PASSWORD = "15102004";

    public static void main(String[] args) {
        Connection conn = null;
        try {
            conn = getConnection(DB_URL, USER_NAME, PASSWORD);
            if (conn != null) {
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT MaNV FROM NhanVien");
                while (rs.next()) {
                    // Lấy dữ liệu từ cột "MaNV"
                    int manv = rs.getInt("MaNV");

                    // In ra dữ liệu từ cột "MaNV" của mỗi hàng
                    System.out.println(manv);
                }

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static Connection getConnection(String dbURL, String userName, String password) {
        Connection conn = null;
        try {
            SQLServerDataSource ds = new SQLServerDataSource();
            ds.setURL(dbURL);
            ds.setUser(userName);
            ds.setPassword(password);
            conn = ds.getConnection();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return conn;
    }
}
