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
import java.sql.Date;

public class PhieuNhap {

    private int MaPN;
    private Date NgayNhap;
    private BigDecimal TongTien;
    private NhanVien nv;
    private NhaCungCap NCC;

    public PhieuNhap() {
        nv = new NhanVien();
        NCC = new NhaCungCap();
    }

    public PhieuNhap(int MaPN, Date NgayNhap, BigDecimal TongTien, NhaCungCap NCC, NhanVien nv) {
        this.MaPN = MaPN;
        this.nv = nv;
        this.NgayNhap = NgayNhap;
        this.TongTien = TongTien;
        this.NCC = NCC;
    }

    public void setNv(NhanVien nv) {
        this.nv = nv;
    }

    public NhanVien getNv() {
        return nv;
    }

    public void setMaPN(int MaPN) {
        this.MaPN = MaPN;
    }

    public void setNgayNhap(Date NgayNhap) {
        this.NgayNhap = NgayNhap;
    }

    public void setTongTien(BigDecimal TongTien) {
        this.TongTien = TongTien;
    }

    public int getMaPN() {
        return MaPN;
    }

    public Date getNgayNhap() {
        return NgayNhap;
    }

    public BigDecimal getTongTien() {
        return TongTien;
    }

    public NhaCungCap getNCC() {
        return NCC;
    }

    public void setNCC(NhaCungCap NCC) {
        this.NCC = NCC;
    }

}
