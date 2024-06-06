/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlycuahanggiay_java.BUS;

import quanlycuahanggiay_java.DTO.ChiTietChuongTrinhKhuyenMai;
import quanlycuahanggiay_java.DAO.ChiThietKhuyenMaiDAO;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Admin
 */
public class ChiTietKMBUS {

    private ArrayList<ChiTietChuongTrinhKhuyenMai> list_KM;
    private ChiThietKhuyenMaiDAO kmDAO;

    public void docDB() throws Exception {
        list_KM = new ArrayList<>();
        kmDAO = new ChiThietKhuyenMaiDAO();
        list_KM = kmDAO.docDB();
    }

    public ChiTietKMBUS() throws Exception {
        list_KM = new ArrayList<>();
        kmDAO = new ChiThietKhuyenMaiDAO();
        list_KM = kmDAO.docDB();
    }

    public int getNumbKM() {
        return list_KM.size();
    }

    public ArrayList<ChiTietChuongTrinhKhuyenMai> getList_KM() {
        return list_KM;
    }

    public void setList_KM(ArrayList<ChiTietChuongTrinhKhuyenMai> list_KM) {
        this.list_KM = list_KM;
    }

    public boolean kiemTraKhoachinh(ChiTietChuongTrinhKhuyenMai hd) {
        for (ChiTietChuongTrinhKhuyenMai khuyemai : list_KM) {
            if (khuyemai.getGiay().getStrMaGiay() == hd.getGiay().getStrMaGiay()
                    && khuyemai.getKm().getMaKM() == hd.getKm().getMaKM()) {
                System.out.println("Bị trùng");
                return true;
            }
        }
        return false;
    }
    
      public ChiTietChuongTrinhKhuyenMai getInfor(int MaGiay, String MaKM) {
        for (ChiTietChuongTrinhKhuyenMai km : list_KM) {
            if ( km.getGiay().getStrMaGiay()==MaGiay
                    && km.getKm().getMaKM() == MaKM) {
                return km;
            }
        }
        ChiTietChuongTrinhKhuyenMai khuyenmai = new ChiTietChuongTrinhKhuyenMai();
        return khuyenmai;
    }
      
     public ChiTietChuongTrinhKhuyenMai getInfor(int MaGiay) {
        for (ChiTietChuongTrinhKhuyenMai km : list_KM) {
            if ( km.getGiay().getStrMaGiay() == MaGiay ) {
                System.out.println(km.toString());
                return km;
            }
        }
        return null;
    }
     
      /**
     * thêm 1sản phẩm vào danh sách và database
     * @return true nếu thành công
     */
    public Boolean them(ChiTietChuongTrinhKhuyenMai hd) throws Exception{
        if ( !kiemTraKhoachinh(hd) ) {
            if ( kmDAO.them(hd) ) {
                list_KM.add(hd);
                System.out.println("thêm sản phẩm");
            }
        }
        return false;
    }
    
     /**
     * xóa 1khuyến mãi khỏi danh sách và database
     * @return true nếu thành công
     */
    public Boolean xoa(ChiTietChuongTrinhKhuyenMai kh) throws Exception {
        if ( kmDAO.xoa(kh) ) {
            
            // duyệt từng phẩn tử
            for ( ChiTietChuongTrinhKhuyenMai khuyemai : list_KM ) {
                if (khuyemai.getKm().getMaKM()==kh.getKm().getMaKM()
                        &&khuyemai.getGiay().getStrMaGiay() == kh.getGiay().getStrMaGiay()){
                    list_KM.remove(khuyemai);
                break;
                }
            }
        }
        
        return false;
    }
    
    
   
    
    public ArrayList<ChiTietChuongTrinhKhuyenMai> timKiem_MaSP(int MaSP1, int MaSP2){
        ArrayList<ChiTietChuongTrinhKhuyenMai> arr = new ArrayList<>();
        
        Collections.sort(this.list_KM, ChiTietChuongTrinhKhuyenMai::maSPTangdan);

        int flag = 0;
        if (MaSP1 == MaSP2)
            for (ChiTietChuongTrinhKhuyenMai hoadon : list_KM) {
                if ( hoadon.getGiay().getStrMaGiay() == MaSP1 ) {
                    arr.add(hoadon);
                    System.out.println("Tim thay SP1" + hoadon.getKm().getMaKM() );
                }
            }
        else    
            for (ChiTietChuongTrinhKhuyenMai hoadon : list_KM) {
                if ( hoadon.getGiay().getStrMaGiay() == MaSP1 ) {
                    flag = 1;
                    System.out.println("Tim thay SP1" + hoadon.getKm().getMaKM() );
                }
                if ( hoadon.getGiay().getStrMaGiay() == MaSP2 ) {
                    flag = 2;
                    System.out.println("Tim thay SP2" + hoadon.getKm().getMaKM() );
                }
                
                if ( flag == 2 )
                    if ( hoadon.getGiay().getStrMaGiay() == MaSP2  )
                        break;
                
                if ( flag == 1 || flag == 2 )
                    arr.add(hoadon);
                
            }
        
        return arr;
    }
    
    public ArrayList<ChiTietChuongTrinhKhuyenMai> timKiem_TiLeKM(double SL1, double SL2) {
        ArrayList<ChiTietChuongTrinhKhuyenMai> arr = new ArrayList<>();
        for (ChiTietChuongTrinhKhuyenMai hoadon : list_KM) {
            if ( hoadon.getTiLeKM()>= SL1 && hoadon.getTiLeKM()<= SL2) {
                System.out.println("Tim thay " + hoadon.getKm().getMaKM() );
                arr.add(hoadon);
            }
        }
        return arr;
    }
}
