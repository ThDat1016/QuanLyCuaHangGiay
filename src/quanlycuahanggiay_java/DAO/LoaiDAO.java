/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlycuahanggiay_java.DAO;


import quanlycuahanggiay_java.DTO.Loai;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
 
public class LoaiDAO {
     ConnectUnit connect;
    
    
    public ArrayList<Loai> docDB(String condition, String orderBy) throws Exception {
        // kết nối CSDL
        connect = new ConnectUnit();
        
        ResultSet result = this.connect.Select("tblloai", condition, orderBy);
        ArrayList<Loai> loais = new ArrayList<>();
        while ( result.next() ) {
            Loai loai = new Loai();
            loai.setMaLoai(result.getString("MALOAI"));
            loai.setTenLoai(result.getString("TENLOAI"));
            loais.add(loai);
        }
        connect.Close();
        return loais;
    }
    
    public ArrayList<Loai> docDB(String condition) throws Exception {
        return docDB(condition, null);
    }
    
    public ArrayList<Loai> docDB() throws Exception {
        return docDB(null);
    }
}
