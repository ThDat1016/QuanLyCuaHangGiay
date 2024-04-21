/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlycuahanggiay_java.DTO;

/**
 *
 * @author Admin
 */

import java.time.LocalDate;


public class ChuongTrinhKhuyenMai {
        private int MaKM;
	private LocalDate NgayBatDau;
	private LocalDate Ngayketthuc;
	private String tenchuongtrinh;
	private String loaiChuongtrinh;
	private String dieukien;
	
	public ChuongTrinhKhuyenMai(int maKM, LocalDate ngayBatDau, LocalDate ngayketthuc, String tenchuongtrinh,
			String loaiChuongtrinh, String dieukien) {
		super();
		MaKM = maKM;
		NgayBatDau = ngayBatDau;
		Ngayketthuc = ngayketthuc;
		this.tenchuongtrinh = tenchuongtrinh;
		this.loaiChuongtrinh = loaiChuongtrinh;
		this.dieukien = dieukien;
	}
	public void setMaKM(int maKM) {
		MaKM = maKM;
	}
        public int getMaKM() {
		return MaKM;
	}
	public LocalDate getNgayBatDau() {
		return NgayBatDau;
	}
	public void setNgayBatDau(LocalDate ngayBatDau) {
		NgayBatDau = ngayBatDau;
	}
	public LocalDate getNgayketthuc() {
		return Ngayketthuc;
	}
	public void setNgayketthuc(LocalDate ngayketthuc) {
		Ngayketthuc = ngayketthuc;
	}
	public String getTenchuongtrinh() {
		return tenchuongtrinh;
	}
	public void setTenchuongtrinh(String tenchuongtrinh) {
		this.tenchuongtrinh = tenchuongtrinh;
	}
	public String getLoaiChuongtrinh() {
		return loaiChuongtrinh;
	}
	public void setLoaiChuongtrinh(String loaiChuongtrinh) {
		this.loaiChuongtrinh = loaiChuongtrinh;
	}
	public String getDieukien() {
		return dieukien;
	}
	public void setDieukien(String dieukien) {
		this.dieukien = dieukien;
	}
}
