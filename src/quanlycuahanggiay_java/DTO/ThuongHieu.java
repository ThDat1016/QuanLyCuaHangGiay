/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package quanlycuahanggiay_java.DTO;

public class ThuongHieu {
	private String MaThuongHieu;
	private String TenThuongHieu;
	private String DiaChi;
	private String email;
	public ThuongHieu(String maThuongHieu, String tenThuongHieu, String diaChi, String email) {
		this.MaThuongHieu = maThuongHieu;
		this.TenThuongHieu = tenThuongHieu;
		this.DiaChi = diaChi;
		this.email = email;
	}
	public String getMaThuongHieu() {
		return MaThuongHieu;
	}
	public void setMaThuongHieu(String maThuongHieu) {
		this.MaThuongHieu = maThuongHieu;
	}
	public String getTenThuongHieu() {
		return TenThuongHieu;
	}
	public void setTenThuongHieu(String tenThuongHieu) {
		this.TenThuongHieu = tenThuongHieu;
	}
	public String getDiaChi() {
		return DiaChi;
	}
	public void setDiaChi(String diaChi) {
		this.DiaChi = diaChi;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}

