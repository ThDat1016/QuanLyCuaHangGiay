/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlycuahanggiay_java.BUS;

import quanlycuahanggiay_java.DAO.PhieuNhapDAO;
import quanlycuahanggiay_java.DTO.PhieuNhap;
import java.util.ArrayList;

public class PhieuNhapBUS {

    private ArrayList<PhieuNhap> list_TK;

    private PhieuNhapDAO tkDAO;

    public PhieuNhapBUS() throws Exception {
        list_TK = new ArrayList<>();
        tkDAO = new PhieuNhapDAO();
        list_TK = tkDAO.docDB();
    }

    public void add(PhieuNhap pn) {
        list_TK.add(pn);
    }

    public void deleteAll() {
        list_TK.removeAll(list_TK);
    }

    public void docDB() throws Exception {
        list_TK = new ArrayList<>();
        tkDAO = new PhieuNhapDAO();
        list_TK = tkDAO.docDB();
    }

    public ArrayList<PhieuNhap> getList_TK() {
        return list_TK;
    }

    public void setList_TK(ArrayList<PhieuNhap> list_TK) {
        this.list_TK = list_TK;
    }

    public int getNumb() {
        return list_TK.size();
    }

    public PhieuNhap getInfor(int i) {
        int iCount = 0;
        for (PhieuNhap hd : list_TK) {
            if (iCount == i) {
                return hd;
            }
            iCount++;
        }
        return null;
    }

    public int demSoChuSo(int nInput) {
        if (nInput < 10) {
            return 1;
        }
        return 1 + demSoChuSo(nInput / 10);
    }

    public int getDefaultMaPN() {
        if (list_TK.size() == 0) {
            return 1;
        } else {
            int iNumb = 0;

            for (PhieuNhap hoadon : list_TK) {
                int maPN = hoadon.getMaPN(); 
                if (maPN > iNumb) {
                    iNumb = maPN; 
                }
            }

            iNumb++;
            return iNumb;
        }
    }

    public ArrayList<PhieuNhap> timKiem_MaPN(int MaPN) {
        ArrayList<PhieuNhap> arr = new ArrayList<>();
        for (PhieuNhap hoadon : list_TK) {
            if (hoadon.getMaPN() == MaPN ) {
                System.out.println("Tim thay " + hoadon.getMaPN());
                arr.add(hoadon);
            }
        }
        return arr;
    }

    public ArrayList<PhieuNhap> timKiem_MaNV(int MaNV) {
        ArrayList<PhieuNhap> arr = new ArrayList<>();
        for (PhieuNhap hoadon : list_TK) {
            if (hoadon.getMaNV() ==  MaNV ) {
                System.out.println("Tim thay " + hoadon.getMaPN());
                arr.add(hoadon);
            }
        }

        return arr;
    }

    public ArrayList<PhieuNhap> timKiem_MaNCC(String strMaNCC) {
        ArrayList<PhieuNhap> arr = new ArrayList<>();
        for (PhieuNhap hoadon : list_TK) {
            if (hoadon.getMaNCC().indexOf(strMaNCC) != -1) {
                System.out.println("Tim thay " + hoadon.getMaPN());
                arr.add(hoadon);
            }
        }

        return arr;
    }

    public ArrayList<PhieuNhap> timKiem_TongTien(String strTT) {
        ArrayList<PhieuNhap> arr = new ArrayList<>();
        for (PhieuNhap hoadon : list_TK) {
            if (String.valueOf(hoadon.getTongTien()).indexOf(strTT) != -1) {
                System.out.println("Tim thay " + hoadon.getMaPN());
                arr.add(hoadon);
            }
        }

        return arr;
    }

    /**
     * thêm 1 tài khoản vào danh sách và database
     *
     * @return true nếu thành công
     */
    public Boolean them(PhieuNhapDTO tk) throws Exception {
        if (tkDAO.them(tk)) {
            list_TK.add(tk);
        }
        return false;
    }

    /**
     * xóa 1 tài khoản khỏi danh sách và database
     *
     * @return true nếu thành công
     */
    public Boolean xoa(PhieuNhap tk) throws Exception {
        if (tkDAO.xoa(tk)) {

            // duyệt từng phẩn tử
            for (PhieuNhap taikhoan : list_TK) {
                if (taikhoan.getMaPN() == tk.getMaPN()) {
                    list_TK.remove(taikhoan);
                    break;
                }
            }
        }

        return false;
    }

  
    public Boolean sua(PhieuNhap tk) throws Exception {
        if (tkDAO.sua(tk)) {

            // duyệt từng phẩn tử
            for (PhieuNhap taikhoan : list_TK) {
                if (taikhoan.getMaPN() == tk.getMaPN()) {
                    taikhoan.setMaNCC(tk.getMaNCC());
                    taikhoan.setMaNV(tk.getMaNV());
                    taikhoan.setMaPN(tk.getMaPN());
                    taikhoan.setNgayNhap(tk.getNgayNhap());
                    taikhoan.setTongTien(tk.getTongTien());
                    return true;
                }
            }
        }

        return false;
    }
}
