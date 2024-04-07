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
    private String Maloai;
    private String TenLoai;

    public Loai(String Maloai, String TenLoai) {
        this.Maloai = Maloai;
        this.TenLoai = TenLoai;
    }

    public String getMaloai() {
        return Maloai;
    }

    public String getTenLoai() {
        return TenLoai;
    }

    public void setMaloai(String Maloai) {
        this.Maloai = Maloai;
    }

    public void setTenLoai(String TenLoai) {
        this.TenLoai = TenLoai;
    }
    
}
