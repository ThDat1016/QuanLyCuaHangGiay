/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlycuahanggiay_java.DTO;

/**
 *
 * @author Admin
 */

import java.sql.Date;


public class ChuongTrinhKhuyenMai {
        private String MaKM;
	private Date NgayBatDau;
	private Date NgayKetThuc;
	private String TenChuongTrinh;
	private String LoaiChuongTrinh;
	private String DieuKien;
	
        
        public ChuongTrinhKhuyenMai(){}
	public ChuongTrinhKhuyenMai(String maKM, Date ngayBatDau, Date ngayketthuc, String tenchuongtrinh,
			String loaiChuongtrinh, String dieukien) {
		super();
		MaKM = maKM;
		NgayBatDau = ngayBatDau;
		NgayKetThuc = ngayketthuc;
		this.TenChuongTrinh = tenchuongtrinh;
		this.LoaiChuongTrinh = loaiChuongtrinh;
		this.DieuKien = dieukien;
	}
	public void setMaKM(String maKM) {
		MaKM = maKM;
	}
        public String getMaKM() {
		return MaKM;
	}
	public Date getNgayBatDau() {
		return NgayBatDau;
	}
	public void setNgayBatDau(Date ngayBatDau) {
		NgayBatDau = ngayBatDau;
	}
	public Date getNgayKetThuc() {
		return NgayKetThuc;
	}
	public void setNgayKetThuc(Date ngayketthuc) {
		NgayKetThuc = ngayketthuc;
	}
	public String getTenChuongTrinh() {
		return TenChuongTrinh;
	}
	public void setTenChuongTrinh(String tenchuongtrinh) {
		this.TenChuongTrinh = tenchuongtrinh;
	}
	public String getLoaiChuongTrinh() {
		return LoaiChuongTrinh;
	}
	public void setLoaiChuongTrinh(String loaiChuongtrinh) {
		this.LoaiChuongTrinh = loaiChuongtrinh;
	}
	public String getDieuKien() {
		return DieuKien;
	}
	public void setDieuKien(String dieukien) {
		this.DieuKien = dieukien;
	}
}
