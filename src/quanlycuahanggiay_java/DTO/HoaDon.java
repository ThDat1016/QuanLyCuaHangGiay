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



public class HoaDon {
        private int MaHD;
	private int MaNV;
	private int MaKH;
	private String MaKM;
	private LocalDate NgayBan;
	private BigDecimal TongTien;
	private float Thue;
	public HoaDon(int maHD, int maNV, int maKH, String maKM, LocalDate ngayBan, BigDecimal tongTien, int thue) {
		super();
		MaHD = maHD;
		MaNV = maNV;
		MaKH = maKH;
		MaKM = maKM;
		NgayBan = ngayBan;
		TongTien = tongTien;
		Thue = thue;
	}

    public void setMaHD(int MaHD) {
        this.MaHD = MaHD;
    }

    public void setMaNV(int MaNV) {
        this.MaNV = MaNV;
    }

    public void setMaKH(int MaKH) {
        this.MaKH = MaKH;
    }

    public void setMaKM(String MaKM) {
        this.MaKM = MaKM;
    }

    public void setNgayBan(LocalDate NgayBan) {
        this.NgayBan = NgayBan;
    }

    public void setTongTien(BigDecimal TongTien) {
        this.TongTien = TongTien;
    }

    public void setThue(float Thue) {
        this.Thue = Thue;
    }

    public int getMaHD() {
        return MaHD;
    }

    public int getMaNV() {
        return MaNV;
    }

    public int getMaKH() {
        return MaKH;
    }

    public String getMaKM() {
        return MaKM;
    }

    public LocalDate getNgayBan() {
        return NgayBan;
    }

    public BigDecimal getTongTien() {
        return TongTien;
    }

    public float getThue() {
        return Thue;
    }
	
}
