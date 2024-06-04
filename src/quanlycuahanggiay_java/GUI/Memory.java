/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlycuahanggiay_java.GUI;

import quanlycuahanggiay_java.DTO.*;
import java.math.BigDecimal;
import java.util.ArrayList;

public class Memory {

    //Tai khoan
    static int maNV;
    static String iCapBac;

    static int index;
    //NHan vien
    static NhanVien nhanvien;

    static HoaDon hoadon;
   

    // an hien menu
    static boolean flag_Menu;

    // quesion yes or no
    static boolean yesno_Q;

    // sản phẩm
    static int maSP;
    static int MaHD;
    static int maPN;
    static String maNCC;
    static ArrayList<BigDecimal> tongTien = new ArrayList<>();
    static BigDecimal giaban;

    // link file
    static String filechoose;
}
