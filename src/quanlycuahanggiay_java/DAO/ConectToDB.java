package quanlycuahanggiay_java.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectToDB {

    String Host = "";
    String Username = "";
    String Password = "";
    String Database = "";

    Connection connect = null;
    Statement statement = null;
    ResultSet resultSet = null;

    public ConectToDB(String Host, String Username, String Password, String Database) {
        this.Host = Host;
        this.Username = Username;
        this.Password = Password;
        this.Database = Database;
    }

    protected void driveTest() throws Exception {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException e) {
            throw new Exception("SQL Server driver not found");
        }
    }

    protected Connection getConnect() throws Exception {
        // Nếu connection null thì khởi tạo mới
        if (this.connect == null) {
            // Kiểm tra Driver
            driveTest();

            // Tạo url để kết nối tới Database
            String url = "jdbc:sqlserver://" + this.Host + ":1433;databaseName=" + this.Database + ";trustServerCertificate=true";

            try {
                // Tạo connect thông qua url
                this.connect = DriverManager.getConnection(url, this.Username, this.Password);
            } catch (SQLException e) {
                throw new Exception("Không thể kết nối tới Database: " + url + " - " + e.getMessage());
            }
        }

        return this.connect;
    }

    //tạo hàm statement để query
    protected Statement getStatement() throws Exception {
        //kiểm tra xem statement đã đóng chưa
        if (this.statement == null) {
            //khởi tạo statement mới
            this.statement = getConnect().createStatement();
        } else {
            this.statement.isClosed();
        }
        return this.statement;
    }

    //hàm thực thi các câu lệnh SQL
    public ResultSet excuteQuery(String Query) throws Exception {
        try {
            // thực thi câu lệnh
            this.resultSet = getStatement().executeQuery(Query);

        } catch (Exception e) {
            throw new Exception("Error excuteQuery " + e.getMessage());
        }

        return this.resultSet;
    }

    //thực thi các Insert, Update, Delete
    public int executeUpdate(String Query) throws Exception {
        //khai báo biến int để lưu trữ kết quả trong quá trình thực thi
        int res = Integer.MIN_VALUE;

        try {
            //thực thi câu lệnh
            res = getStatement().executeUpdate(Query);
        } catch (Exception e) {
            throw new Exception("Error " + e.getMessage());
        }

        return res;
    }

    //hàm đóng kết nối
    public void Close() throws Exception {
        if (this.resultSet != null && this.resultSet.isClosed()) {
            this.resultSet.close();
            this.resultSet = null;
        }
        if (this.statement != null && this.statement.isClosed()) {
            this.statement.close();
            this.statement = null;
        }
        if (this.connect != null && this.connect.isClosed()) {
            this.connect.close();
            this.connect = null;
        }
    }
}
