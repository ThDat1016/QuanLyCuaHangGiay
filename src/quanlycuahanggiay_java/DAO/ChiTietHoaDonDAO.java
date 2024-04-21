/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlycuahanggiay_java.DAO;

import quanlycuahanggiay_java.DTO.ChiTietHoaDon;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Admin
 */
public class ChiTietHoaDonDAO {
    ConnectUnit connect;
    
    
    public ArrayList<ChiTietHoaDon> docDB(String condition, String orderBy) throws Exception {
        connect = new ConnectUnit();
        
        ResultSet result = this.connect.Select("CHITIETHOADON", condition, orderBy);
        ArrayList<ChiTietHoaDon> CTHD = new ArrayList<>();
        while ( result.next() ) {
            ChiTietHoaDon hoadon = new ChiTietHoaDon();
            hoadon.setMaGiay(result.getInt("MAGIAY"));
            hoadon.setMaHD(result.getInt("MAHD"));
            hoadon.setGiaBan(result.getBigDecimal("GIABAN"));
            hoadon.setSoluong(result.getInt("SOLUONG"));
            
            CTHD.add(hoadon);
        }
        connect.Close();
        return CTHD;
    }
    
     public ArrayList<ChiTietHoaDon> docDB(String condition) throws Exception {
        return docDB(condition, null);
    }
    
    public ArrayList<ChiTietHoaDon> docDB() throws Exception {
        return docDB(null);
    }
    
    public Boolean them(ChiTietHoaDon hd) throws Exception {
        connect = new ConnectUnit();
        
        // tạo đối tượng truyền vào
        HashMap<String, Object> insertValues = new HashMap<>();
        insertValues.put("mahd", hd.getMaHD());
        insertValues.put("magiay", hd.getMaGiay());
        insertValues.put("soluong", hd.getSoluong());
        insertValues.put("giaban", hd.getGiaBan());
        
        Boolean check = connect.Insert("CHITIETHOADON", insertValues);
        
        connect.Close();
        return check;
    }
    
   public Boolean xoa(ChiTietHoaDon hd) throws Exception {
        connect = new ConnectUnit();
        String condition = " mahd = '"+hd.getMaHD()+"' && magiay = '"+hd.getMaGiay()+"'";
        
        Boolean check = connect.Delete("tblchitiethd", condition);
        
        connect.Close();
        return check;
    }
    
    /**
     * @param hd truyền vào dữ liệu hdách hàng mới
     * Sửa thông tin đăng nhập hoặc là cấp bậc của 1 hdách hàng
     * @return true nếu thành công
     */
    public Boolean sua(ChiTietHoaDon hd) throws Exception {
        connect = new ConnectUnit();
        
        // tạo đối tượng truyền vào
        HashMap<String, Object> insertValues = new HashMap<>();
        insertValues.put("soluong", hd.getSoluong());
        insertValues.put("giaban", hd.getGiaBan());
        
        String condition = " mahd = '"+hd.getMaHD()+"' && magiay = '"+hd.getMaGiay()+"'";
        
        Boolean check = connect.Update("tblchitiethd", insertValues, condition);
        
        connect.Close();
        return check;
    }
}
