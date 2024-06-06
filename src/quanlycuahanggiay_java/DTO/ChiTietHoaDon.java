/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlycuahanggiay_java.DTO;

import java.math.BigDecimal;

public class ChiTietHoaDon {

    private HoaDon hd;
    private int Soluong;
    private BigDecimal GiaBan;

    private Giay giay;

    public ChiTietHoaDon() {
        giay = new Giay();
        hd = new HoaDon();
    }

    public ChiTietHoaDon(HoaDon hd, int Soluong, BigDecimal GiaBan, Giay giay) {
        this.hd = hd;
        this.Soluong = Soluong;
        this.GiaBan = GiaBan;
        this.giay = giay;
    }

    public void setGiay(Giay giay) {
        this.giay = giay;
    }

    public Giay getGiay() {
        return giay;
    }


    public HoaDon getHd() {
        return hd;
    }

    public void setHd(HoaDon hd) {
        this.hd = hd;
    }

    public int getSoluong() {
        return Soluong;
    }

    public void setSoluong(int soluong) {
        Soluong = soluong;
    }

    public BigDecimal getGiaBan() {
        return GiaBan;
    }

    public void setGiaBan(BigDecimal giaBan) {
        GiaBan = giaBan;
    }

    public static int maSPTangdan(ChiTietHoaDon a, ChiTietHoaDon b) {
        return Integer.compare(a.getGiay().getStrMaGiay(), a.getGiay().getStrMaGiay());
    }

    public static int maSPGiamdan(ChiTietHoaDon a, ChiTietHoaDon b) {
        return Integer.compare(a.getGiay().getStrMaGiay(), a.getGiay().getStrMaGiay());
    }

    public static int soLuongTangdan(ChiTietHoaDon a, ChiTietHoaDon b) {
        if (a.getSoluong() < b.getSoluong()) {
            return -1;
        } else {
            if (a.getSoluong() == a.getSoluong()) {
                return 0;
            } else {
                return 1;
            }
        }
    }

    public static int soLuongGiamdan(ChiTietHoaDon a, ChiTietHoaDon b) {
        if (a.getSoluong() > b.getSoluong()) {
            return -1;
        } else {
            if (a.getSoluong() == a.getSoluong()) {
                return 0;
            } else {
                return 1;
            }
        }
    }

}
