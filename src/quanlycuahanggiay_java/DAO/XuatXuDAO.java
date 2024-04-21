/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlycuahanggiay_java.DAO;
import quanlycuahanggiay_java.DTO.XuatXu;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author Admin
 */
public class XuatXuDAO {
      ConnectUnit connect;
    
    
    public ArrayList<XuatXu> docDB(String condition, String orderBy) throws Exception {
        // kết nối CSDL
        connect = new ConnectUnit();
        
        ResultSet result = this.connect.Select("tblxuatxu", condition, orderBy);
        ArrayList<XuatXu> xuatxus = new ArrayList<>();
        while ( result.next() ) {
            XuatXu xuatxu = new XuatXu();
            xuatxu.setStrMaxuatxu(result.getString("MAXX"));
            xuatxu.setStrTennuoc(result.getString("TENNUOC"));
            xuatxus.add(xuatxu);
        }
        connect.Close();
        return xuatxus;
    }
    
    public ArrayList<XuatXu> docDB(String condition) throws Exception {
        return docDB(condition, null);
    }
    
    public ArrayList<XuatXu> docDB() throws Exception {
        return docDB(null);
    }
}
