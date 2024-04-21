/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlycuahanggiay_java.DAO;
import quanlycuahanggiay_java.DTO.PhieuNhap;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
/**
 *
 * @author Admin
 */
public class PhieuNhapDAO {
       ConnectUnit connect;
     
    /**
     * Lấy thông tin từ Database
     */
    public ArrayList<PhieuNhap> docDB(String condition, String orderBy) throws Exception {
        // kết nối CSDL
        connect = new ConnectUnit();
        
        ResultSet result = this.connect.Select("PHIEUNHAP", condition, orderBy);
        ArrayList<PhieuNhap> nhaccs = new ArrayList<>();
        while ( result.next() ) {
            PhieuNhap nhacc = new PhieuNhap();
            nhacc.setMaPN(result.getInt("MAPN"));
            nhacc.setMaNCC(result.getString("MANCC"));
            nhacc.setMaNV(result.getInt("MANV"));
            nhacc.setNgayNhap(result.getDate("NGAYNHAP"));
            nhacc.setTongTien(result.getBigDecimal("TONGTIEN"));
            nhaccs.add(nhacc);
        }
        connect.Close();
        return nhaccs;
    }
    
    public ArrayList<PhieuNhap> docDB(String condition) throws Exception {
        return docDB(condition, null);
    }
    
    public ArrayList<PhieuNhap> docDB() throws Exception {
        return docDB(null);
    }
    
    
    public Boolean them(PhieuNhap nv) throws Exception {
        connect = new ConnectUnit();
        
        // tạo đối tượng truyền vào
        HashMap<String, Object> insertValues = new HashMap<>();
        insertValues.put("mancc", nv.getMaNCC());
        insertValues.put("manv", nv.getMaNV());
        insertValues.put("mapn", nv.getMaPN());
        insertValues.put("ngaynhap", nv.getNgayNhap());
        insertValues.put("tongtien", nv.getTongTien());
        
        Boolean check = connect.Insert("PHIEUNHAP", insertValues);
        
        connect.Close();
        return check;
    }
    
   
    public Boolean xoa(PhieuNhap nv) throws Exception {
        connect = new ConnectUnit();
        String condition = " mapn = '"+nv.getMaPN()+"'";
        
        Boolean check = connect.Delete("PHIEUNHAP", condition);
        
        connect.Close();
        return check;
    }
    
   
    public Boolean sua(PhieuNhap nv) throws Exception {
        connect = new ConnectUnit();
        
        // tạo đối tượng truyền vào
        HashMap<String, Object> insertValues = new HashMap<>();
        insertValues.put("mancc", nv.getMaNCC());
        insertValues.put("manv", nv.getMaNV());
        insertValues.put("ngaynhap", nv.getNgayNhap());
        insertValues.put("tongtien", nv.getTongTien());
        
        String condition = " mapn = '"+nv.getMaPN()+"'";
        
        Boolean check = connect.Update("PHIEUNHAP", insertValues, condition);
        
        connect.Close();
        return check;
    }
}
