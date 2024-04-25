/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quanlycuahanggiay_java;

import javax.swing.*;
import quanlycuahanggiay_java.DTO.*;
import quanlycuahanggiay_java.GUI.*;
import quanlycuahanggiay_java.DAO.*;
import java.util.ArrayList;

public class QuanLyCuaHangGiay_Java {

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }   
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
//        try {
//            NhanVienDAO nhanVienDAO = new NhanVienDAO();
//            ArrayList<NhanVien> danhSachNhanVien = nhanVienDAO.docDB();
//
//            // In ra thông tin của từng nhân viên
//            for (NhanVien nv : danhSachNhanVien) {
//                System.out.println("Mã NV: " + nv.getMaNV());
//                System.out.println("Họ và tên: " + nv.getHo() + " " + nv.getTen());
//                System.out.println("Giới tính: " + (nv.isGioiTinh() ? "Nam" : "Nữ"));
//                System.out.println("Địa chỉ: " + nv.getDiaChi());
//                System.out.println("Điện thoại: " + nv.getDienThoai());
//                System.out.println("Email: " + nv.getEmail());
//                System.out.println("Lương: " + nv.getLuong());
//                System.out.println("------------------------------------");
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }
}
