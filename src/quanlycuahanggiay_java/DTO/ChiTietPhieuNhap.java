/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlycuahanggiay_java.DTO;
import java.math.BigDecimal;

public class ChiTietPhieuNhap {
	private String MaGiay;
	private String MaPN;
	private int SoLuong;
	private BigDecimal GiaNhap;
        
        public ChiTietPhieuNhap(String maGiay, String maPN, int soLuong, BigDecimal giaNhap) {
		super();
		MaGiay = maGiay;
		MaPN = maPN;
		SoLuong = soLuong;
		GiaNhap = giaNhap;
	}
	public String getMaGiay() {
		return MaGiay;
	}
	public void setMaGiay(String maGiay) {
		MaGiay = maGiay;
	}
	public String getMaPN() {
		return MaPN;
	}
	public void setMaPN(String maPN) {
		MaPN = maPN;
	}
	public int getSoLuong() {
		return SoLuong;
	}
	public void setSoLuong(int soLuong) {
		SoLuong = soLuong;
	}
	public BigDecimal getGiaNhap() {
		return GiaNhap;
	}
	public void setGiaNhap(BigDecimal giaNhap) {
		GiaNhap = giaNhap;
	}
	
}

