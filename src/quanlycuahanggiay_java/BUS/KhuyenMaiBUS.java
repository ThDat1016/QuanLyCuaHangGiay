/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlycuahanggiay_java.BUS;

import quanlycuahanggiay_java.DTO.ChuongTrinhKhuyenMai;
import quanlycuahanggiay_java.DAO.ChuongTrinhKhuyenMaiDAO;
import java.util.ArrayList;

public class KhuyenMaiBUS {
    private ArrayList<ChuongTrinhKhuyenMai> list_KM;
    private ChuongTrinhKhuyenMaiDAO khDAO;
    
    public void docDB() throws Exception {
        list_KM = new ArrayList<>();
        khDAO = new ChuongTrinhKhuyenMaiDAO();
        list_KM = khDAO.docDB();
    }
    
    public int getNumb() {
        return list_KM.size();
    }
    
//     public ChuongTrinhKhuyenMai getInfor(int i){
//        int iCount =0;
//        for (ChuongTrinhKhuyenMai hd : list_KM) {
//            if (iCount == i)
//                return hd;
//            iCount++;
//        }
//        return null;
//    }
      public ChuongTrinhKhuyenMai getInfor(String MaKM){
        for (ChuongTrinhKhuyenMai hd : list_KM) {
            if (hd.getMaKM()== MaKM)
                return hd;
        }
        return null;
    }
    
    public KhuyenMaiBUS() throws Exception {
        list_KM = new ArrayList<>();
        khDAO = new ChuongTrinhKhuyenMaiDAO();
        list_KM = khDAO.docDB();
    }
    public int getNumbKM(){
        return list_KM.size();
    }
    
     public int demSoChuSo(int nInput){
	if (nInput < 10) {
		return 1;
	}
	return 1 + demSoChuSo(nInput / 10);
    }
    public ArrayList<ChuongTrinhKhuyenMai> getList_KM() {
        return list_KM;
    }

    public void setList_KM(ArrayList<ChuongTrinhKhuyenMai> list_KM) {
        this.list_KM = list_KM;
    }
    
    public ArrayList<ChuongTrinhKhuyenMai> timKiem_MaKM(String MaKM) {
        ArrayList<ChuongTrinhKhuyenMai> arr = new ArrayList<>();
        for (ChuongTrinhKhuyenMai hoadon : list_KM) {
            if ( hoadon.getMaKM() == MaKM ) {
                System.out.println("Tim thay " + hoadon.getMaKM());
                arr.add(hoadon);
            }
        }
        return arr;
    }
    
    public ArrayList<ChuongTrinhKhuyenMai> timKiem_TenCT(String strTenCT) {
        ArrayList<ChuongTrinhKhuyenMai> arr = new ArrayList<>();
        for (ChuongTrinhKhuyenMai km : list_KM) {
            if (km.getTenChuongTrinh().indexOf(strTenCT) != -1)
                arr.add(km);
        }
        return arr;
    }

    
    /**
     * thêm 1khuyến mãi vào danh sách và database
     * @return true nếu thành công
     */
    public Boolean them(ChuongTrinhKhuyenMai kh) throws Exception{
        if ( khDAO.them(kh) ) {
            list_KM.add(kh);
        }
        return false;
    }
    
    /**
     * xóa 1khuyến mãi khỏi danh sách và database
     * @return true nếu thành công
     */
    public Boolean xoa(ChuongTrinhKhuyenMai kh) throws Exception {
        if ( khDAO.xoa(kh) ) {
            
            // duyệt từng phẩn tử
            for ( ChuongTrinhKhuyenMai taikhoan : list_KM ) {
                if (taikhoan.getMaKM() == kh.getMaKM()){
                    list_KM.remove(taikhoan);
                break;
                }
            }
        }
        
        return false;
    }
    
    /**
     * sửa thông tin của 1khuyến mãi <br>
     * - Trừ thông tin đăng nhập củakhuyến mãi đó
     * @return true nếu thực hiện thành công
     */
    public Boolean sua(ChuongTrinhKhuyenMai kh) throws Exception {
        if ( khDAO.sua(kh) ) {
            
                for ( ChuongTrinhKhuyenMai taikhoan : list_KM ) {
                if (taikhoan.getMaKM() == kh.getMaKM()){
                     taikhoan.setDieuKien(kh.getDieuKien());
                     taikhoan.setLoaiChuongTrinh(kh.getLoaiChuongTrinh());
                     taikhoan.setMaKM(kh.getMaKM());
                     taikhoan.setNgayBatDau(kh.getNgayBatDau());
                     taikhoan.setNgayKetThuc(kh.getNgayKetThuc());
                     taikhoan.setTenChuongTrinh(kh.getTenChuongTrinh());
                break;
                }
            }
        }
        
        return false;
    }
    
}
