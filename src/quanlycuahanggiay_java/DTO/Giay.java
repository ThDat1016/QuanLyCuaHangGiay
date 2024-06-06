/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlycuahanggiay_java.DTO;

import java.math.BigDecimal;

public class Giay {

    private String strTenGiay;
    private String strChatLieu;
    private Loai loai;
    private XuatXu xx;
    private MauSac mausac;
    private ThuongHieu thuonghieu;
    private int iSoLuong, iSize, strMaGiay;
    private BigDecimal iGia;
    private boolean strDoiTuongSD;

    public Giay(String strTenGiay, String strChatLieu, Loai loai, XuatXu xx, MauSac mausac, ThuongHieu thuonghieu, int iSoLuong, int iSize, int strMaGiay, BigDecimal iGia, boolean strDoiTuongSD) {
        this.strTenGiay = strTenGiay;
        this.strChatLieu = strChatLieu;
        this.loai = loai;
        this.xx = xx;
        this.mausac = mausac;
        this.thuonghieu = thuonghieu;
        this.iSoLuong = iSoLuong;
        this.iSize = iSize;
        this.strMaGiay = strMaGiay;
        this.iGia = iGia;
        this.strDoiTuongSD = strDoiTuongSD;
    }

    public Giay() {
        loai = new Loai();
        xx = new XuatXu();
        mausac = new MauSac();
        thuonghieu = new ThuongHieu();

    }

    public String getStrChatLieu() {
        return strChatLieu;
    }

    public void setStrChatLieu(String strChatLieu) {
        this.strChatLieu = strChatLieu;
    }

    public String getStrTenGiay() {
        return strTenGiay;
    }

    public void setStrTenGiay(String strTenGiay) {
        this.strTenGiay = strTenGiay;
    }

    public void setLoai(Loai loai) {
        this.loai = loai;
    }

    public void setXx(XuatXu xx) {
        this.xx = xx;
    }

    public void setMausac(MauSac mausac) {
        this.mausac = mausac;
    }

    public void setThuonghieu(ThuongHieu thuonghieu) {
        this.thuonghieu = thuonghieu;
    }

    public void setiSoLuong(int iSoLuong) {
        this.iSoLuong = iSoLuong;
    }

    public void setiSize(int iSize) {
        this.iSize = iSize;
    }

    public void setStrMaGiay(int strMaGiay) {
        this.strMaGiay = strMaGiay;
    }

    public void setiGia(BigDecimal iGia) {
        this.iGia = iGia;
    }

    public void setStrDoiTuongSD(boolean strDoiTuongSD) {
        this.strDoiTuongSD = strDoiTuongSD;
    }

    public Loai getLoai() {
        return loai;
    }

    public XuatXu getXx() {
        return xx;
    }

    public MauSac getMausac() {
        return mausac;
    }

    public ThuongHieu getThuonghieu() {
        return thuonghieu;
    }

    public int getiSoLuong() {
        return iSoLuong;
    }

    public int getiSize() {
        return iSize;
    }

    public int getStrMaGiay() {
        return strMaGiay;
    }

    public BigDecimal getiGia() {
        return iGia;
    }

    public boolean isStrDoiTuongSD() {
        return strDoiTuongSD;
    }

    @Override
    public String toString() {
        return "Giay{" + "strMaGiay=" + strMaGiay + ", strTenGiay=" + strTenGiay + ", strDoiTuongSD=" + strDoiTuongSD + ", strChatLieu=" + strChatLieu + ", strMaLoai=" + strMaLoai + ", strMaxx=" + strMaxx + ", strMaMau=" + strMaMau + ", strMaThuongHieu=" + strMaThuongHieu + ", iSoLuong=" + iSoLuong + ", iGia=" + iGia + ", iSize=" + iSize + '}';
    }
}
