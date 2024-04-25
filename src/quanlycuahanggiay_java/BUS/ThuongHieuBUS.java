/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlycuahanggiay_java.BUS;

import quanlycuahanggiay_java.DAO.ThuongHieuDAO;
import quanlycuahanggiay_java.DTO.ThuongHieu;
import java.util.ArrayList;

public class ThuongHieuBUS {

    private ArrayList<ThuongHieu> list_ThuongHieu;
    
    private ThuongHieuDAO THDAO;

    public ThuongHieuBUS() throws Exception {
        list_ThuongHieu = new ArrayList<>();
        THDAO = new ThuongHieuDAO();
        list_ThuongHieu = THDAO.docDB();
    }

    public ArrayList<ThuongHieu> getList_ThuongHieu() {
        return list_ThuongHieu;
    }

    public void setList_ThuongHieu(ArrayList<ThuongHieu> list_ThuongHieu) {
        this.list_ThuongHieu = list_ThuongHieu;
    }

    public int getNumbThuongHieu() {
        return list_ThuongHieu.size();
    }
}
