/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlycuahanggiay_java.DAO;
import quanlycuahanggiay_java.DTO.NhaCungCap;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Admin
 */
public class NhaCungCapDAO {
    ConnectUnit connect;
     
    /**
     * Lấy thông tin từ Database
     */
    public ArrayList<NhaCungCap> docDB(String condition, String orderBy) throws Exception {
        connect = new ConnectUnit();
        
        ResultSet result = this.connect.Select("NHACUNGCAP", condition, orderBy);
        ArrayList<NhaCungCap> nhaccs = new ArrayList<>();
        while ( result.next() ) {
            NhaCungCap nhacc = new NhaCungCap();
            nhacc.setMaNCC(result.getString("MANCC"));
            nhacc.setTenNCC(result.getString("TENNCC"));
            nhacc.setDiaChi(result.getString("DIACHI"));
            nhacc.setDienThoai(result.getString("DIENTHOAI"));
            nhaccs.add(nhacc);
        }
        connect.Close();
        return nhaccs;
    }
    
    public ArrayList<NhaCungCap> docDB(String condition) throws Exception {
        return docDB(condition, null);
    }
    
    public ArrayList<NhaCungCap> docDB() throws Exception {
        return docDB(null);
    }
    
   
    public Boolean them(NhaCungCap nv) throws Exception {
        connect = new ConnectUnit();
        
        HashMap<String, Object> insertValues = new HashMap<>();
        insertValues.put("mancc", nv.getMaNCC());
        insertValues.put("tenncc", nv.getTenNCC());
        insertValues.put("DiaChi", nv.getDiaChi());
        insertValues.put("DienThoai", nv.getDienThoai());
        
        Boolean check = connect.Insert("NHACUNGCAP", insertValues);
        
        connect.Close();
        return check;
    }
    
    /** 
     * @param nv truyền vào dữ liệu tài khoản để xóa
     * @return true nếu thành công
     */
    public Boolean xoa(NhaCungCap nv) throws Exception {
        connect = new ConnectUnit();
        String condition = " mancc = '"+nv.getMaNCC()+"'";
        
        Boolean check = connect.Delete("NHACUNGCAP", condition);
        
        connect.Close();
        return check;
    }
    
  
    public Boolean sua(NhaCungCap nv) throws Exception {
        connect = new ConnectUnit();
        
        // tạo đối tượng truyền vào
        HashMap<String, Object> insertValues = new HashMap<>();
        insertValues.put("tenncc", nv.getTenNCC());
        insertValues.put("DiaChi", nv.getDiaChi());
        insertValues.put("Email", nv.getDienThoai());
        
        String condition = " mancc = '"+nv.getMaNCC()+"'";
        
        Boolean check = connect.Update("NHACUNGCAP", insertValues, condition);
        
        connect.Close();
        return check;
    }
}
