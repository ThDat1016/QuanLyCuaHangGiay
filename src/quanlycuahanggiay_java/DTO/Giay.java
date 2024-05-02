/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlycuahanggiay_java.DTO;
import java.math.BigDecimal;
public class Giay {

    private String  strTenGiay, strChatLieu, strMaLoai, strMaxx, strMaMau, strMaThuongHieu;
    private int iSoLuong, iSize, strMaGiay;
    private BigDecimal iGia;
    private boolean  strDoiTuongSD;
    

    public Giay() {
    }

    public Giay(int strMaGiay, String strTenGiay, boolean strDoiTuongSD, String strChatLieu, String strMaLoai, String strMaxx, String strMaMau, String strMaThuongHieu, int iSoLuong, BigDecimal iGia, int iSize) {
        this.strMaGiay = strMaGiay;
        this.strTenGiay = strTenGiay;
        this.strDoiTuongSD = strDoiTuongSD;
        this.strChatLieu = strChatLieu;
        this.strMaLoai = strMaLoai;
        this.strMaxx = strMaxx;
        this.strMaMau = strMaMau;
        this.strMaThuongHieu = strMaThuongHieu;
        this.iSoLuong = iSoLuong;
        this.iGia = iGia;
        this.iSize = iSize;
    }

    public void setStrMaGiay(int strMaGiay) {
        this.strMaGiay = strMaGiay;
    }

    public void setStrTenGiay(String strTenGiay) {
        this.strTenGiay = strTenGiay;
    }

    public void setStrDoiTuongSD(boolean strDoiTuongSD) {
        this.strDoiTuongSD = strDoiTuongSD;
    }

    public void setStrChatLieu(String strChatLieu) {
        this.strChatLieu = strChatLieu;
    }

    public void setStrMaLoai(String strMaLoai) {
        this.strMaLoai = strMaLoai;
    }

    public void setStrMaxx(String strMaxx) {
        this.strMaxx = strMaxx;
    }

    public void setStrMaMau(String strMaMau) {
        this.strMaMau = strMaMau;
    }

    public void setStrMaThuongHieu(String strMaThuongHieu) {
        this.strMaThuongHieu = strMaThuongHieu;
    }

    public void setiSoLuong(int iSoLuong) {
        this.iSoLuong = iSoLuong;
    }

    public void setiGia(BigDecimal iGia) {
        this.iGia = iGia;
    }

    public void setiSize(int iSize) {
        this.iSize = iSize;
    }

    public int getStrMaGiay() {
        return strMaGiay;
    }

    public String getStrTenGiay() {
        return strTenGiay;
    }

    public boolean getStrDoiTuongSD() {
        return strDoiTuongSD;
    }

    public String getStrChatLieu() {
        return strChatLieu;
    }

    public String getStrMaLoai() {
        return strMaLoai;
    }

    public String getStrMaxx() {
        return strMaxx;
    }

    public String getStrMaMau() {
        return strMaMau;
    }

    public String getStrMaThuongHieu() {
        return strMaThuongHieu;
    }

    public int getiSoLuong() {
        return iSoLuong;
    }

    public BigDecimal getiGia() {
        return iGia;
    }

    public int getiSize() {
        return iSize;
    }
    
 @Override
 public String toString(){
     return "Giay{" + "strMaGiay=" + strMaGiay + ", strTenGiay=" + strTenGiay + ", strDoiTuongSD=" + strDoiTuongSD + ", strChatLieu=" + strChatLieu + ", strMaLoai=" + strMaLoai + ", strMaxx=" + strMaxx + ", strMaMau=" + strMaMau + ", strMaThuongHieu=" + strMaThuongHieu + ", iSoLuong=" + iSoLuong + ", iGia=" + iGia + ", iSize=" + iSize + '}';
 }
}
