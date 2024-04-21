/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlycuahanggiay_java.DTO;

public class Giay {

    private String  strTenGiay, strDoiTuongSD, strChatLieu, strMaLoai, strMaxx, strMaMau, strMaThuongHieu;
    private int iSoLuong, iGia, iSize, strMaGiay;
    

    public Giay() {
    }

    public Giay(int strMaGiay, String strTenGiay, String strDoiTuongSD, String strChatLieu, String strMaLoai, String strMaxx, String strMaMau, String strMaThuongHieu, int iSoLuong, int iGia, int iSize) {
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

    public void setStrDoiTuongSD(String strDoiTuongSD) {
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

    public void setiGia(int iGia) {
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

    public String getStrDoiTuongSD() {
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

    public int getiGia() {
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
