/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlycuahanggiay_java.DTO;


public class XuatXu {
    private String strMaxuatxu;
    private String strTennuoc;

    public XuatXu(){}
    public XuatXu(String strMaxuatxu, String strTennuoc) {
        this.strMaxuatxu = strMaxuatxu;
        this.strTennuoc = strTennuoc;
    }

    public void setStrMaxuatxu(String strMaxuatxu) {
        this.strMaxuatxu = strMaxuatxu;
    }

    public void setStrTennuoc(String strTennuoc) {
        this.strTennuoc = strTennuoc;
    }

    public String getStrMaxuatxu() {
        return strMaxuatxu;
    }

    public String getStrTennuoc() {
        return strTennuoc;
    }
    
}
