/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlycuahanggiay_java.BUS;

import quanlycuahanggiay_java.DAO.XuatXuDAO;
import quanlycuahanggiay_java.DTO.XuatXu;
import java.util.ArrayList;

public class XuatXuBUS {
    private ArrayList <XuatXu> list_XuatXu;
     /**
     * Xử lý các lệnh trong SQL
     */
    private XuatXuDAO XXDAO;
    
    public XuatXuBUS() throws Exception {
        list_XuatXu = new ArrayList<>();
        XXDAO = new XuatXuDAO();
        list_XuatXu = XXDAO.docDB();
    }

    public ArrayList<XuatXu> getList_XuatXu() {
        return list_XuatXu;
    }

    public void setList_XuatXu(ArrayList<XuatXu> list_XuatXu) {
        this.list_XuatXu = list_XuatXu;
    }

   
    public int getNumbXuatXu() {
        return list_XuatXu.size();
    }
}
