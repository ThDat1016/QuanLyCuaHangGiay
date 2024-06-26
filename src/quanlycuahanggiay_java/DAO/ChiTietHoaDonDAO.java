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
            hoadon.getGiay().setStrMaGiay(result.getInt("MAGIAY"));
            hoadon.getHd().setMaHD(result.getInt("MAHD"));
            hoadon.getGiay().setiGia(result.getBigDecimal("GIABAN"));
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
        insertValues.put("mahd", hd.getHd().getMaHD());
        insertValues.put("magiay", hd.getGiay().getStrMaGiay());
        insertValues.put("soluong", hd.getSoluong());
        insertValues.put("giaban", hd.getGiaBan());
        
        Boolean check = connect.Insert("CHITIETHOADON", insertValues);
        
        connect.Close();
        return check;
    }
    
   public Boolean xoa(ChiTietHoaDon hd) throws Exception {
        connect = new ConnectUnit();
        String condition = " mahd = '"+hd.getHd().getMaHD()+"' && magiay = '"+hd.getGiay().getStrMaGiay()+"'";
        
        Boolean check = connect.Delete("CHITIETHOADON", condition);
        
        connect.Close();
        return check;
    }
    
  
    public Boolean sua(ChiTietHoaDon hd) throws Exception {
        connect = new ConnectUnit();
        
        // tạo đối tượng truyền vào
        HashMap<String, Object> insertValues = new HashMap<>();
        insertValues.put("soluong", hd.getSoluong());
        insertValues.put("giaban", hd.getGiaBan());
        
        String condition = " mahd = '"+hd.getHd().getMaHD()+"' && magiay = '"+hd.getGiay().getStrMaGiay()+"'";
        
        Boolean check = connect.Update("CHITIETHOADON", insertValues, condition);
        
        connect.Close();
        return check;
    }
}
