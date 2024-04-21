/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlycuahanggiay_java.DTO;
import java.math.BigDecimal;

public class ChiTietPhieuNhap {
	private int MaGiay;
	private int MaPN;
	private int SoLuong;
	private BigDecimal GiaNhap;
        
        public ChiTietPhieuNhap(){}
        public ChiTietPhieuNhap(int maGiay, int maPN, int soLuong, BigDecimal giaNhap) {
		super();
		MaGiay = maGiay;
		MaPN = maPN;
		SoLuong = soLuong;
		GiaNhap = giaNhap;
	}
	public int getMaGiay() {
		return MaGiay;
	}
	public void setMaGiay(int maGiay) {
		MaGiay = maGiay;
	}
	public int getMaPN() {
		return MaPN;
	}
	public void setMaPN(int maPN) {
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

