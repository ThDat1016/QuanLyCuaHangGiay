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

    private NhanVien nv;
    private String MatKhau;

    public TaiKhoangNV() {
        nv = new NhanVien();
    }

    public TaiKhoangNV(NhanVien nv, String MatKhau) {
        this.MatKhau = MatKhau;
        this.nv = nv;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public NhanVien getNv() {
        return nv;
    }

    public void setNv(NhanVien nv) {
        this.nv = nv;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

}
