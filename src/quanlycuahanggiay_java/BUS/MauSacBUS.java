/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlycuahanggiay_java.BUS;

import quanlycuahanggiay_java.DAO.MauSacDAO;
import quanlycuahanggiay_java.DTO.MauSac;
import java.util.ArrayList;


public class MauSacBUS {
  private ArrayList <MauSac> list_MauSac;
     
    private MauSacDAO MSDAO;
    
    public MauSacBUS() throws Exception {
        list_MauSac = new ArrayList<>();
        MSDAO = new MauSacDAO();
        list_MauSac = MSDAO.docDB();
    }

    public ArrayList<MauSac> getList_MauSac() {
        return list_MauSac;
    }

    public void setList_MauSac(ArrayList<MauSac> list_MauSac) {
        this.list_MauSac = list_MauSac;
    }
    public int getNumbMauSac() {
        return list_MauSac.size();
    }
}
