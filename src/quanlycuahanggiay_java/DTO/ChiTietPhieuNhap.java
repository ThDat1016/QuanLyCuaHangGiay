/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlycuahanggiay_java.DTO;

import java.math.BigDecimal;

public class ChiTietPhieuNhap {

    private PhieuNhap pn;
    private BigDecimal GiaNhap;
    private Giay giay;
    private int SoLuong;

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public ChiTietPhieuNhap() {
        pn = new PhieuNhap();
        giay = new Giay();
    }

    public ChiTietPhieuNhap(PhieuNhap pn, BigDecimal GiaNhap, Giay giay, int SoLuong) {
        this.pn = pn;
        this.GiaNhap = GiaNhap;
        this.giay = giay;
        this.SoLuong = SoLuong;
    }

    public void setPn(PhieuNhap pn) {
        this.pn = pn;
    }

    public PhieuNhap getPn() {
        return pn;
    }

    public void setGiay(Giay giay) {
        this.giay = giay;
    }

    public Giay getGiay() {
        return giay;
    }

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
