/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlycuahanggiay_java.DAO;

import quanlycuahanggiay_java.DTO.Giay;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Admin
 */
public class GiayDAO {

    ConnectUnit connect;

    public ArrayList<Giay> docDB(String condition, String orderBy) throws Exception {
        // kết nối CSDL
        connect = new ConnectUnit();

        ResultSet result = this.connect.Select("GIAY", condition, orderBy);
        ArrayList<Giay> sanphams = new ArrayList<>();
        while (result.next()) {
            Giay sanpham = new Giay();
            sanpham.setStrMaGiay(result.getInt("MAGIAY"));
            sanpham.setStrChatLieu(result.getString("CHATLIEU"));
            sanpham.setStrDoiTuongSD(result.getBoolean("DOITUONGSD"));
            sanpham.setStrMaLoai(result.getString("MALOAI"));
            sanpham.setStrMaMau(result.getString("MAMAU"));
            sanpham.setStrMaThuongHieu(result.getString("MATHUONGHIEU"));
            sanpham.setStrMaxx(result.getString("MAXX"));
            sanpham.setStrTenGiay(result.getString("TENGIAY"));
            sanpham.setiGia(result.getBigDecimal("DONGIA"));
            sanpham.setiSize(result.getInt("SIZE"));
            sanpham.setiSoLuong(result.getInt("SOLUONG"));

            sanphams.add(sanpham);
        }
        connect.Close();
        return sanphams;
    }

    public ArrayList<Giay> docDB(String condition) throws Exception {
        return docDB(condition, null);
    }

    public ArrayList<Giay> docDB() throws Exception {
        return docDB(null);
    }

    public Boolean them(Giay hd) throws Exception {
        connect = new ConnectUnit();

        // tạo đối tượng truyền vào
        HashMap<String, Object> insertValues = new HashMap<>();
        insertValues.put("SOLUONG", hd.getiSoLuong());
        insertValues.put("DONGIA", hd.getiGia());
        insertValues.put("SIZE", hd.getiSize());
        insertValues.put("CHATLIEU", hd.getStrChatLieu());
        insertValues.put("DOITUONGSD", hd.getStrDoiTuongSD());
        insertValues.put("MALOAI", hd.getStrMaLoai());
        insertValues.put("MAMAU", hd.getStrMaMau());
        insertValues.put("MATHUONGHIEU", hd.getStrMaThuongHieu());
        insertValues.put("MAXX", hd.getStrMaxx());
        insertValues.put("TENGIAY", hd.getStrTenGiay());

        Boolean check = connect.Insert("GIAY", insertValues);

        connect.Close();
        return check;
    }

    /**
     * @param hd chuyền vào dữ liệu hdách hàng để xóa
     * @return true nếu thành công
     */
    public Boolean xoa(Giay hd) throws Exception {
        connect = new ConnectUnit();
        String condition = " magiay = '" + hd.getStrMaGiay() + "'";

        Boolean check = connect.Delete("GIAY", condition);

        connect.Close();
        return check;
    }

    public Boolean sua(Giay hd) throws Exception {
        connect = new ConnectUnit();

        // tạo đối tượng truyền vào
        HashMap<String, Object> insertValues = new HashMap<>();
        insertValues.put("soluong", hd.getiSoLuong());
        insertValues.put("gia", hd.getiGia());
        insertValues.put("size", hd.getiSize());
        insertValues.put("chatlieu", hd.getStrChatLieu());
        insertValues.put("doituongsd", hd.getStrDoiTuongSD());
        insertValues.put("maloai", hd.getStrMaLoai());
        insertValues.put("mamau", hd.getStrMaMau());
        insertValues.put("mathuonghieu", hd.getStrMaThuongHieu());
        insertValues.put("maxx", hd.getStrMaxx());
        insertValues.put("tengiay", hd.getStrTenGiay());

        System.out.println(hd.toString());

        String condition = " magiay = '" + hd.getStrMaGiay() + "'";

        Boolean check = connect.Update("GIAY", insertValues, condition);

        connect.Close();
        return check;
    }
}
