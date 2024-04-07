/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlycuahanggiay_java.DTO;
import java.math.BigDecimal;



     

public class ChiTietHoaDon {
	private String MaGiay;
	private String MaHD;
	private int Soluong;
	private BigDecimal GiaBan;
	public ChiTietHoaDon(String maGiay, String maHD, int soluong, BigDecimal giaBan) {
		super();
		MaGiay = maGiay;
		MaHD = maHD;
		Soluong = soluong;
		GiaBan = giaBan;
	}
	public String getMaGiay() {
		return MaGiay;
	}
	public void setMaGiay(String maGiay) {
		MaGiay = maGiay;
	}
	public String getMaHD() {
		return MaHD;
	}
	public void setMaHD(String maHD) {
		MaHD = maHD;
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
	
}

