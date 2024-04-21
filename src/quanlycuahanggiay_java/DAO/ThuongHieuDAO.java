/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlycuahanggiay_java.DAO;

import quanlycuahanggiay_java.DTO.ThuongHieu;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author Admin
 */
public class ThuongHieuDAO {
    
    ConnectUnit connect;
    public ArrayList<ThuongHieu> docDB(String Condition, String orderBy) throws Exception{
        //Ket noi db
        connect = new ConnectUnit();
        
        ResultSet result  = this.connect.Select("THUONGHIEU", Condition, orderBy);
        ArrayList<ThuongHieu> thuongHieu = new ArrayList<>();
        
        while (result.next()){
            ThuongHieu thuonghieu = new ThuongHieu();
            thuonghieu.setMaThuongHieu(result.getString("MATHUONGHIEU"));
            thuonghieu.setTenThuongHieu(result.getString("TENTHUONGHIEU"));
            thuonghieu.setDiaChi(result.getString("DIACHI"));
            thuonghieu.setEmail(result.getString("EMAIL"));
            thuongHieu.add(thuonghieu);
        }
        connect.Close();
        return thuongHieu;
    }
     public ArrayList<ThuongHieu> docDB(String condition) throws Exception {
        return docDB(condition, null);
    }
    
    public ArrayList<ThuongHieu> docDB() throws Exception {
        return docDB(null);
    }
    
    public static void main(String args[]) {
    ThuongHieuDAO thuongHieuDAO = new ThuongHieuDAO();
    try {
        // Gọi phương thức docDB để lấy danh sách thương hiệu từ cơ sở dữ liệu
        ArrayList<ThuongHieu> danhSachThuongHieu = thuongHieuDAO.docDB();

        // Duyệt qua danh sách và xuất thông tin
        for (ThuongHieu thuongHieu : danhSachThuongHieu) {
            System.out.println("Mã thương hiệu: " + thuongHieu.getMaThuongHieu());
            System.out.println("Tên thương hiệu: " + thuongHieu.getTenThuongHieu());
            System.out.println("Địa chỉ: " + thuongHieu.getDiaChi());
            System.out.println("Email: " + thuongHieu.getEmail());
            System.out.println("-----------------------------------");
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
}

}
