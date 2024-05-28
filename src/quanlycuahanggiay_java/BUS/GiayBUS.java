/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlycuahanggiay_java.BUS;

import quanlycuahanggiay_java.DAO.GiayDAO;
import quanlycuahanggiay_java.DTO.Giay;
import java.util.ArrayList;
import java.util.Collections;

public class GiayBUS {
      private ArrayList<Giay> list_SP;
    
    private GiayDAO spDAO;
    
    public void docDB() throws Exception {
        list_SP = new ArrayList<>();
        spDAO = new GiayDAO();
        list_SP = spDAO.docDB();
    }

    
    public GiayBUS() throws Exception {
        list_SP = new ArrayList<>();
        spDAO = new GiayDAO();
        list_SP = spDAO.docDB();
    }

    public ArrayList<Giay> getList_SP() {
        return list_SP;
    }

    public void setList_SP(ArrayList<Giay> list_SP) {
        this.list_SP = list_SP;
    }
    
    public int getNumbSanPham() {
        return list_SP.size();
    }

    public int getDefaultMaHD() {
        if ( list_SP.size() ==0 )
            return 1;
        else {
             int maxMaGiay = 0;

        for (Giay sanpham : list_SP) {
            int maGiay = sanpham.getStrMaGiay();
            if (maGiay > maxMaGiay) {
                maxMaGiay = maGiay;
            }
        }

        return maxMaGiay + 1;
        }
    }
    
    public int getSoLuongCuaSanPham(int strMaGiay) {
        for (Giay sanpham : list_SP) {
            if (strMaGiay == sanpham.getStrMaGiay()) {
                return sanpham.getiSoLuong();
            }
        }
        return -1;
    }
    
    public Giay getInfor(int strMaSP){
        for (Giay hd : list_SP) {
            if (hd.getStrMaGiay() == strMaSP)
                return hd;
        }
        Giay hd = new Giay();
        hd.setStrMaGiay(0);
        return hd;
    }
    
//    public Giay getInfor(int i){
//        int iCount =0;
//        for (Giay hd : list_SP) {
//            if (iCount == i)
//                return hd;
//            iCount++;
//        }
//        return null;
//    }

//    public ArrayList<Giay> timKiem_MaSP(int strMaSP1, int strMaSP2, int sapxep) {
//        ArrayList<Giay> arr = new ArrayList<>();
//        
//        //Collections.sort(this.list_SP, SanPhamDTO::maSPTangdan);
//
//        int flag = 0;
//        for (Giay sanpham : list_SP) {
//            if ( sanpham.getStrMaGiay() == strMaSP1) {
//                flag = 1;
////                System.out.println("Tim thay SP1" + sanpham.getStrMaSP() );
//            }
//            if ( sanpham.getStrMaGiay() == strMaSP2  ) {
//                flag = 2;
////                System.out.println("Tim thay SP2" + sanpham.getStrMaSP() );
//            }
//            if ( flag == 1 || flag == 2 )
//                arr.add(sanpham);
//            if ( flag == 2 )
//                break;
//        }
//        
//        if(sapxep == 1){
////            Collections.sort(arr, SanPhamDTO::maSPTangdan);
//        }
//        else if(sapxep == -1) {
////            Collections.sort(arr, SanPhamDTO::maSPGiamdan);
//        }
//        return arr;
//    }
//    
    public ArrayList<Giay> timKiem_SoLuong(int SL1, int SL2,int sapxep) {
        ArrayList<Giay> arr = new ArrayList<>();
        for (Giay sanpham : list_SP) {
            if ( sanpham.getiSoLuong() >= SL1 && sanpham.getiSoLuong() <= SL2) {
//                System.out.println("Tim thay " + sanpham.getStrMaSP() );
                arr.add(sanpham);
            }
        }
        if(sapxep == 1){
//            Collections.sort(arr, SanPhamDTO::soLuongTangdan);
        }
        else if(sapxep == -1){
//            Collections.sort(arr, SanPhamDTO::soLuongGiamdan);
        }
        
        return arr;
    }
    
    /**
     * @return true nếu tìm thấy 
     */
    public boolean kiemTraKhoachinh(Giay hd) {
        for (Giay sanpham : list_SP) {
            if ( sanpham.getStrMaGiay() == hd.getStrMaGiay()){
                System.out.println("Bị trùng");
                return true;
            }
        }
        return false;
    }
    
        public ArrayList<Giay> timKiem_TenGiay(String strTenGiay) {
            ArrayList<Giay> arr = new ArrayList<>();
            for (Giay sanpham : list_SP) {
                if (sanpham.getStrTenGiay().indexOf(strTenGiay) != -1) {
                    arr.add(sanpham);
                }
            }

            return arr;
        }
        public Giay timKiem_MaGiay(int maGiay) {
            for (Giay sanpham : list_SP) {
                if (sanpham.getStrMaGiay()== maGiay) {
                   return sanpham;
                }
            }

            return null;
        }
    public ArrayList<Giay> timKiem_MaLoai(String strMaLoai) {
        ArrayList<Giay> arr = new ArrayList<>();
        for (Giay sanpham : list_SP) {
            if ( sanpham.getStrMaLoai().indexOf(strMaLoai) != -1 ) {
                arr.add(sanpham);
            }
        }
        
        
        return arr;
    }
    public ArrayList<Giay> timKiem_MaXX(String strMaXX) {
        ArrayList<Giay> arr = new ArrayList<>();
        for (Giay sanpham : list_SP) {
            if ( sanpham.getStrMaxx().indexOf(strMaXX) != -1 ) {
                arr.add(sanpham);
            }
        }
        
        
        return arr;
    }
    public ArrayList<Giay> timKiem_MaMau(String strMaMau) {
        ArrayList<Giay> arr = new ArrayList<>();
        for (Giay sanpham : list_SP) {
            if ( sanpham.getStrMaMau().indexOf(strMaMau) != -1 ) {
                arr.add(sanpham);
            }
        }
        
        
        return arr;
    }
    public ArrayList<Giay> timKiem_MaThuongHieu(String strMaThuongHieu) {
        ArrayList<Giay> arr = new ArrayList<>();
        for (Giay sanpham : list_SP) {
            if ( sanpham.getStrMaThuongHieu().indexOf(strMaThuongHieu) != -1 ) {
                arr.add(sanpham);
            }
        }
        
        
        return arr;
    }
    
    //-----------------------------------------------------------------------------------------------
    /**
     * thêm 1sản phẩm vào danh sách và database
     * @return true nếu thành công
     */
    public Boolean them(Giay hd) throws Exception{
        if ( !kiemTraKhoachinh(hd) ) {
            if ( spDAO.them(hd) ) {
                list_SP.add(hd);
                System.out.println("thêm sản phẩm");
            }
        }
        return false;
    }
    
    /**
     * xóa 1sản phẩm hdỏi danh sách và database
     * @return true nếu thành công
     */
    public Boolean xoa(Giay hd) throws Exception {
        if ( spDAO.xoa(hd) ) {
            
            // duyệt từng phẩn tử
            for ( Giay sanpham : list_SP ) {
                if (sanpham.getStrMaGiay() == hd.getStrMaGiay()){
                    list_SP.remove(sanpham);
                    return true;
                }
            }
        }
        
        return false;
    }
    
    /**
     * sửa thông tin của 1sản phẩm <br>
     * - Trừ thông tin đăng nhập củasản phẩm đó
     * @return true nếu thực hiện thành công
     */
    public Boolean sua(Giay hd) throws Exception {
        if ( spDAO.sua(hd) ) {
            
            // duyệt từng phẩn tử
            for ( Giay sanpham : list_SP ) {
                if (sanpham.getStrMaGiay() == hd.getStrMaGiay()){
                    sanpham.setStrMaGiay(hd.getStrMaGiay());
                    sanpham.setStrChatLieu(hd.getStrChatLieu());
                    sanpham.setStrDoiTuongSD(hd.getStrDoiTuongSD());
                    sanpham.setStrMaLoai(hd.getStrMaLoai());
                    sanpham.setStrMaMau(hd.getStrMaMau());
                    sanpham.setStrMaThuongHieu(hd.getStrMaThuongHieu());
                    sanpham.setStrMaxx(hd.getStrMaxx());
                    sanpham.setStrTenGiay(hd.getStrTenGiay());
                    sanpham.setiGia(hd.getiGia());
                    sanpham.setiSize(hd.getiSize());
                    sanpham.setiSoLuong(hd.getiSoLuong());
                    return true;
                }
            }
        }
        
        return false;
    }
    
}
