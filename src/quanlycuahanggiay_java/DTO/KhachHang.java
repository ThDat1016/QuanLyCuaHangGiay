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

public class KhachHang {
        private int MaKH;
	private String Loai;
	private BigDecimal TongChiTieu;
	private String Ho;
	private String Ten;
	private boolean GioiTinh;
	private String DiaChi;
	private String Email;
        
        
    public KhachHang(){}
    public KhachHang(int MaKH, String Loai, BigDecimal TongChiTieu, String Ho, String Ten, boolean GioiTinh, String DiaChi, String Email) {
        this.MaKH = MaKH;
        this.Loai = Loai;
        this.TongChiTieu = TongChiTieu;
        this.Ho = Ho;
        this.Ten = Ten;
        this.GioiTinh = GioiTinh;
        this.DiaChi = DiaChi;
        this.Email = Email;
    }

    public void setMaKH(int MaKH) {
        this.MaKH = MaKH;
    }

    public void setLoai(String Loai) {
        this.Loai = Loai;
    }

    public void setTongChiTieu(BigDecimal TongChiTieu) {
        this.TongChiTieu = TongChiTieu;
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

    public int getMaKH() {
        return MaKH;
    }

    public String getLoai() {
        return Loai;
    }

    public BigDecimal getTongChiTieu() {
        return TongChiTieu;
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
	
}
