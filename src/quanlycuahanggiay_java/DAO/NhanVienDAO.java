/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlycuahanggiay_java.DAO;
import quanlycuahanggiay_java.DTO.NhanVien;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
/**
 *
 * @author Admin
 */
public class NhanVienDAO {
         ConnectUnit connect;
  
    public ArrayList<NhanVien> docDB(String condition, String orderBy) throws Exception {
        // kết nối CSDL
        connect = new ConnectUnit();
        
        ResultSet result = this.connect.Select("NHANVIEN", condition, orderBy);
        ArrayList<NhanVien> nhanviens = new ArrayList<>();
        while ( result.next() ) {
            NhanVien nhanvien = new NhanVien();
            nhanvien.setMaNV(result.getInt("MANV") );
            nhanvien.setLuong(result.getBigDecimal("LUONG"));
            nhanvien.setDienThoai(result.getString("DIENTHOAI"));
            nhanvien.setChucVu(result.getString("CHUCVU"));
            nhanvien.setDiaChi(result.getString("DIACHI"));
            nhanvien.setEmail(result.getString("EMAIL"));
            nhanvien.setGioiTinh(result.getBoolean("GIOITINH"));
            nhanvien.setHo(result.getString("HO"));
            nhanvien.setTen(result.getString("TEN"));
            nhanviens.add(nhanvien);
        }
        connect.Close();
        return nhanviens;
    }
    
    public ArrayList<NhanVien> docDB(String condition) throws Exception {
        return docDB(condition, null);
    }
    
    public ArrayList<NhanVien> docDB() throws Exception {
        return docDB(null);
    }
    
  
    public Boolean them(NhanVien nv) throws Exception {
        connect = new ConnectUnit();
        
        // tạo đối tượng truyền vào
        HashMap<String, Object> insertValues = new HashMap<>();
        insertValues.put("MaNV", nv.getMaNV());
        insertValues.put("Ho", nv.getHo());
        insertValues.put("Ten", nv.getTen());
        insertValues.put("GioiTinh", nv.isGioiTinh());
        insertValues.put("DiaChi", nv.getDiaChi());
        insertValues.put("DienThoai", nv.getDienThoai());
        insertValues.put("Email", nv.getEmail());
        insertValues.put("Luong", nv.getLuong());
        
        Boolean check = connect.Insert("NHANVIEN", insertValues);
        
        connect.Close();
        return check;
    }
    
    
    public Boolean xoa(NhanVien nv) throws Exception {
        connect = new ConnectUnit();
        String condition = " tendangnhap = '"+nv.getMaNV()+"'";
        
        Boolean check = connect.Delete("NHANVIEN", condition);
        
        connect.Close();
        return check;
    }
    
   
    public Boolean sua(NhanVien nv) throws Exception {
        connect = new ConnectUnit();
        
        // tạo đối tượng truyền vào
        HashMap<String, Object> insertValues = new HashMap<>();
        insertValues.put("Ho", nv.getHo());
        insertValues.put("Ten", nv.getTen());
        insertValues.put("GioiTinh", nv.isGioiTinh());
        insertValues.put("DiaChi", nv.getDiaChi());
        insertValues.put("DienThoai", nv.getDienThoai());
        insertValues.put("Email", nv.getEmail());
        insertValues.put("Luong", nv.getLuong());
        
        String condition = " tendangnhap = '"+nv.getMaNV()+"'";
        
        Boolean check = connect.Update("NHANVIEN", insertValues, condition);
        
        connect.Close();
        return check;
    }
}
