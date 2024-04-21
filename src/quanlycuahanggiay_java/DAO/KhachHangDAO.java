/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlycuahanggiay_java.DAO;

import quanlycuahanggiay_java.DTO.KhachHang;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;


/**
 *
 * @author Admin
 */
public class KhachHangDAO {
    ConnectUnit connect;
    
    public ArrayList<KhachHang> docDB(String condition, String orderBy) throws Exception{
        connect = new ConnectUnit();
        
        ResultSet result = this.connect.Select("KHACHHANG", condition, orderBy);
        ArrayList<KhachHang> KH = new ArrayList<>();
        while(result.next()){
            
            KhachHang khachhang = new KhachHang();
            khachhang.setDiaChi(result.getString("DIACHI"));
            khachhang.setEmail(result.getString("EMAIL"));
            khachhang.setGioiTinh(result.getBoolean("GIOITINH"));
            khachhang.setHo(result.getNString("HO"));
            khachhang.setTen(result.getNString("TEN"));
            khachhang.setLoai(result.getNString("LOAI"));
            khachhang.setMaKH(result.getInt("MAKH"));
            khachhang.setTongChiTieu(result.getBigDecimal("TONGCHITIEU"));
            KH.add(khachhang);
            
        }
        
        connect.Close();
        return KH;
    }
    
        public ArrayList<KhachHang> docDB(String condition) throws Exception {
        return docDB(condition, null);
    }
    
    public ArrayList<KhachHangDTO> docDB() throws Exception {
        return docDB(null);
    }
    
    /**
     * Tạo thêm 1 khách hàng dựa theo đã có thông tin trước
     * @return true nếu thành công
     */
    public Boolean them(KhachHang kh) throws Exception {
        connect = new ConnectUnit();
        
        // tạo đối tượng truyền vào
        HashMap<String, Object> insertValues = new HashMap<>();
        insertValues.put("diachi", kh.getDiaChi());
        insertValues.put("Email", kh.getEmail());
        insertValues.put("GioiTinh", kh.isGioiTinh());
        insertValues.put("ho", kh.getHo());
        insertValues.put("loai", kh.getLoai());
        insertValues.put("makh", kh.getMaKH());
        insertValues.put("ten", kh.getTen());
        insertValues.put("tongchitieu", kh.getTongChiTieu());
        
        Boolean check = connect.Insert("KHACHHANG", insertValues);
        
        connect.Close();
        return check;
    }
    
 
    public Boolean xoa(KhachHang kh) throws Exception {
        connect = new ConnectUnit();
        String condition = " makh = '"+kh.getMaKH()+"'";
        
        Boolean check = connect.Delete("KHACHHANG", condition);
        
        connect.Close();
        return check;
    }
    
    
    public Boolean sua(KhachHang kh) throws Exception {
        connect = new ConnectUnit();
        
        // tạo đối tượng truyền vào
        HashMap<String, Object> insertValues = new HashMap<>();
        insertValues.put("diachi", kh.getDiaChi());
        insertValues.put("Email", kh.getEmail());
        insertValues.put("GioiTinh", kh.isGioiTinh());
        insertValues.put("ho", kh.getHo());
        insertValues.put("loai", kh.getLoai());
        insertValues.put("ten", kh.getTen());
        insertValues.put("tongchitieu", kh.getTongChiTieu());
        
        String condition = " MaKH = '"+kh.getMaKH()+"'";
        
        Boolean check = connect.Update("KHACHHANG", insertValues, condition);
        
        connect.Close();
        return check;
    }
}
