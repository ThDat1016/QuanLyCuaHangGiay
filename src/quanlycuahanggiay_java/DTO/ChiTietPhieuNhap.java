/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlycuahanggiay_java.DTO;

import java.math.BigDecimal;

public class ChiTietPhieuNhap {

    private int MaPN;
    private BigDecimal GiaNhap;
    private Giay giay;


    public ChiTietPhieuNhap() {
        giay = new Giay();
    }

    public ChiTietPhieuNhap(int maGiay, int maPN, int soLuong, BigDecimal giaNhap, Giay giay) {
        super();
        MaPN = maPN;
        GiaNhap = giaNhap;
        this.giay = giay;
    }

    public void setGiay(Giay giay) {
        this.giay = giay;
    }

    public Giay getGiay() {
        return giay;
    }

//    public int getMaGiay() {
//        return MaGiay;
//    }
//
//    public void setMaGiay(int maGiay) {
//        MaGiay = maGiay;
//    }

    public int getMaPN() {
        return MaPN;
    }

    public void setMaPN(int maPN) {
        MaPN = maPN;
    }

//    public int getSoLuong() {
//        return SoLuong;
//    }
//
//    public void setSoLuong(int soLuong) {
//        SoLuong = soLuong;
//    }

    public BigDecimal getGiaNhap() {
        return GiaNhap;
    }

    public void setGiaNhap(BigDecimal giaNhap) {
        GiaNhap = giaNhap;
    }

    public static int maSPTangdan(ChiTietPhieuNhap a, ChiTietPhieuNhap b) {
        return Integer.compare(a.getGiay().getStrMaGiay(), a.getGiay().getStrMaGiay());
    }

}
