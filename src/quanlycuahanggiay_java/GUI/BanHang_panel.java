/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package quanlycuahanggiay_java.GUI;

import java.awt.CardLayout;
import quanlycuahanggiay_java.DTO.KhachHang;
import quanlycuahanggiay_java.DTO.HoaDon;
import quanlycuahanggiay_java.BUS.GiayBUS;
import quanlycuahanggiay_java.BUS.KhachHangBUS;
import quanlycuahanggiay_java.DTO.ChiTietHoaDon;
import quanlycuahanggiay_java.DAO.ChiTietHoaDonDAO;
import quanlycuahanggiay_java.DAO.HoaDonDAO;
import java.util.ArrayList;
import java.math.BigDecimal;
import javax.swing.AbstractAction;
import javax.swing.KeyStroke;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.time.LocalDateTime;
import javax.swing.SwingUtilities;

import quanlycuahanggiay_java.DAO.ConnectUnit;

/**
 *
 * @author Admin
 */
public class BanHang_panel extends javax.swing.JPanel {

    ArrayList<ChiTietHoaDon> chiTiet = null;

    /**
     * Creates new form BanHang_panel
     */
    public BanHang_panel() {
        Memory.tongTien.clear();
        chiTiet = new ArrayList<>();
        initComponents();
        NhapMaGiay();
        xoaDL();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        body_panel = new javax.swing.JPanel();
        add = new javax.swing.JButton();
        gia = new javax.swing.JLabel();
        delete = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        t = new javax.swing.JLabel();
        hoKH1 = new javax.swing.JLabel();
        hoKH = new javax.swing.JTextField();
        tenKH = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        diaChi = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        emailKH = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        maKM = new javax.swing.JTextField();
        MaGiay = new javax.swing.JTextField();
        SoLuong = new javax.swing.JSpinner();
        jScrollPane2 = new javax.swing.JScrollPane();
        ChiTiet = new javax.swing.JTable();
        ThanhToan = new javax.swing.JButton();
        SuaDL = new javax.swing.JButton();

        body_panel.setBackground(new java.awt.Color(250, 243, 224));
        body_panel.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(169, 169, 169)));

        add.setBackground(new java.awt.Color(51, 255, 204));
        add.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        add.setForeground(new java.awt.Color(0, 0, 0));
        add.setText("Thêm");
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
        });
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        gia.setBorder(new javax.swing.border.MatteBorder(null));

        delete.setBackground(new java.awt.Color(51, 255, 204));
        delete.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        delete.setForeground(new java.awt.Color(0, 0, 0));
        delete.setText("Xóa");
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
        });
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Thông tin khách hàng");

        t.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        t.setForeground(new java.awt.Color(0, 0, 0));
        t.setText("Tên");

        hoKH1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        hoKH1.setForeground(new java.awt.Color(0, 0, 0));
        hoKH1.setText("Họ");

        hoKH.setBackground(new java.awt.Color(51, 255, 204));
        hoKH.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        tenKH.setBackground(new java.awt.Color(51, 255, 204));
        tenKH.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tenKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tenKHActionPerformed(evt);
            }
        });

        jCheckBox1.setBackground(new java.awt.Color(51, 255, 204));
        jCheckBox1.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox1.setText("Nam");
        jCheckBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox1MouseClicked(evt);
            }
        });

        jCheckBox2.setBackground(new java.awt.Color(51, 255, 204));
        jCheckBox2.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox2.setText("Nữ");
        jCheckBox2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox2MouseClicked(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Giới tính");

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Địa chỉ");

        diaChi.setBackground(new java.awt.Color(51, 255, 204));
        diaChi.setForeground(new java.awt.Color(0, 0, 0));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Nhập Hóa Đơn");

        email.setBackground(new java.awt.Color(255, 255, 255));
        email.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        email.setForeground(new java.awt.Color(0, 0, 0));
        email.setText("Email");

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Mã giày*");

        emailKH.setBackground(new java.awt.Color(51, 255, 204));
        emailKH.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        emailKH.setForeground(new java.awt.Color(0, 0, 0));
        emailKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailKHActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Số lượng*");

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Giá bán");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Mã khuyến mãi:");

        maKM.setBackground(new java.awt.Color(51, 255, 204));
        maKM.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        maKM.setForeground(new java.awt.Color(0, 0, 0));

        MaGiay.setBackground(new java.awt.Color(51, 255, 204));
        MaGiay.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        ChiTiet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Giày", "Số lượng", "Giá bán"
            }
        ));
        ChiTiet.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                ChiTietComponentShown(evt);
            }
        });
        jScrollPane2.setViewportView(ChiTiet);

        ThanhToan.setBackground(new java.awt.Color(153, 255, 153));
        ThanhToan.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        ThanhToan.setForeground(new java.awt.Color(0, 0, 0));
        ThanhToan.setText("THANH TOÁN");
        ThanhToan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ThanhToanMouseClicked(evt);
            }
        });
        ThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThanhToanActionPerformed(evt);
            }
        });

        SuaDL.setBackground(new java.awt.Color(51, 255, 204));
        SuaDL.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        SuaDL.setForeground(new java.awt.Color(0, 0, 0));
        SuaDL.setText("Sửa");
        SuaDL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SuaDLMouseClicked(evt);
            }
        });
        SuaDL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SuaDLActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout body_panelLayout = new javax.swing.GroupLayout(body_panel);
        body_panel.setLayout(body_panelLayout);
        body_panelLayout.setHorizontalGroup(
            body_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(body_panelLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(body_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(body_panelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 189, Short.MAX_VALUE)
                        .addGroup(body_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(body_panelLayout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 387, Short.MAX_VALUE)
                                .addComponent(ThanhToan))
                            .addGroup(body_panelLayout.createSequentialGroup()
                                .addGroup(body_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(body_panelLayout.createSequentialGroup()
                                        .addGroup(body_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(body_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(hoKH1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel9)
                                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(body_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(emailKH, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(body_panelLayout.createSequentialGroup()
                                                .addComponent(hoKH, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(t, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(2, 2, 2)
                                                .addComponent(tenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(body_panelLayout.createSequentialGroup()
                                                .addComponent(jCheckBox1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(diaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(body_panelLayout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(maKM, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(body_panelLayout.createSequentialGroup()
                        .addGroup(body_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(body_panelLayout.createSequentialGroup()
                                .addGroup(body_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(body_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(MaGiay, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(gia, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(body_panelLayout.createSequentialGroup()
                                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(SuaDL, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73)
                                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(398, Short.MAX_VALUE))))
        );
        body_panelLayout.setVerticalGroup(
            body_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(body_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(body_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(body_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hoKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hoKH1)
                    .addComponent(t, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tenKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MaGiay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(7, 7, 7)
                .addGroup(body_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2)
                    .addComponent(jLabel19)
                    .addComponent(SoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(body_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(diaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(body_panelLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(body_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gia, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20))))
                .addGap(18, 18, 18)
                .addGroup(body_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(email)
                    .addComponent(emailKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(body_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(body_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delete)
                    .addComponent(add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SuaDL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1049, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(body_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 562, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(body_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked

    }//GEN-LAST:event_addMouseClicked

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        if (MaGiay.getText().isEmpty() || gia.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đủ thông tin", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        ChiTietHoaDon e = new ChiTietHoaDon();
        e.getGiay().setStrMaGiay(Integer.parseInt(MaGiay.getText()));
        BigDecimal giaBan = new BigDecimal(gia.getText());
        BigDecimal soLuong = new BigDecimal((int) SoLuong.getValue());
        BigDecimal thanhTien = giaBan.multiply(soLuong);
        e.setGiaBan(thanhTien);
        e.getHd().setMaHD(0); // khi nhận thanh toán, mã hóa đơn sẽ trở thành mã hóa đơn mới nhất (vì lúc này chưa tạo hóa đơn)
        e.setSoluong((int) SoLuong.getValue());

        if (e.getSoluong() == 0) {
            JOptionPane.showMessageDialog(this, "Số lượng không được để trống", "Thông báo", JOptionPane.WARNING_MESSAGE);
            SoLuong.setValue(0);
            SoLuong.requestFocus();
            return;
        }

        try {
            GiayBUS giay = new GiayBUS();
            int temp = giay.getInfor(e.getGiay().getStrMaGiay()).getiSoLuong();
            if (temp < e.getSoluong()) {
                JOptionPane.showMessageDialog(this, "Số lượng vượt quá sản phẩm có sẵn", "Thông báo", JOptionPane.WARNING_MESSAGE);
                SoLuong.setValue(0);
                SoLuong.requestFocus();
            } else {
                chiTiet.add(e);

                DefaultTableModel model = (DefaultTableModel) ChiTiet.getModel();
                Object[] rowData = {e.getGiay().getStrMaGiay(), e.getSoluong(), e.getGiaBan()};
                model.addRow(rowData);

                Memory.tongTien.add(thanhTien);
            }
        } catch (Exception ex) {
            System.out.println("Lỗi xảy ra: " + ex.getMessage());
        }

        MaGiay.setText("");
        SoLuong.setValue(0);
        gia.setText("");
        MaGiay.requestFocus();
    }//GEN-LAST:event_addActionPerformed

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
        try {
            int rowIndex = ChiTiet.getSelectedRow();
            if (rowIndex != -1) {
                DefaultTableModel model = (DefaultTableModel) ChiTiet.getModel();
                model.removeRow(rowIndex);
                chiTiet.remove(rowIndex);
                Memory.tongTien.remove(rowIndex);
                MaGiay.setText("");
                SoLuong.setValue(0);
                gia.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "Vui lòng chọn một dòng để xóa.", "Thông báo", JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_deleteMouseClicked
    public BigDecimal TongTienHD(ArrayList<BigDecimal> arr) {
        BigDecimal sum = new BigDecimal("0");
        for (BigDecimal temp : arr) {
            sum = sum.add(temp);
        }
        return sum;
    }

    private void xoaDL() {
        ListSelectionModel LM = ChiTiet.getSelectionModel();
        try {
            LM.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // chỉ cho phép chọn 1 dòng
            LM.addListSelectionListener(new ListSelectionListener() {
                @Override
                public void valueChanged(ListSelectionEvent event) {
                    if (!event.getValueIsAdjusting()) { // Kiểm tra xem sự kiện chọn đã kết thúc chưa
                        int[] rows = ChiTiet.getSelectedRows();
                        int[] cols = ChiTiet.getSelectedColumns();
                        if (rows.length > 0) { // Đảm bảo có ít nhất một hàng được chọn
                            Memory.index = ChiTiet.getSelectedRow();

                            String maGiay = String.valueOf(ChiTiet.getValueAt(rows[0], 0));
                            int soLuong = (int) ChiTiet.getValueAt(rows[0], 1);
                            String giaBan = String.valueOf(ChiTiet.getValueAt(rows[0], 2));
                            Memory.maSP = Integer.parseInt(maGiay);

                        }
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void NhapMaGiay() {
        MaGiay.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "enter");
        MaGiay.getActionMap().put("enter", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String maGiay = MaGiay.getText();
                    int maGiayInt = Integer.parseInt(maGiay);
                    GiayBUS giay = new GiayBUS();
                    gia.setText(giay.getInfor(maGiayInt).getiGia().toString());
                    int soLuongGiaTrenKho = giay.getInfor(maGiayInt).getiSoLuong();
                    int soLuongNhap = (int) SoLuong.getValue();
                    int soLuongMoi = soLuongGiaTrenKho - soLuongNhap;

                    if (soLuongMoi >= 0) {
                        giay.getInfor(maGiayInt).setiSoLuong(soLuongMoi);

                    } else {
                        JOptionPane.showMessageDialog(null, "Số lượng vượt quá hàng trong kho", "Error", JOptionPane.ERROR_MESSAGE);
                        SoLuong.setValue(0);
                        SoLuong.requestFocus();
                    }

                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }

        });
    }
    private void tenKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tenKHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tenKHActionPerformed

    private void jCheckBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox1MouseClicked

    }//GEN-LAST:event_jCheckBox1MouseClicked

    private void jCheckBox2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox2MouseClicked

    }//GEN-LAST:event_jCheckBox2MouseClicked

    private void emailKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailKHActionPerformed

    }//GEN-LAST:event_emailKHActionPerformed

    private void ChiTietComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_ChiTietComponentShown

    }//GEN-LAST:event_ChiTietComponentShown

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteActionPerformed
    public KhachHang InforKH() {

        KhachHang kh = new KhachHang();

        kh.setHo(hoKH.getText());
        kh.setTen(tenKH.getText()); // Use the corresponding data fields
        BigDecimal mucGioiHan = new BigDecimal("100000000.00");
        BigDecimal tongChiTieu = kh.getTongChiTieu();
        if (tongChiTieu != null && tongChiTieu.compareTo(mucGioiHan) >= 0) {
            kh.setLoai("VIP");
        } else {
            kh.setLoai("Thuong");
        }
        if (jCheckBox1.isSelected()) {
            kh.setGioiTinh(true);
        }
        if (jCheckBox2.isSelected()) {
            kh.setGioiTinh(false); // female
        }
        kh.setDiaChi(diaChi.getText());
        kh.setEmail(email.getText());
        return kh;
    }
    private void ThanhToanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ThanhToanMouseClicked

        try {
            HoaDon hd = new HoaDon();
            KhachHangBUS kh = new KhachHangBUS();
            ConnectUnit conn = new ConnectUnit();
            HoaDonDAO hdBUS = new HoaDonDAO();
            ChiTietHoaDonDAO chiTietHDBUS = new ChiTietHoaDonDAO();
            int maKH = kh.getNumbKH() + 1;
            System.out.println(maKH);
            LocalDateTime ngayHienTai = LocalDateTime.now();
            java.sql.Date sqlDate = java.sql.Date.valueOf(ngayHienTai.toLocalDate());
            hd.setNgayBan(sqlDate);
            hd.getKm().setMaKM(maKM.getText());
            hd.getNv().setMaNV(Memory.nhanvien.getMaNV());

            hd.setThue(0.1f);
            hd.getKh().setMaKH(maKH);
            hd.setTongTien(TongTienHD(Memory.tongTien));
            hd.setThue(1);
            if (InforKH() != null) {

                kh.them(InforKH());
                System.out.println("m");
            } else {
                System.out.println("null");
            }

            hdBUS.them(hd);
            int maxHD = conn.getMaxMaHD();

            for (ChiTietHoaDon hoadon : chiTiet) {
                System.out.println(maxHD);
                hoadon.getHd().setMaHD(maxHD);
                chiTietHDBUS.them(hoadon);
                System.out.println(hoadon.getGiay().getStrMaGiay());
            }
            MainFrame1 mf = (MainFrame1) SwingUtilities.getWindowAncestor(this);

            // Tạo panel mới HoaDonGUI_panel
            HoaDonGUI_panel hdp = new HoaDonGUI_panel();

            // Thêm panel mới vào Body_panel của MainFrame1
            mf.getBody_panel().add(hdp, "HoaDonGUI_panel");

            // Sử dụng CardLayout để chuyển đến HoaDonGUI_panel
            CardLayout cl = (CardLayout) (mf.getBody_panel().getLayout());
            cl.show(mf.getBody_panel(), "HoaDonGUI_panel");

            // Cập nhật giao diện người dùng
            mf.getBody_panel().revalidate();
            mf.getBody_panel().repaint();

        } catch (Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(this, "Hóa đơn trống", "Error", JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_ThanhToanMouseClicked

    private void ThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThanhToanActionPerformed


    }//GEN-LAST:event_ThanhToanActionPerformed

    private void SuaDLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SuaDLMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_SuaDLMouseClicked

    private void SuaDLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SuaDLActionPerformed
        ListSelectionModel LM = ChiTiet.getSelectionModel();
        try {
            LM.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // Chỉ cho phép chọn 1 dòng
            int selectedRow = ChiTiet.getSelectedRow();
            if (selectedRow >= 0) { // Đảm bảo có ít nhất một hàng được chọn
                int soLuongHienTai = (int) ChiTiet.getValueAt(selectedRow, 1);
                String newSoLuongStr = JOptionPane.showInputDialog(null, "Nhập số lượng mới:", soLuongHienTai);
                if (newSoLuongStr != null && !newSoLuongStr.trim().isEmpty()) {
                    try {
                        int newSoLuong = Integer.parseInt(newSoLuongStr);
                        if (newSoLuong < 0) {
                            throw new NumberFormatException();
                        }
                        // Cập nhật giá trị trong bảng
                        ChiTiet.setValueAt(newSoLuong, selectedRow, 1);

                        // Cập nhật đối tượng chiTiet
                        ChiTietHoaDon chiTietHoaDon = chiTiet.get(selectedRow);
                        BigDecimal giaBan = chiTietHoaDon.getGiaBan().divide(BigDecimal.valueOf(chiTietHoaDon.getSoluong())); // Lấy giá đơn vị
                        BigDecimal soLuong = new BigDecimal(newSoLuong);
                        BigDecimal thanhTien = giaBan.multiply(soLuong);
                        chiTietHoaDon.setSoluong(newSoLuong);
                        chiTietHoaDon.setGiaBan(thanhTien);

                        // Cập nhật tổng tiền
                        if (selectedRow < Memory.tongTien.size()) {
                            Memory.tongTien.set(selectedRow, thanhTien);
                        } else {
                            Memory.tongTien.add(thanhTien);
                        }
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Số lượng không hợp lệ! Vui lòng nhập một số nguyên không âm.", "Lỗi", JOptionPane.ERROR_MESSAGE);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Vui lòng chọn một sản phẩm để sửa.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_SuaDLActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ChiTiet;
    private javax.swing.JTextField MaGiay;
    private javax.swing.JSpinner SoLuong;
    private javax.swing.JButton SuaDL;
    private javax.swing.JButton ThanhToan;
    private javax.swing.JButton add;
    private javax.swing.JPanel body_panel;
    private javax.swing.JButton delete;
    private javax.swing.JTextField diaChi;
    private javax.swing.JLabel email;
    private javax.swing.JTextField emailKH;
    private javax.swing.JLabel gia;
    private javax.swing.JTextField hoKH;
    private javax.swing.JLabel hoKH1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField maKM;
    private javax.swing.JLabel t;
    private javax.swing.JTextField tenKH;
    // End of variables declaration//GEN-END:variables
}
