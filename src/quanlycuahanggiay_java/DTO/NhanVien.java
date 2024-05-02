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


public class NhanVien {
    private int MaNV;
    private String ChucVu;
    private String Ho;
    private String Ten;
    private boolean GioiTinh;
    private String DiaChi;
    private String  Email;
    private BigDecimal Luong;
    public NhanVien(){}
     public NhanVien(int MaNV, String ChucVu, String Ho, String Ten, boolean GioiTinh, String DiaChi,String Email, BigDecimal Luong) {
        this.MaNV = MaNV;
        this.ChucVu = ChucVu;
        this.Ho = Ho;
        this.Ten = Ten;
        this.GioiTinh = GioiTinh;
        this.DiaChi = DiaChi;
        this.Email = Email;
        this.Luong = Luong;
    }

    public int getMaNV() {
        return MaNV;
    }

    public void setMaNV(int MaNV) {
        this.MaNV = MaNV;
    }

    public void setChucVu(String ChucVu) {
        this.ChucVu = ChucVu;
    }

    public void setHo(String Ho) {
        this.Ho = Ho;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public void setGioiTinh(boolean GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setLuong(BigDecimal Luong) {
        this.Luong = Luong;
    }

    public String getChucVu() {
        return ChucVu;
    }

    public String getHo() {
        return Ho;
    }

    public String getTen() {
        return Ten;
    }

    public boolean isGioiTinh() {
        return GioiTinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    
    public String getEmail() {
        return Email;
    }

    public BigDecimal getLuong() {
        return Luong;
    }
     
     
    
}
