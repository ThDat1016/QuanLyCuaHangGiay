/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlycuahanggiay_java.DAO;

import quanlycuahanggiay_java.DTO.ChuongTrinhKhuyenMai;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Admin
 */
public class ChuongTrinhKhuyenMaiDAO {
    ConnectUnit connect;
    
    
    public ArrayList<ChuongTrinhKhuyenMai> docDB(String condition, String orderBy) throws Exception {
        // kết nối CSDL
        connect = new ConnectUnit();
        
        ResultSet result = this.connect.Select("CHUONGTRINHKHUYENMAI", condition, orderBy);
        ArrayList<ChuongTrinhKhuyenMai> khuyenmais = new ArrayList<>();
        while ( result.next() ) {
            ChuongTrinhKhuyenMai khuyenmai = new ChuongTrinhKhuyenMai();
            khuyenmai.setDieuKien(result.getString("DieuKien"));
            khuyenmai.setLoaiChuongTrinh(result.getString("LoaiChuongtrinh"));
            khuyenmai.setMaKM(result.getInt("MaKM"));
            khuyenmai.setNgayBatDau(result.getDate("Ngaybatdau"));
            khuyenmai.setNgayKetThuc(result.getDate("ngayketthuc"));
            khuyenmai.setTenChuongTrinh(result.getString("tenchuongtrinh"));
            
            khuyenmais.add(khuyenmai);
        }
        connect.Close();
        return khuyenmais;
    }
    
    public ArrayList<ChuongTrinhKhuyenMai> docDB(String condition) throws Exception {
        return docDB(condition, null);
    }
    
    public ArrayList<ChuongTrinhKhuyenMai> docDB() throws Exception {
        return docDB(null);
    }
    
    
    public Boolean them(ChuongTrinhKhuyenMai km) throws Exception {
        connect = new ConnectUnit();
        
        // tạo đối tượng truyền vào
        HashMap<String, Object> insertValues = new HashMap<>();
        insertValues.put("dieukien", km.getDieuKien());
        insertValues.put("loaichuongtrinh", km.getLoaiChuongTrinh());
        insertValues.put("makm", km.getMaKM());
        insertValues.put("ngaybatdau", km.getNgayBatDau());
        insertValues.put("ngayketthuc", km.getNgayKetThuc());
        insertValues.put("tenchuongtrinh", km.getTenChuongTrinh());
        
        Boolean check = connect.Insert("CHUONGTRINHKHUYENMAI", insertValues);
        
        connect.Close();
        return check;
    }
    
    
    public Boolean xoa(ChuongTrinhKhuyenMai km) throws Exception {
        connect = new ConnectUnit();
        String condition = " makm = '"+km.getMaKM()+"'";
        
        Boolean check = connect.Delete("CHUONGTRINHKHUYENMAI", condition);
        
        connect.Close();
        return check;
    }
    
 
    public Boolean sua(ChuongTrinhKhuyenMai km) throws Exception {
        connect = new ConnectUnit();
        
        // tạo đối tượng truyền vào
        HashMap<String, Object> insertValues = new HashMap<>();
        insertValues.put("dieukien", km.getDieuKien());
        insertValues.put("loaichuongtrinh", km.getLoaiChuongTrinh());
        insertValues.put("ngaybatdau", km.getNgayBatDau());
        insertValues.put("ngayketthuc", km.getNgayKetThuc());
        insertValues.put("tenchuongtrinh", km.getTenChuongTrinh());
        
        String condition = " MaKM = '"+km.getMaKM()+"'";
        
        Boolean check = connect.Update("CHUONGTRINHKHUYENMAI", insertValues, condition);
        
        connect.Close();
        return check;
    }
}
