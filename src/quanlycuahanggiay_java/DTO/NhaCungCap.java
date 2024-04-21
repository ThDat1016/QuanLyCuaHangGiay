/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlycuahanggiay_java.DTO;

/**
 *
 * @author Admin
 */
public class NhaCungCap {
        private String MaNCC;
	private String TenNCC;
	private String DiaChi;
	private String DienThoai;
        
    public NhaCungCap(){}

    public NhaCungCap(String MaNCC, String TenNCC, String Diachi, String DienThoai) {
        this.MaNCC = MaNCC;
        this.TenNCC = TenNCC;
        this.DiaChi = Diachi;
        this.DienThoai = DienThoai;
    }

    public void setMaNCC(String MaNCC) {
        this.MaNCC = MaNCC;
    }

    public void setTenNCC(String TenNCC) {
        this.TenNCC = TenNCC;
    }

    public void setDiaChi(String Diachi) {
        this.DiaChi = Diachi;
    }

    public void setDienThoai(String DienThoai) {
        this.DienThoai = DienThoai;
    }

    public String getMaNCC() {
        return MaNCC;
    }

    public String getTenNCC() {
        return TenNCC;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public String getDienThoai() {
        return DienThoai;
    }
        
}
