/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlycuahanggiay_java.BUS;

import quanlycuahanggiay_java.DAO.KhachHangDAO;
import quanlycuahanggiay_java.DTO.KhachHang;
import java.util.ArrayList;

public class KhachHangBUS {
    private ArrayList<KhachHang> list_KH;
    
    private KhachHangDAO khDAO;
    
    public KhachHangBUS() throws Exception {
        list_KH = new ArrayList<>();
        khDAO = new KhachHangDAO();
        list_KH = khDAO.docDB();
    }

    public int getNumbKH(){
        return list_KH.size();
    }
    public ArrayList<KhachHang> getList_KH() {
        return list_KH;
    }

    public void setList_KH(ArrayList<KhachHang> list_KH) {
        this.list_KH = list_KH;
    }
    
    public KhachHang getInfor (int MaKH) {
        for (KhachHang kh : list_KH) {
            if (kh.getMaKH() == MaKH) {
                return kh;
            }
        }
        
        return null;
    }
    
    /**
     * thêm 1 khách hàng vào danh sách và database
     * @return true nếu thành công
     */
    public Boolean them(KhachHang kh) throws Exception{
        if ( khDAO.them(kh) ) {
            list_KH.add(kh);
        }
        return false;
    }
    
    /**
     * xóa 1 khách hàng khỏi danh sách và database
     * @return true nếu thành công
     */
    public Boolean xoa(KhachHang kh) throws Exception {
        if ( khDAO.xoa(kh) ) {
            
            // duyệt từng phẩn tử
            for ( KhachHang taikhoan : list_KH ) {
                if (taikhoan.getMaKH()  == kh.getMaKH()){
                    list_KH.remove(taikhoan);
                break;
                }
            }
        }
        
        return false;
    }
    
    /**
     * sửa thông tin của 1 khách hàng <br>
     * - Trừ thông tin đăng nhập của khách hàng đó
     * @return true nếu thực hiện thành công
     */
    public Boolean sua(KhachHang kh) throws Exception {
        if ( khDAO.sua(kh) ) {
            
            // duyệt từng phẩn tử
            for ( KhachHang taikhoan : list_KH ) {
                if (taikhoan.getMaKH() == kh.getMaKH()){
                    taikhoan.setDiaChi(kh.getDiaChi());
                    taikhoan.setEmail(kh.getEmail());
                    taikhoan.setGioiTinh(kh.isGioiTinh());
                    taikhoan.setHo(kh.getHo());
                    taikhoan.setLoai(kh.getLoai());
                    taikhoan.setTen(kh.getTen());
                    taikhoan.setTongChiTieu(kh.getTongChiTieu());
                    return true;
                }
            }
        }
        
        return false;
    }
}
