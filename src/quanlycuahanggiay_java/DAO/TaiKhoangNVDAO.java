/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlycuahanggiay_java.DAO;
import quanlycuahanggiay_java.DTO.TaiKhoangNV;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
/**
 *
 * @author Admin
 */
public class TaiKhoangNVDAO {
     ConnectUnit connect;
     
    /**
     * Lấy thông tin từ Database
     */
    public ArrayList<TaiKhoangNV> docDB(String condition, String orderBy) throws Exception {
        // kết nối CSDL
        connect = new ConnectUnit();
        
        ResultSet result = this.connect.Select("TAIKHOANNV", condition, orderBy);
        ArrayList<TaiKhoangNV> taikhoans = new ArrayList<>();
        while ( result.next() ) {
            TaiKhoangNV taikhoang = new TaiKhoangNV();
            taikhoang.getNv().setMaNV(result.getInt("MANV"));
            taikhoang.setMatKhau(result.getString("MATKHAU"));
            taikhoang.getNv().setChucVu( result.getString("CAPBAC") );
            taikhoans.add(taikhoang);
        }
        connect.Close();
        return taikhoans;
    }
    
    public ArrayList<TaiKhoangNV> docDB(String condition) throws Exception {
        return docDB(condition, null);
    }
    
    public ArrayList<TaiKhoangNV> docDB() throws Exception {
        return docDB(null);
    }
    
    /**
     * Tạo thêm 1 tài khoản dựa theo đã có thông tin trước
     * @return true nếu thành công
     */
    public Boolean them(TaiKhoangNV tk) throws Exception {
        connect = new ConnectUnit();
        
        // tạo đối tượng truyền vào
        HashMap<String, Object> insertValues = new HashMap<>();
        insertValues.put("tendangnhap", tk.getNv().getMaNV());
        insertValues.put("matkhau", tk.getMatKhau());
        insertValues.put("capbac", tk.getNv().getChucVu());
        
        Boolean check = connect.Insert("TAIKHOANNV", insertValues);
        
        connect.Close();
        return check;
    }
    
    /** 
     * @param tk chuyền vào dữ liệu tài khoản để xóa
     * @return true nếu thành công
     */
    public Boolean xoa(TaiKhoangNV tk) throws Exception {
        connect = new ConnectUnit();
        String condition = " tendangnhap = '"+tk.getNv().getMaNV()+"'";
        
        Boolean check = connect.Delete("TAIKHOANNV", condition);
        
        connect.Close();
        return check;
    }
    
    /**
     * @param tk truyền vào dữ liệu tài khoản mới
     * Sửa thông tin đăng nhập hoặc là cấp bậc của 1 tài khoản
     * @return true nếu thành công
     */
    public Boolean sua(TaiKhoangNV tk) throws Exception {
        connect = new ConnectUnit();
        
        // tạo đối tượng truyền vào
        HashMap<String, Object> insertValues = new HashMap<>();
        insertValues.put("matkhau", tk.getNv().getMaNV());
        insertValues.put("capbac", tk.getNv().getChucVu());
        
        String condition = " tendangnhap = '"+tk.getNv().getMaNV()+"'";
        
        Boolean check = connect.Update("TAIKHOANNV", insertValues, condition);
        
        connect.Close();
        return check;
    }
}
