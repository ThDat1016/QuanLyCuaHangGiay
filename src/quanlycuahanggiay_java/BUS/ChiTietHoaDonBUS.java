/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlycuahanggiay_java.BUS;

import quanlycuahanggiay_java.DTO.ChiTietHoaDon;
import quanlycuahanggiay_java.DAO.ChiTietHoaDonDAO;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Admin
 */
public class ChiTietHoaDonBUS {

    private ArrayList<ChiTietHoaDon> list_HD;
    private ChiTietHoaDonDAO hdDAO;

    public void docDB() throws Exception {
        list_HD = new ArrayList<>();
        hdDAO = new ChiTietHoaDonDAO();
        list_HD = hdDAO.docDB();
    }

    public void add(ChiTietHoaDon hd) {
        list_HD.add(hd);
    }

    public void deleteAll() {
        list_HD.removeAll(list_HD);
    }

    public ChiTietHoaDonBUS() throws Exception {
        list_HD = new ArrayList<>();
        hdDAO = new ChiTietHoaDonDAO();
        list_HD = hdDAO.docDB();
    }

    public ArrayList<ChiTietHoaDon> getList_HD() {
        return list_HD;
    }

    public void setList_HD(ArrayList<ChiTietHoaDon> list_HD) {
        this.list_HD = list_HD;
    }

    public ChiTietHoaDonDAO getHdDAO() {
        return hdDAO;
    }

    public void setHdDAO(ChiTietHoaDonDAO hdDAO) {
        this.hdDAO = hdDAO;
    }

    public int getNumbChiTietHD() {
        return list_HD.size();
    }

    public ChiTietHoaDon getInfor(int i) {
        int iCount = 0;
        for (ChiTietHoaDon hd : list_HD) {
            if (iCount == i) {
                return hd;
            }
            iCount++;
        }
        return null;
    }

    public ArrayList<ChiTietHoaDon> timKiem_MaSP(int MaSP1, int MaSP2, int sapxep) {
        ArrayList<ChiTietHoaDon> arr = new ArrayList<>();

        Collections.sort(this.list_HD, ChiTietHoaDon::maSPTangdan);

        int flag = 0;
        if (MaSP1 == MaSP2) {
            for (ChiTietHoaDon hoadon : list_HD) {
                if (hoadon.getMaGiay() == MaSP1) {
                    arr.add(hoadon);
                    System.out.println("Tim thay SP1" + hoadon.getMaHD());
                }
            }
        } else {
            for (ChiTietHoaDon hoadon : list_HD) {
                if (hoadon.getMaGiay() == MaSP1) {
                    flag = 1;
                    System.out.println("Tim thay SP1" + hoadon.getMaHD());
                }
                if (hoadon.getMaGiay() == MaSP2) {
                    flag = 2;
                    System.out.println("Tim thay SP2" + hoadon.getMaHD());
                }

                if (flag == 2) {
                    if (hoadon.getMaGiay() == MaSP2) {
                        break;
                    }
                }

                if (flag == 1 || flag == 2) {
                    arr.add(hoadon);
                }

            }
        }

        if (sapxep == 1) {
            Collections.sort(arr, ChiTietHoaDon::maSPTangdan);
        } else if (sapxep == -1) {
            Collections.sort(arr, ChiTietHoaDon::maSPGiamdan);
        }
        return arr;
    }

}
