/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlycuahanggiay_java.DAO;
import quanlycuahanggiay_java.DTO.MauSac;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author Admin
 */
public class MauSacDAO {
     ConnectUnit connect;
    
    /**
     * Lấy thông tin từ Database
     */
    public ArrayList<MauSac> docDB(String condition, String orderBy) throws Exception {
        // kết nối CSDL
        connect = new ConnectUnit();
        
        ResultSet result = this.connect.Select("MAUSAC", condition, orderBy);
        ArrayList<MauSac> mausacs = new ArrayList<>();
        while ( result.next() ) {
            MauSac mausac = new MauSac();
            mausac.setMaMau(result.getString("MAMAU"));
            mausac.setTenMau(result.getString("TENMAU"));
            mausacs.add(mausac);
        }
        connect.Close();
        return mausacs;
    }
    
    public ArrayList<MauSac> docDB(String condition) throws Exception {
        return docDB(condition, null);
    }
    
    public ArrayList<MauSac> docDB() throws Exception {
        return docDB(null);
    }
}
