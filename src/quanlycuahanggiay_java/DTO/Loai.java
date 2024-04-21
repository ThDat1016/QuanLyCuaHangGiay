/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlycuahanggiay_java.DTO;


/**
 *
 * @author Admin
 */
public class Loai {
    private String MaLoai;
    private String TenLoai;
    
    public Loai(){}
    public Loai(String Maloai, String TenLoai) {
        this.MaLoai = Maloai;
        this.TenLoai = TenLoai;
    }

    public String getMaLoai() {
        return MaLoai;
    }

    public String getTenLoai() {
        return TenLoai;
    }

    public void setMaLoai(String Maloai) {
        this.MaLoai = Maloai;
    }

    public void setTenLoai(String TenLoai) {
        this.TenLoai = TenLoai;
    }
    
}
