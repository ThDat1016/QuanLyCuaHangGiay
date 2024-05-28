/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlycuahanggiay_java.DAO;


import quanlycuahanggiay_java.DTO.ChiTietPhieuNhap;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
/**
 *
 * @author Admin
 */
public class ChiTietPNDAO {
    ConnectUnit connect;
    
    public ArrayList<ChiTietPhieuNhap> docDB(String condition, String orderBy) throws Exception{
        connect = new ConnectUnit();
        
        ResultSet result = this.connect.Select("CHITIETPHIEUNHAP", condition, orderBy);
        ArrayList<ChiTietPhieuNhap> CTPN = new ArrayList<>();
        
        
        while(result.next()){
            ChiTietPhieuNhap phieunhap = new ChiTietPhieuNhap();
            //phieunhap.setMaGiay(result.getInt("MAGIAY"));
            phieunhap.getGiay().setStrMaGiay(result.getInt("MAGIAY"));
            phieunhap.setMaPN(result.getInt("MAPN"));
            phieunhap.getGiay().setiSoLuong(result.getInt("SOLUONG"));
            phieunhap.setGiaNhap(result.getBigDecimal("GIANHAP"));
            CTPN.add(phieunhap);
        }
         connect.Close();
        return CTPN;
    }
     public ArrayList<ChiTietPhieuNhap> docDB(String condition) throws Exception {
        return docDB(condition, null);
    }
    
    public ArrayList<ChiTietPhieuNhap> docDB() throws Exception {
        return docDB(null);
    }
    
    
    public Boolean them(ChiTietPhieuNhap pn) throws Exception {
        connect = new ConnectUnit();
        
        // tạo đối tượng truyền vào
        HashMap<String, Object> insertValues = new HashMap<>();
        insertValues.put("mapn", pn.getMaPN());
        insertValues.put("magiay", pn.getGiay().getStrMaGiay());
        insertValues.put("soluong", pn.getGiay().getiSoLuong());
        insertValues.put("gianhap", pn.getGiaNhap());
        
        Boolean check = connect.Insert("CHITIETPHIEUNHAP", insertValues);
        
        connect.Close();
        return check;
    }
    
    
    public Boolean xoa(ChiTietPhieuNhap pn) throws Exception {
        connect = new ConnectUnit();
        String condition = " mapn = '"+pn.getMaPN()+"' && magiay = '"+pn.getGiay().getStrMaGiay()+"'";
        
        Boolean check = connect.Delete("CHITIETPHIEUNHAP", condition);
        
        connect.Close();
        return check;
    }
    
    public Boolean sua(ChiTietPhieuNhap pn) throws Exception {
        connect = new ConnectUnit();
        
        // tạo đối tượng truyền vào
        HashMap<String, Object> insertValues = new HashMap<>();
        insertValues.put("soluong", pn.getGiay().getiSoLuong());
        insertValues.put("gianhap", pn.getGiaNhap());
        
        String condition = " mapn = '"+pn.getMaPN()+"' && magiay = '"+pn.getGiay().getStrMaGiay()+"'";
        
        Boolean check = connect.Update("CHITIETPHIEUNHAP", insertValues, condition);
        
        connect.Close();
        return check;
    }
    

}
