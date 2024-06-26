/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlycuahanggiay_java.DAO;


import quanlycuahanggiay_java.DTO.ChiTietChuongTrinhKhuyenMai;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
/**
 *
 * @author Admin
 */
public class ChiThietKhuyenMaiDAO {
    ConnectUnit connect;
    
    
    public ArrayList<ChiTietChuongTrinhKhuyenMai> docDB(String condition, String orderBy) throws Exception {
        // kết nối CSDL
        connect = new ConnectUnit();
        
        ResultSet result = this.connect.Select("CHITIETCHUONGTRINHKHUYENMAI", condition, orderBy);
        ArrayList<ChiTietChuongTrinhKhuyenMai> KM = new ArrayList<>();
        while ( result.next() ) {
            ChiTietChuongTrinhKhuyenMai khuyenmai = new ChiTietChuongTrinhKhuyenMai();
            khuyenmai.getGiay().setStrMaGiay(result.getInt("MAGIAY"));
            khuyenmai.getKm().setMaKM(result.getString("MAKM"));
            khuyenmai.setTileKM(result.getFloat("TILEKM"));
            KM.add(khuyenmai);
        }
        connect.Close();
        return KM;
    }
    
    public ArrayList<ChiTietChuongTrinhKhuyenMai> docDB(String condition) throws Exception {
        return docDB(condition, null);
    }
    
    public ArrayList<ChiTietChuongTrinhKhuyenMai> docDB() throws Exception {
        return docDB(null);
    }
    
    /**
     * Tạo thêm 1 khách hàng dựa theo đã có thông tin trước
     * @return true nếu thành công
     */
    public Boolean them(ChiTietChuongTrinhKhuyenMai hd) throws Exception {
        connect = new ConnectUnit();
        
        // tạo đối tượng truyền vào
        HashMap<String, Object> insertValues = new HashMap<>();
        insertValues.put("makm", hd.getKm().getMaKM());
        insertValues.put("magiay", hd.getGiay().getStrMaGiay());
        insertValues.put("tilekm", hd.getTiLeKM());
        
        Boolean check = connect.Insert("CHITIETCHUONGTRINHKHUYENMAI", insertValues);
        
        connect.Close();
        return check;
    }
    
   
    public Boolean xoa(ChiTietChuongTrinhKhuyenMai hd) throws Exception {
        connect = new ConnectUnit();
        String condition = " makm = '"+hd.getKm().getMaKM()+"' && magiay = '"+hd.getGiay().getStrMaGiay()+"'";
        
        Boolean check = connect.Delete("CHITIETCHUONGTRINHKHUYENMAI", condition);
        
        connect.Close();
        return check;
    }
    
   
    public Boolean sua(ChiTietChuongTrinhKhuyenMai hd) throws Exception {
        connect = new ConnectUnit();
        
        // tạo đối tượng truyền vào
        HashMap<String, Object> insertValues = new HashMap<>();
        insertValues.put("magiay", hd.getGiay().getStrMaGiay());
        insertValues.put("tilekm", hd.getTiLeKM());
        
        String condition = " makm = '"+hd.getKm().getMaKM()+"' && magiay = '"+hd.getGiay().getStrMaGiay()+"'";
        
        Boolean check = connect.Update("CHITIETCHUONGTRINHKHUYENMAI", insertValues, condition);
        
        connect.Close();
        return check;
    }
}
