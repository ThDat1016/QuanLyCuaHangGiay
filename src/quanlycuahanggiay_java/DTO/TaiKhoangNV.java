/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlycuahanggiay_java.DTO;

/**
 *
 * @author Admin
 */
public class TaiKhoangNV {
        private int MaNV;
	private String MatKhau;
	private String CapBac;

    public TaiKhoangNV(int MaNV, String MatKhau, String CapBac) {
        this.MaNV = MaNV;
        this.MatKhau = MatKhau;
        this.CapBac = CapBac;
    }

    public int getMaNV() {
        return MaNV;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public String getCapBac() {
        return CapBac;
    }

    public void setMaNV(int MaNV) {
        this.MaNV = MaNV;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public void setCapBac(String CapBac) {
        this.CapBac = CapBac;
    }
        
}
