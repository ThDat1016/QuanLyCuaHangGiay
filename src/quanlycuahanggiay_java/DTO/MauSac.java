/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlycuahanggiay_java.DTO;

public class MauSac {
	private String MaMau;
	private String TenMau;
        
        public MauSac(){}
	public MauSac(String maMau, String tenMau) {
		this.MaMau = maMau;
		this.TenMau = tenMau;
	}
	public String getMaMau() {
		return MaMau;
	}
	public void setMaMau(String maMau) {
		this.MaMau = maMau;
	}
	public String getTenMau() {
		return TenMau;
	}
	public void setTenMau(String tenMau) {
		this.TenMau = tenMau;
	}
}
