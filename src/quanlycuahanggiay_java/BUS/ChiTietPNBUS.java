/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlycuahanggiay_java.BUS;

import quanlycuahanggiay_java.DTO.ChiTietPhieuNhap;
import quanlycuahanggiay_java.DAO.ChiTietPNDAO;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Admin
 */
public class ChiTietPNBUS {

    private ArrayList<ChiTietPhieuNhap> list_PN;
    private ChiTietPNDAO pnDAO;
    
     public void docDB() throws Exception {
        list_PN = new ArrayList<>();
        pnDAO = new ChiTietPNDAO();
        list_PN = pnDAO.docDB();
    }
     
     public void add(ChiTietPhieuNhap pn) {
        list_PN.add(pn);
    }
    public void deleteAll() {
        list_PN.removeAll(list_PN);
    }
     public ChiTietPNBUS() throws Exception {
        list_PN = new ArrayList<>();
        pnDAO = new ChiTietPNDAO();
        list_PN = pnDAO.docDB();
    }

    public ArrayList<ChiTietPhieuNhap> getList_PN() {
        return list_PN;
    }

    public void setList_PN(ArrayList<ChiTietPhieuNhap> list_PN) {
        this.list_PN = list_PN;
    }
    
    public ChiTietPNDAO getHdDAO() {
        return pnDAO;
    }

    public void setHdDAO(ChiTietPNDAO pnDAO) {
        this.pnDAO = pnDAO;
    }
    
    public int getNumbChiTietPN() {
        return list_PN.size();
    }
    
       public ChiTietPhieuNhap getInfor(int i){
        int iCount =0;
        for (ChiTietPhieuNhap pn : list_PN) {
            if (iCount == i)
                return pn;
            iCount++;
        }
        return null;
    }

    public ArrayList<ChiTietPhieuNhap> timKiem_MaSP(int MaSP1, int MaSP2) {
        ArrayList<ChiTietPhieuNhap> arr = new ArrayList<>();
        
        Collections.sort(list_PN, ChiTietPhieuNhap::maSPTangdan);
        
        int flag = 0;
        if (MaSP1 == MaSP2)
            for (ChiTietPhieuNhap hoadon : list_PN) {
                if ( hoadon.getGiay().getStrMaGiay() == MaSP1 ) {
                    arr.add(hoadon);
                    System.out.println("Tim thay SP1" + hoadon.getPn().getMaPN() );
                }
            }
        else    
            for (ChiTietPhieuNhap hoadon : list_PN) {
                if ( hoadon.getGiay().getStrMaGiay() == MaSP1 ) {
                    flag = 1;
                    System.out.println("Tim thay SP1" + hoadon.getPn().getMaPN() );
                }
                if ( hoadon.getGiay().getStrMaGiay() == MaSP2 ) {
                    flag = 2;
                    System.out.println("Tim thay SP2" + hoadon.getPn().getMaPN() );
                }
                
                if ( flag == 2 )
                    if ( hoadon.getGiay().getStrMaGiay() == MaSP2  )
                        break;
                
                if ( flag == 1 || flag == 2 )
                    arr.add(hoadon);
                
            }
        
        return arr;
    }
    
    
    public ArrayList<ChiTietPhieuNhap> timKiem_SoLuong(int SL1, int SL2) {
        ArrayList<ChiTietPhieuNhap> arr = new ArrayList<>();
        for (ChiTietPhieuNhap hoadon : list_PN) {
            if ( hoadon.getGiay().getiSoLuong() >= SL1 && hoadon.getGiay().getiSoLuong() <= SL2) {
                System.out.println("Tim thay " + hoadon.getPn().getMaPN() );
                arr.add(hoadon);
            }
        }
        
        return arr;
    }
    
    /**
     * @return true nếu tìm thấy 
     */
    public boolean kiemTraKhoachinh(ChiTietPhieuNhap pn) {
        for (ChiTietPhieuNhap hoadon : list_PN) {
            if (hoadon.getPn().getMaPN() == pn.getPn().getMaPN() &&
                    hoadon.getGiay().getStrMaGiay() == pn.getGiay().getStrMaGiay()){
                System.out.println("Bị trùng");
                return true;
            }
        }
        return false;
    }
    
  
    /**
     * thêm 1hóa đơn vào danh sách và database
     * @return true nếu thành công
     */
    public Boolean them(ChiTietPhieuNhap pn) throws Exception{
        if ( !kiemTraKhoachinh(pn) ) {
            if ( pnDAO.them(pn) ) {
                list_PN.add(pn);
                System.out.println("thêm phiếu nhập");
            }
        }
        return false;
    }
    
    /**
     * xóa 1hóa đơn pnỏi danh sách và database
     * @return true nếu thành công
     */
    public Boolean xoa(ChiTietPhieuNhap pn) throws Exception {
        if ( pnDAO.xoa(pn) ) {
            
            // duyệt từng phẩn tử
            for ( ChiTietPhieuNhap hoadon : list_PN ) {
                if (hoadon.getGiay().getStrMaGiay() == pn.getGiay().getStrMaGiay()
                        && hoadon.getPn().getMaPN() == pn.getPn().getMaPN()){
                    list_PN.remove(hoadon);
                    return true;
                }
            }
        }
        
        return false;
    }
    
    /**
     * sửa thông tin của 1hóa đơn <br>
     * - Trừ thông tin đăng nhập củahóa đơn đó
     * @return true nếu thực hiện thành công
     */
    public Boolean sua(ChiTietPhieuNhap pn) throws Exception {
        if ( pnDAO.sua(pn) ) {
            
            // duyệt từng phẩn tử
            for ( ChiTietPhieuNhap hoadon : list_PN ) {
                if (hoadon.getPn().getMaPN() == pn.getPn().getMaPN()
                        && hoadon.getGiay().getStrMaGiay() == pn.getGiay().getStrMaGiay()){
                    hoadon.getGiay().setStrMaGiay(pn.getGiay().getStrMaGiay());
                    hoadon.getPn().setMaPN(pn.getPn().getMaPN());
                    hoadon.setGiaNhap(pn.getGiaNhap());
                    hoadon.setSoLuong(pn.getSoLuong());
                    return true;
                }
            }
        }
        
        return false;
    }

}
