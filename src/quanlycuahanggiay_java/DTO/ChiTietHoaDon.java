/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlycuahanggiay_java.DTO;
import java.math.BigDecimal;



     

public class ChiTietHoaDon {
	private int MaGiay;
	private int MaHD;
	private int Soluong;
	private BigDecimal GiaBan;
        public ChiTietHoaDon(){}
	public ChiTietHoaDon(int maGiay, int maHD, int soluong, BigDecimal giaBan) {
		MaGiay = maGiay;
		MaHD = maHD;
		Soluong = soluong;
		GiaBan = giaBan;
	}
	public int getMaGiay() {
		return MaGiay;
	}
	public void setMaGiay(int maGiay) {
		MaGiay = maGiay;
	}
	public int getMaHD() {
		return MaHD;
	}
	public void setMaHD(int maHD) {
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
        
       public static int maSPTangdan(ChiTietHoaDon a, ChiTietHoaDon b) {
             return Integer.compare(a.getMaGiay(), b.getMaGiay());
        }   

    public static int maSPGiamdan(ChiTietHoaDon a, ChiTietHoaDon b){
             return Integer.compare(a.getMaGiay(), b.getMaGiay());
    }
    
    public static int soLuongTangdan(ChiTietHoaDon a, ChiTietHoaDon b){
        if (a.getSoluong()< b.getSoluong()) {
            return -1;
        } 
        else {
            if (a.getSoluong() == a.getSoluong()) {
                return 0;
            }
            else {
                return 1;
            }
        }
    }
    public static int soLuongGiamdan(ChiTietHoaDon a, ChiTietHoaDon b){
        if (a.getSoluong() > b.getSoluong()) {
            return -1;
        } 
        else {
            if (a.getSoluong() == a.getSoluong()) {
                return 0;
            }
            else {
                return 1;
            }
        }
    }
	
}

