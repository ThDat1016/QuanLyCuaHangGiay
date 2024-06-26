/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlycuahanggiay_java.DAO;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.HashMap;
import quanlycuahanggiay_java.DAO.ConectToDB;

/**
 *
 * @author Admin
 */
public class ConnectUnit {

    private ConectToDB connect;

    //hàm khởi tạo kết nối mặt định
    public ConnectUnit() {
        connect = new ConectToDB("localhost", "sa", "15102004", "CHGIAY");
    }

    // hàm khởi tạo cơ bản
    public ConnectUnit(String Host, String Username, String Password, String Database) {
        connect = new ConectToDB(Host, Username, Password, Database);
    }

    public int getMaxMaHD() throws Exception {
        // Khởi tạo câu lệnh SQL để lấy mã hóa đơn lớn nhất
        StringBuilder query = new StringBuilder("SELECT MAX(MAHD) AS MaxMaHD FROM HOADON");
        query.append(";");
        // Thực thi câu lệnh query và trả về kết quả
        ResultSet rs = this.connect.excuteQuery(query.toString());
        if (rs.next()) { // Kiểm tra xem ResultSet có dữ liệu không
            return rs.getInt("MaxMaHD");
        } else {
            throw new Exception("ResultSet không chứa dữ liệu.");
        }
    }

    public int getMaxMaPN() throws Exception {
        // Khởi tạo câu lệnh SQL để lấy mã hóa đơn lớn nhất
        StringBuilder query = new StringBuilder("SELECT MAX(MAPN) AS MaxMaPN FROM PHIEUNHAP");
        query.append(";");
        // Thực thi câu lệnh query và trả về kết quả
        ResultSet rs = this.connect.excuteQuery(query.toString());
        if (rs.next()) { // Kiểm tra xem ResultSet có dữ liệu không
            return rs.getInt("MaxMaPN");
        } else {
            throw new Exception("ResultSet không chứa dữ liệu.");
        }
    }
    public int getMaxMaGiay() throws Exception {
        // Khởi tạo câu lệnh SQL để lấy mã hóa đơn lớn nhất
        StringBuilder query = new StringBuilder("SELECT MAX(MAGIAY) AS MaxMaGiay FROM GIAY");
        query.append(";");
        // Thực thi câu lệnh query và trả về kết quả
        ResultSet rs = this.connect.excuteQuery(query.toString());
        if (rs.next()) { // Kiểm tra xem ResultSet có dữ liệu không
            return rs.getInt("MaxMaGiay");
        } else {
            throw new Exception("ResultSet không chứa dữ liệu.");
        }
    }
    public ResultSet Select(String TableName, String Condition, String OrderBy) throws Exception {
        // khai báo biến StringBuilder để tạo chuỗi Select
        StringBuilder query = new StringBuilder("SELECT * FROM " + TableName);
        // Đưa câu lệnh điều kiện vaò câu query
        this.AddCondition(query, Condition);
        // Đưa câu lệnh Order vào query
        this.AddOrderBy(query, OrderBy);
        // chèn ký tự ; vào cuồi các câu lệnh
        query.append(";");
        // thực thi câu lệnh query và trả kết quả
        return this.connect.excuteQuery(query.toString());
    }

    public ResultSet Select(String TableName, String Condition) throws Exception {
        return this.Select(TableName, Condition, null);
    }
    // Hàm over load Select giảm Condition  parameter

    public ResultSet Select(String TableName) throws Exception {
        return this.Select(TableName, null, null);
    }

    //Hàm thêm điều kiện vào query
    private void AddCondition(StringBuilder query, String Condition) {
        // kiểm tra nếu condition khác null
        if (Condition != null) {
            query.append(" WHERE " + Condition);
        }
    }

    // Hàm thêm OrderBy vào query
    private void AddOrderBy(StringBuilder query, String OrderBy) {
        // Kiểm tra OrderBy Khác null
        if (OrderBy != null) {
            query.append(" ORDER BY " + OrderBy);
        }
    }

    // Hàm hỗ trợ Insert xuống SQL
    public boolean Insert(String TableName, HashMap<String, Object> ColumnValues) throws Exception {
        // Khai báo biến StringBuilder để tạo chuỗi Select
        StringBuilder query = new StringBuilder("Insert Into " + TableName);
        // khai báo biến StringBuilder để tạo chuỗi Column Values
        StringBuilder valueInsert = new StringBuilder();

        query.append("(");
        // Duyệt và đưa thông tin tên cột và giá tri values vào
        for (String key : ColumnValues.keySet()) {
            query.append(key + ",");
            Object value = ColumnValues.get(key);
            if (value != null) {
                valueInsert.append("'" + value.toString() + "',");
            } else {
                valueInsert.append("NULL,");
            }
        }
        // cắt bỏ dấu , dư thừa
        query.deleteCharAt(query.length() - 1);
        valueInsert.deleteCharAt(valueInsert.length() - 1);

        // đưa giá trị của cột vào câu query
        query.append(") Values(" + valueInsert.toString() + ")");
        // chèn ký tự ; vào cuối dòng lệnh để cách câu
        query.append(";");
        System.out.println(query);
        // Thực thi câu query và trả kết quả ra ngoài
        return this.connect.executeUpdate(query.toString()) > 0;
    }

    // hàm hỗ trợ update CSDL
    public boolean Update(String TableName, HashMap<String, Object> ColumnValues, String Condition) throws Exception {
        // khai báo biến StringBuilder để tạo chuỗi CSDL
        StringBuilder query = new StringBuilder("Update " + TableName + " Set ");

        // Duyệt và đưa thông tin tên cột, giá trị
        for (String key : ColumnValues.keySet()) {
            query.append(key + " = '" + ColumnValues.get(key).toString() + "',");
        }
        // Cat981 bớt ký tự , cuối câu
        query = query.delete(query.length() - 1, query.length());
        // đưa câu lệnh điều kiện vào trong query
        this.AddCondition(query, Condition);
        // chèn ký tự ; vào cuồi dòng lệnh để cách các câu lệnh
        query.append(";");
        System.out.println(query);
        //thực thi và trả ra kết quả
        return this.connect.executeUpdate(query.toString()) > 0;
    }

    //Hàm delete hỗ trợ torng CDSL
    /**
     * Delete From TableName where Condition
     *
     * @throws Exception
     */
    public boolean Delete(String TableName, String Condition) throws Exception {
        // khai báo biến StringBuilder để tạo chuỗi Select
        StringBuilder query = new StringBuilder("Delete From " + TableName);
        // Đưa câu lệnh điều kiện vào query
        this.AddCondition(query, Condition);
        // chèn ký tự ; vào cuối dòng lệnh để ngăn cách các câu
        query.append(";");
        System.out.println(query);
        //thực thi và trả về giá trị
        return this.connect.executeUpdate(query.toString()) > 0;
    }

    // hàm đếm số cột trong CSDL
    public static int getColumnCount(ResultSet result) throws SQLException {
        return result.getMetaData().getColumnCount();
    }

    // hàm lấy tên cột trong  result  select từ CSDL
    public static String[] getColumnName(ResultSet result) throws SQLException {
        // lấy resultsetMetaDate từ Result
        ResultSetMetaData rsMetaData = (ResultSetMetaData) result.getMetaData();
        // lấy số lượng cột trong Result
        int ColumnCount = rsMetaData.getColumnCount();
        // khai báo danh sách các cột
        String[] list = new String[ColumnCount];
        for (int i = 0; i < ColumnCount; i++) {
            list[i] = rsMetaData.getColumnName(i);
        }
        return list;
    }

    // hàm đóng kết nối 
    public void Close() throws Exception {
        this.connect.Close();

    }

}
