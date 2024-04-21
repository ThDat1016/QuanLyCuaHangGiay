/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlycuahanggiay_java.DAO;
import quanlycuahanggiay_java.DTO.HoaDon;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Admin
 */
public class HoaDonDAO {
    ConnectUnit connect;
    
    public ArrayList<HoaDon> docDB(String condition, String orderBy) throws Exception{
        connect = new ConnectUnit();
        ResultSet result = this.connect.Select("HOADON", condition, orderBy);
        ArrayList<HoaDon> hoadon = new ArrayList<>();
        while(result.next()){
            HoaDon hd = new HoaDon();
            hd.setMaHD(result.getInt("MAHD"));
            hd.setMaKH(result.getInt("MAKH"));
            hd.setMaKM(result.getInt("MAKM"));
            hd.setMaNV(result.getInt("MANV"));
            hd.setNgayBan(result.getDate("NGAYBAN"));
            hd.setThue(result.getFloat("THUE"));
            hd.setTongTien(result.getBigDecimal("TONGTIEN"));
            hoadon.add(hd);
        }
        
        connect.Close();
        return hoadon;
    }
    
    public ArrayList<HoaDon> docDB(String condition) throws Exception {
        return docDB(condition, null);
    }
    
    public ArrayList<HoaDon> docDB() throws Exception {
        return docDB(null);
    }
    
    
     public Boolean them(HoaDon hd) throws Exception {
        connect = new ConnectUnit();
        
        // tạo đối tượng truyền vào
        HashMap<String, Object> insertValues = new HashMap<>();
        insertValues.put("mahd", hd.getMaHD());
        insertValues.put("makh", hd.getMaKH());
        insertValues.put("makm", hd.getMaKM());
        insertValues.put("manv", hd.getMaNV());
        insertValues.put("ngayban", hd.getNgayBan());
        insertValues.put("tongtien", hd.getTongTien());
        
        Boolean check = connect.Insert("tblhoadon", insertValues);
        
        connect.Close();
        return check;
    }
    
    /** 
     * @param hd chuyền vào dữ liệu hdách hàng để xóa
     * @return true nếu thành công
     */
    public Boolean xoa(HoaDon hd) throws Exception {
        connect = new ConnectUnit();
        String condition = " mahd = '"+hd.getMaHD()+"'";
        
        Boolean check = connect.Delete("tblhoadon", condition);
        
        connect.Close();
        return check;
    }
    
    /**
     * @param hd truyền vào dữ liệu hdách hàng mới
     * Sửa thông tin đăng nhập hoặc là cấp bậc của 1 hdách hàng
     * @return true nếu thành công
     */
    public Boolean sua(HoaDon hd) throws Exception {
        connect = new ConnectUnit();
        
        // tạo đối tượng truyền vào
        HashMap<String, Object> insertValues = new HashMap<>();
        insertValues.put("makh", hd.getMaKH());
        insertValues.put("makm", hd.getMaKM());
        insertValues.put("manv", hd.getMaNV());
        insertValues.put("ngayban", hd.getNgayBan());
        insertValues.put("tongtien", hd.getTongTien());
        
        String condition = " MaHD = '"+hd.getMaHD()+"'";
        
        Boolean check = connect.Update("tblhoadon", insertValues, condition);
        
        connect.Close();
        return check;
    }
    
}
