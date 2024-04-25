/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlycuahanggiay_java.BUS;

import quanlycuahanggiay_java.DAO.HoaDonDAO;
import quanlycuahanggiay_java.DTO.HoaDon;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Admin
 */
public class HoaDonBUS {

    private ArrayList<HoaDon> list_HD;

    private HoaDonDAO hdDAO;

    public void docDB() throws Exception {
        list_HD = new ArrayList<>();
        hdDAO = new HoaDonDAO();
        list_HD = hdDAO.docDB();
    }

    public HoaDonBUS() throws Exception {
        list_HD = new ArrayList<>();
        hdDAO = new HoaDonDAO();
        list_HD = hdDAO.docDB();
    }

    public void add(HoaDon hd) {
        list_HD.add(hd);
    }

    public void deleteAll() {
        list_HD.removeAll(list_HD);
    }

    public HoaDonDAO getHdDAO() {
        return hdDAO;
    }

    public void setHdDAO(HoaDonDAO hdDAO) {
        this.hdDAO = hdDAO;
    }

    public int getNumbHoaDon() {
        return list_HD.size();
    }

//    public HoaDon getInfor(int i){
//        int iCount =0;
//        for (HoaDon hd : list_HD) {
//            if (iCount == i)
//                return hd;
//            iCount++;
//        }
//        return null;
//    }
    public HoaDon getInfor(int MaHD) {
        for (HoaDon hd : list_HD) {
            if (hd.getMaHD() == MaHD) {
                return hd;
            }
        }
        HoaDon hd = new HoaDon();
        hd.setMaHD(0);
        return hd;
    }

    public int getMaKM(int MaHD) {
        for (HoaDon hoadon : list_HD) {
            if (hoadon.getMaHD() == MaHD) {
                return hoadon.getMaKM();
            }
        }
        return 0;
    }

    public ArrayList<HoaDon> timKiem_MaHD(int MaHD, boolean sapxep) {
        ArrayList<HoaDon> arr = new ArrayList<>();
        for (HoaDon hoadon : list_HD) {
            if (hoadon.getMaHD() == MaHD) {
                System.out.println("Tim thay " + hoadon.getMaHD());
                arr.add(hoadon);
            }
        }
        if (sapxep) {
            Collections.sort(arr, HoaDon::maHDTangdan);
        } else {
            Collections.sort(arr, HoaDon::maHDGiamdan);
        }

        return arr;
    }

    public ArrayList<HoaDon> timKiem_MaNV(int MaNV, boolean sapxep) {
        ArrayList<HoaDon> arr = new ArrayList<>();
        for (HoaDon hoadon : list_HD) {
            if (hoadon.getMaNV() == MaNV) {
                System.out.println("Tim thay " + hoadon.getMaHD());
                arr.add(hoadon);
            }
        }
        if (sapxep) {
            Collections.sort(arr, HoaDon::maNVTangdan);
        } else {
            Collections.sort(arr, HoaDon::maNVGiamdan);
        }

        return arr;
    }

    public ArrayList<HoaDon> timKiem_MaKH(int MaKH, boolean sapxep) {
        ArrayList<HoaDon> arr = new ArrayList<>();
        for (HoaDon hoadon : list_HD) {
            if (hoadon.getMaKH() == MaKH) {
                System.out.println("Tim thay " + hoadon.getMaHD());
                arr.add(hoadon);
            }
        }
        if (sapxep) {
            Collections.sort(arr, HoaDon::maKHTangdan);
        } else {
            Collections.sort(arr, HoaDon::maKHGiamdan);
        }

        return arr;
    }

    public ArrayList<HoaDon> timKiem_MaKM(int MaKM, boolean sapxep) {
        ArrayList<HoaDon> arr = new ArrayList<>();
        for (HoaDon hoadon : list_HD) {
            if (hoadon.getMaKM() == MaKM) {
                System.out.println("Tim thay " + hoadon.getMaHD());
                arr.add(hoadon);
            }
        }
        if (sapxep) {
            Collections.sort(arr, HoaDon::maKMTangdan);
        } else {
            Collections.sort(arr, HoaDon::maKMGiamdan);
        }

        return arr;
    }

    public ArrayList<HoaDon> timKiem_TongTien(String strTT, boolean sapxep) {
        ArrayList<HoaDon> arr = new ArrayList<>();
        for (HoaDon hoadon : list_HD) {
            if (String.valueOf(hoadon.getTongTien()).indexOf(strTT) != -1) {
                System.out.println("Tim thay " + hoadon.getMaHD());
                arr.add(hoadon);
            }
        }
        if (sapxep) {
            Collections.sort(arr, HoaDon::tongTienTangdan);
        } else {
            Collections.sort(arr, HoaDon::tongTienGiamdan);
        }

        return arr;
    }

    public int demSoChuSo(int nInput) {
        if (nInput < 10) {
            return 1;
        }
        return 1 + demSoChuSo(nInput / 10);
    }

}
