/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlycuahanggiay_java.DTO;

/**
 *
 * @author Admin
 */

import java.math.BigDecimal;
import java.time.LocalDate;

public class PhieuNhap {
        private int MaPN;
	private LocalDate NgayNhap;
	private BigDecimal TongTien;
	private int MaNV;

    public PhieuNhap(int MaPN, LocalDate NgayNhap, BigDecimal TongTien, int MaNV, String MaNCC) {
        this.MaPN = MaPN;
        this.NgayNhap = NgayNhap;
        this.TongTien = TongTien;
        this.MaNV = MaNV;
        this.MaNCC = MaNCC;
    }

    public void setMaPN(int MaPN) {
        this.MaPN = MaPN;
    }

    public void setNgayNhap(LocalDate NgayNhap) {
        this.NgayNhap = NgayNhap;
    }

    public void setTongTien(BigDecimal TongTien) {
        this.TongTien = TongTien;
    }

    public void setMaNV(int MaNV) {
        this.MaNV = MaNV;
    }

    public void setMaNCC(String MaNCC) {
        this.MaNCC = MaNCC;
    }

    public int getMaPN() {
        return MaPN;
    }

    public LocalDate getNgayNhap() {
        return NgayNhap;
    }

    public BigDecimal getTongTien() {
        return TongTien;
    }

    public int getMaNV() {
        return MaNV;
    }

    public String getMaNCC() {
        return MaNCC;
    }
	private String MaNCC;
}
