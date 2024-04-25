/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlycuahanggiay_java.BUS;

import quanlycuahanggiay_java.DTO.Loai;
import quanlycuahanggiay_java.DAO.LoaiDAO;
import java.util.ArrayList;

public class LoaiBUS {

    private ArrayList<Loai> list_Loai;

    private LoaiDAO LDAO;

    public LoaiBUS() throws Exception {
        list_Loai = new ArrayList<>();
        LDAO = new LoaiDAO();
        list_Loai = LDAO.docDB();
    }

    public ArrayList<Loai> getList_Loai() {
        return list_Loai;
    }

    public void setList_Loai(ArrayList<Loai> list_Loai) {
        this.list_Loai = list_Loai;
    }

    public int getNumbLoai() {
        return list_Loai.size();
    }
}
