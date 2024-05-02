/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quanlycuahanggiay_java.GUI;

import quanlycuahanggiay_java.BUS.ChiTietHoaDonBUS;
import quanlycuahanggiay_java.BUS.ChiTietKMBUS;
import quanlycuahanggiay_java.BUS.HoaDonBUS;
import quanlycuahanggiay_java.BUS.KhachHangBUS;
import quanlycuahanggiay_java.BUS.KhuyenMaiBUS;
import quanlycuahanggiay_java.BUS.GiayBUS;
import quanlycuahanggiay_java.DTO.ChiTietHoaDon;
import quanlycuahanggiay_java.DTO.ChuongTrinhKhuyenMai;
import quanlycuahanggiay_java.DTO.KhachHang;
import quanlycuahanggiay_java.DTO.ChiTietChuongTrinhKhuyenMai;
import quanlycuahanggiay_java.DTO.Giay;
import quanlycuahanggiay_java.DTO.HoaDon;
import quanlycuahanggiay_java.DAO.HoaDonDAO;

import quanlycuahanggiay_java.DAO.ConnectUnit;
import quanlycuahanggiay_java.DAO.ConectToDB;

import java.sql.ResultSet;
import java.sql.Connection;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.math.BigDecimal;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class HoaDonGUI extends javax.swing.JFrame {

    /**
     * Creates new form HoaDonGUI
     */
    public HoaDonGUI() {

        JPanel jPanel4 = new JPanel();
        jPanel4.setBorder(BorderFactory.createLineBorder(Color.BLUE, 3)); // Tạo viền màu xanh, độ dày 3 pixel

        JPanel jPanel5 = new JPanel();
        jPanel5.setBorder(BorderFactory.createLineBorder(Color.GREEN, 3)); // Tạo viền màu xanh lá cây, độ dày 3 pixel

        initComponents();

    }
    private CacChucNangQuanTrong cachamquantrong;
    private Color colorPanel_Top, colorPanel_Center, colorText;
    private JLabel[] listLblTop;
    private String[] strArr_Top;
    private HoaDonBUS list_HD;
    private ChiTietHoaDonBUS list_ChiTietHD;
    private ChiTietKMBUS list_ChiTietKM;
    private GiayBUS list_SanPham;
    private KhachHangBUS list_KH;
    private KhuyenMaiBUS list_KM;
    private BigDecimal TongTien;
    private HoaDon hoadon;
    private String[] strMonths = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
        "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    /**
     * Ngày của hệ thống
     */
    private String date1 = LocalDateTime.now().getDayOfMonth() + " "
            + LocalDateTime.now().getMonth() + " "
            + LocalDateTime.now().getYear();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        BackHome = new javax.swing.JLabel();
        HD = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ChiTietHD = new javax.swing.JTable();
        TT = new javax.swing.JLabel();
        MaKH = new javax.swing.JLabel();
        MaHD = new javax.swing.JLabel();
        MaKM = new javax.swing.JLabel();
        MaNV = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        DeletdHD = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ChiTiet = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });

        BackHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlycuahanggiay_java/images/back1.png"))); // NOI18N
        BackHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackHomeMouseClicked(evt);
            }
        });

        HD.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        HD.setForeground(new java.awt.Color(0, 0, 0));
        HD.setText("HÓA ĐƠN");
        HD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HDMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("NHẬP HÀNG");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("THỐNG KÊ");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("KHUYỂN MÃI");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("XUẤT EXCEL");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("HÀNG HÓA");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(204, 204, 0)));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel4ComponentShown(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Mã hóa đơn");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Mã nhân viên");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Mã khách hàng");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Mã khuyến mãi");

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Tổng tiền");

        jLabel11.setForeground(new java.awt.Color(51, 255, 204));

        ChiTietHD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        ChiTietHD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChiTietHDMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(ChiTietHD);

        TT.setBackground(new java.awt.Color(51, 255, 204));
        TT.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        TT.setForeground(new java.awt.Color(0, 0, 0));

        MaKH.setBackground(new java.awt.Color(51, 255, 204));
        MaKH.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        MaKH.setForeground(new java.awt.Color(0, 0, 0));

        MaHD.setBackground(new java.awt.Color(51, 255, 204));
        MaHD.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        MaHD.setForeground(new java.awt.Color(0, 0, 0));

        MaKM.setBackground(new java.awt.Color(51, 255, 204));
        MaKM.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        MaKM.setForeground(new java.awt.Color(0, 0, 0));

        MaNV.setBackground(new java.awt.Color(51, 255, 204));
        MaNV.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        MaNV.setForeground(new java.awt.Color(0, 0, 0));

        jButton1.setBackground(new java.awt.Color(51, 255, 204));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Tạo mới");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        DeletdHD.setBackground(new java.awt.Color(51, 255, 204));
        DeletdHD.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        DeletdHD.setForeground(new java.awt.Color(0, 0, 0));
        DeletdHD.setText("Xóa");
        DeletdHD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeletdHDMouseClicked(evt);
            }
        });
        DeletdHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletdHDActionPerformed(evt);
            }
        });

        ChiTiet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã Giày", "Mã HD", "Số lượng", "Giá bán", "Mã khuyến mãi", "Tỉ lệ khuyến mãi"
            }
        ));
        ChiTiet.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                ChiTietComponentShown(evt);
            }
        });
        jScrollPane2.setViewportView(ChiTiet);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(MaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(MaHD, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(MaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MaKM, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 696, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(TT, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(201, 201, 201)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(227, 227, 227)
                                        .addComponent(jButton1)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(34, 34, 34)
                    .addComponent(DeletdHD, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(929, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MaHD, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(MaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(MaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TT, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(MaKM, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jButton1)
                .addGap(88, 88, 88)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(236, 236, 236)
                    .addComponent(DeletdHD)
                    .addContainerGap(373, Short.MAX_VALUE)))
        );

        jLabel1.setBackground(new java.awt.Color(153, 255, 153));
        jLabel1.setForeground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(93, 93, 93))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(823, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(HD, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BackHome, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1086, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BackHome, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(HD, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1438, 1438, 1438)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HDMouseClicked
        HoaDonGUI hd = new HoaDonGUI();
        hd.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_HDMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        NhapHang nh = new NhapHang();
        nh.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        ThongKe tk = new ThongKe();
        tk.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        // TODO add your handling code here:
        KhuyenMai km = new KhuyenMai();
        km.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanel3MouseClicked

    private void BackHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackHomeMouseClicked

        Home home = new Home();
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackHomeMouseClicked
    private void showDuLieu() {
        String[] arr = {"Mã HĐ", "Mã KH", "Mã KM", "Mã NV", "Ngày bán", "Tổng tiền"};
        DefaultTableModel model = new DefaultTableModel(arr, 0);

        ConnectUnit connect = new ConnectUnit();
        try {
            ResultSet result = connect.Select("HOADON"); // Lấy dữ liệu từ bảng HOADON

            // Thêm dữ liệu mới vào bảng
            while (result.next()) {
                int maHD = result.getInt("MAHD");
                int maKH = result.getInt("MAKH");
                String maKM = result.getString("MAKM");
                int maNV = result.getInt("MANV");
                Date ngayBan = result.getDate("NGAYBAN");
                BigDecimal tongTien = result.getBigDecimal("TONGTIEN");

                String maHDString = String.valueOf(maHD);
                String maKHString = String.valueOf(maKH);

                String maNVString = String.valueOf(maNV);
                String ngayBanString = String.valueOf(ngayBan);
                String tongTienString = String.valueOf(tongTien);

                String[] rowData = {maHDString, maKHString, maKM, maNVString, ngayBanString, tongTienString};

                // Thêm hàng mới vào bảng
                model.addRow(rowData);
            }

            ListSelectionModel LM = ChiTietHD.getSelectionModel();
            LM.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // chi cho phep chon 1 dong

            LM.addListSelectionListener(new ListSelectionListener() {
                @Override
                public void valueChanged(ListSelectionEvent event) {
                    if (!event.getValueIsAdjusting()) { // Kiểm tra xem sự kiện chọn đã kết thúc chưa
                        int[] rows = ChiTietHD.getSelectedRows();
                        int[] cols = ChiTietHD.getSelectedColumns();

                        if (rows.length > 0 && cols.length > 0) { // Đảm bảo có ít nhất một hàng và một cột được chọn

                            String maHD = String.valueOf(ChiTietHD.getValueAt(rows[0], 0));
                            String maKH = String.valueOf(ChiTietHD.getValueAt(rows[0], 1));
                            String maKM = String.valueOf(ChiTietHD.getValueAt(rows[0], 2));
                            String maNV = String.valueOf(ChiTietHD.getValueAt(rows[0], 3));
                            String tongTien = String.valueOf(ChiTietHD.getValueAt(rows[0], 5));
                            // Lưu lại mã hóa đơn đang được chọn
                            Memory.MaHD = Integer.parseInt(String.valueOf(ChiTietHD.getValueAt(rows[0], 0)));;
                            // Gán giá trị của các cột vào các thành phần tương ứng
                            MaHD.setText(maHD);
                            MaKH.setText(maKH);
                            MaKM.setText(maKM);
                            MaNV.setText(maNV);
                            TT.setText(tongTien);

                            String[] secondColumnNames = {"Mã giày", "Mã hóa đơn", "Số lượng", "Giá bán"};
                            DefaultTableModel Model2 = new DefaultTableModel(secondColumnNames, 0);
                            ConnectUnit connect = new ConnectUnit();

                            try {
                                ResultSet result2 = connect.Select("CHITIETHOADON", "MAHD = " + Memory.MaHD);

                                while (result2.next()) {
                                    int maGiay = result2.getInt("MAGIAY");
                                    int soLuong = result2.getInt("SOLUONG");
                                    BigDecimal giaBan = result2.getBigDecimal("GIABAN");

                                    String[] rowData = {String.valueOf(maGiay), String.valueOf(Memory.MaHD), String.valueOf(soLuong), String.valueOf(giaBan)};
                                    Model2.addRow(rowData);
                                }

                                // Gán model mới cho bảng thứ hai
                                ChiTiet.setModel(Model2);
                            } catch (Exception ex) {
                                // Xử lý ngoại lệ
                                ex.printStackTrace();
                            }
                        }
                    }
                }
            });
        } catch (Exception e) {
            // Xử lý ngoại lệ
            e.printStackTrace();
        } finally {
            try {
                connect.Close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        // Gán model mới cho bảng
        ChiTietHD.setModel(model);
    }
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        showDuLieu();
    }//GEN-LAST:event_formComponentShown

    private void ChiTietComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_ChiTietComponentShown

    }//GEN-LAST:event_ChiTietComponentShown

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        
        BanHang bh = new BanHang();
        bh.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    private void ChiTietHDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChiTietHDMouseClicked

    }//GEN-LAST:event_ChiTietHDMouseClicked

    private void DeletdHDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeletdHDMouseClicked
        ConnectUnit connect = new ConnectUnit();
        try {
            connect.Delete("CHITIETHOADON", "MAHD = " + Memory.MaHD);
            connect.Delete("HOADON", "MAHD = " + Memory.MaHD);
            HoaDonGUI hd = new HoaDonGUI();
            hd.setVisible(true);
            this.dispose();
        } catch (Exception e) {
            System.out.println("Khong the xoa");
        }

    }//GEN-LAST:event_DeletdHDMouseClicked

    private void DeletdHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletdHDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeletdHDActionPerformed

    private void jPanel4ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel4ComponentShown
     
    }//GEN-LAST:event_jPanel4ComponentShown

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
            java.util.logging.Logger.getLogger(HoaDonGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HoaDonGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HoaDonGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HoaDonGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HoaDonGUI().setVisible(true);
            }
        });
    }

    //private HoaDonDAO hdDAO;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackHome;
    private javax.swing.JTable ChiTiet;
    private javax.swing.JTable ChiTietHD;
    private javax.swing.JButton DeletdHD;
    private javax.swing.JLabel HD;
    private javax.swing.JLabel MaHD;
    private javax.swing.JLabel MaKH;
    private javax.swing.JLabel MaKM;
    private javax.swing.JLabel MaNV;
    private javax.swing.JLabel TT;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
