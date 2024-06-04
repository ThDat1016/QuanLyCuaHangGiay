/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package quanlycuahanggiay_java.GUI;

import java.awt.CardLayout;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import quanlycuahanggiay_java.DAO.ConnectUnit;

/**
 *
 * @author Admin
 */
public class NhapHang_panel extends javax.swing.JPanel {

    /**
     * Creates new form NhapHang_panel
     */
    public NhapHang_panel() {
        initComponents();
        ShowPhieuNhap();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        body_panel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        TaoMoi = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        DeletdHD = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        MaNCC = new javax.swing.JLabel();
        TongTien = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        NgayNhap = new javax.swing.JLabel();
        MaNV = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        MaPN = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ChiTiet = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        PhieuNhap = new javax.swing.JTable();
        excel = new javax.swing.JButton();
        excel_ct = new javax.swing.JButton();

        body_panel.setBackground(new java.awt.Color(250, 243, 224));
        body_panel.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(169, 169, 169)));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Mã nhà cung cấp");

        TaoMoi.setBackground(new java.awt.Color(51, 255, 204));
        TaoMoi.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        TaoMoi.setForeground(new java.awt.Color(0, 0, 0));
        TaoMoi.setText("Tạo mới");
        TaoMoi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TaoMoiMouseClicked(evt);
            }
        });
        TaoMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TaoMoiActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Ngày nhập");

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

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Tổng tiền");

        MaNCC.setBackground(new java.awt.Color(51, 255, 204));
        MaNCC.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        MaNCC.setForeground(new java.awt.Color(0, 0, 0));

        TongTien.setBackground(new java.awt.Color(51, 255, 204));
        TongTien.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        TongTien.setForeground(new java.awt.Color(0, 0, 0));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Mã phiếu nhập");

        NgayNhap.setBackground(new java.awt.Color(51, 255, 204));
        NgayNhap.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        NgayNhap.setForeground(new java.awt.Color(0, 0, 0));

        MaNV.setBackground(new java.awt.Color(51, 255, 204));
        MaNV.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        MaNV.setForeground(new java.awt.Color(0, 0, 0));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Mã nhân viên");

        MaPN.setBackground(new java.awt.Color(255, 255, 255));
        MaPN.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        MaPN.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("NHẬP HÀNG");

        ChiTiet.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(ChiTiet);

        PhieuNhap.setModel(new javax.swing.table.DefaultTableModel(
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
        PhieuNhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PhieuNhapMouseClicked(evt);
            }
        });
        PhieuNhap.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                PhieuNhapComponentShown(evt);
            }
        });
        jScrollPane3.setViewportView(PhieuNhap);

        excel.setBackground(new java.awt.Color(51, 255, 204));
        excel.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        excel.setForeground(new java.awt.Color(0, 0, 0));
        excel.setText("Xuất Excel");
        excel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                excelMouseClicked(evt);
            }
        });
        excel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excelActionPerformed(evt);
            }
        });

        excel_ct.setBackground(new java.awt.Color(51, 255, 204));
        excel_ct.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        excel_ct.setForeground(new java.awt.Color(0, 0, 0));
        excel_ct.setText("Xuất Chi Tiết");
        excel_ct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                excel_ctMouseClicked(evt);
            }
        });
        excel_ct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excel_ctActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout body_panelLayout = new javax.swing.GroupLayout(body_panel);
        body_panel.setLayout(body_panelLayout);
        body_panelLayout.setHorizontalGroup(
            body_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(body_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(body_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(body_panelLayout.createSequentialGroup()
                        .addGroup(body_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11))
                        .addGap(57, 57, 57)
                        .addGroup(body_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NgayNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(body_panelLayout.createSequentialGroup()
                        .addGroup(body_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(body_panelLayout.createSequentialGroup()
                                .addGroup(body_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DeletdHD, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)
                                .addGroup(body_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(body_panelLayout.createSequentialGroup()
                                        .addComponent(TaoMoi)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(excel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(excel_ct)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(body_panelLayout.createSequentialGroup()
                                .addGroup(body_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(body_panelLayout.createSequentialGroup()
                                        .addGroup(body_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel9))
                                        .addGap(33, 33, 33)
                                        .addGroup(body_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(MaPN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(MaNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
            .addComponent(jScrollPane3)
        );
        body_panelLayout.setVerticalGroup(
            body_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(body_panelLayout.createSequentialGroup()
                .addGroup(body_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(body_panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(body_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(body_panelLayout.createSequentialGroup()
                                .addGroup(body_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(MaPN, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(body_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(MaNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(body_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(MaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(NgayNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(body_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(body_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DeletdHD)
                    .addComponent(TaoMoi)
                    .addComponent(excel)
                    .addComponent(excel_ct))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(body_panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(body_panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TaoMoiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TaoMoiMouseClicked

        try {
            // Lấy cửa sổ chứa thành phần hiện tại
            MainFrame1 mf = (MainFrame1) SwingUtilities.getWindowAncestor(this);

            // Tạo panel mới HoaDonGUI_panel
            FormNhapHang_panel hdp = new FormNhapHang_panel();

            // Thêm panel mới vào Body_panel của MainFrame1
            mf.getBody_panel().add(hdp, "FormNhapHang_panel");

            // Sử dụng CardLayout để chuyển đến HoaDonGUI_panel
            CardLayout cl = (CardLayout) (mf.getBody_panel().getLayout());
            cl.show(mf.getBody_panel(), "FormNhapHang_panel");

            // Cập nhật giao diện người dùng
            mf.getBody_panel().revalidate();
            mf.getBody_panel().repaint();

        } catch (Exception e) {
        }
    }//GEN-LAST:event_TaoMoiMouseClicked

    private void TaoMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TaoMoiActionPerformed

    }//GEN-LAST:event_TaoMoiActionPerformed
    private void resetChiTietTable() {
        String[] secondColumnNames = {"Mã giày", "Số lượng", "Giá nhập"};
        DefaultTableModel model = new DefaultTableModel(secondColumnNames, 0);
        ChiTiet.setModel(model);
    }
    private void DeletdHDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeletdHDMouseClicked
        ConnectUnit connect = new ConnectUnit();
        try {
            connect.Delete("CHITIETPHIEUNHAP", "MAPN = " + Memory.maPN);
            connect.Delete("PHIEUNHAP", "MAPN = " + Memory.maPN);
            ShowPhieuNhap();
            resetChiTietTable();
            MaPN.setText("");
            MaNV.setText("");
            MaNCC.setText("");
            NgayNhap.setText("");
            TongTien.setText("");
        } catch (Exception e) {
            System.out.println("Khong the xoa");
        }
    }//GEN-LAST:event_DeletdHDMouseClicked

    private void DeletdHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletdHDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeletdHDActionPerformed

    private void PhieuNhapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PhieuNhapMouseClicked

    }//GEN-LAST:event_PhieuNhapMouseClicked
    private void ShowPhieuNhap() {
        String[] arr = {"Mã PN", "Mã nhà cung cấp", "Mã NV", "Ngày Nhập", "Tổng tiền"};
        DefaultTableModel model = new DefaultTableModel(arr, 0);

        ConnectUnit connect = new ConnectUnit();
        try {
            ResultSet result = connect.Select("PHIEUNHAP");
            while (result.next()) {
                int mapn = result.getInt("MAPN");
                String mancc = result.getString("MANCC");
                int manv = result.getInt("MANV");
                Date ngayNhap = result.getDate("NGAYNHAP");
                BigDecimal tongtien = result.getBigDecimal("TONGTIEN");

                String maPNString = String.valueOf(mapn);
                String maNVString = String.valueOf(manv);
                String ngayNhapString = String.valueOf(ngayNhap);
                String tongTienString = String.valueOf(tongtien);

                String[] rowData = {maPNString, mancc, maNVString, ngayNhapString, tongTienString};
                model.addRow(rowData);
            }

            ListSelectionModel LM = PhieuNhap.getSelectionModel();
            LM.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // chỉ cho phép chọn 1 dòng
            LM.addListSelectionListener(new ListSelectionListener() {
                @Override
                public void valueChanged(ListSelectionEvent event) {
                    if (!event.getValueIsAdjusting()) { // Kiểm tra xem sự kiện chọn đã kết thúc chưa
                        int[] rows = PhieuNhap.getSelectedRows();
                        if (rows.length > 0) { // Đảm bảo có ít nhất một hàng được chọn
                            int maPN = Integer.parseInt((String) PhieuNhap.getValueAt(rows[0], 0));

                            Memory.maPN = maPN;
                            String maNCC = (String) PhieuNhap.getValueAt(rows[0], 1);
                            String maNV = (String) PhieuNhap.getValueAt(rows[0], 2);
                            String ngayNhap = (String) PhieuNhap.getValueAt(rows[0], 3);
                            String tongTien = (String) PhieuNhap.getValueAt(rows[0], 4);

                            // Gán giá trị của các cột vào các thành phần tương ứng
                            MaPN.setText(String.valueOf(maPN));
                            MaNCC.setText(maNCC);
                            MaNV.setText(maNV);
                            NgayNhap.setText(ngayNhap);
                            TongTien.setText(tongTien);

                            // Hiển thị chi tiết phiếu nhập
                            String[] secondColumnNames = {"Mã giày", "Số lượng", "Giá nhập"};
                            DefaultTableModel Model2 = new DefaultTableModel(secondColumnNames, 0);

                            ConnectUnit connect = new ConnectUnit();
                            try {
                                ResultSet result2 = connect.Select("CHITIETPHIEUNHAP", "MAPN = " + maPN);

                                while (result2.next()) {
                                    int maGiay = result2.getInt("MAGIAY");
                                    int soLuong = result2.getInt("SOLUONG");
                                    BigDecimal giaBan = result2.getBigDecimal("GIANHAP");

                                    String[] rowData = {String.valueOf(maGiay), String.valueOf(soLuong), String.valueOf(giaBan)};
                                    Model2.addRow(rowData);
                                }

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
            e.printStackTrace();
        } finally {
            try {
                connect.Close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        // Gán model mới cho bảng
        PhieuNhap.setModel(model);
    }

    private void PhieuNhapComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_PhieuNhapComponentShown
        ShowPhieuNhap();
    }//GEN-LAST:event_PhieuNhapComponentShown

    private void excelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_excelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_excelMouseClicked

    private void excelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excelActionPerformed
        exportToExcel("PHIEUNHAP", "D:/Users/Admin/Documents/NetBeansProjects/QuanLyCuaHangGiay_Java/src/quanlycuahanggiay_java/excel/PhieuNhap.xlsx", PhieuNhap);
    }//GEN-LAST:event_excelActionPerformed
    private void exportToExcel(String sheetName, String filePath, javax.swing.JTable table) {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet(sheetName);

        // Xuất dữ liệu từ bảng
        TableModel model = table.getModel();
        Row headerRow = sheet.createRow(0);
        for (int i = 0; i < model.getColumnCount(); i++) {
            headerRow.createCell(i).setCellValue(model.getColumnName(i));
        }

        for (int i = 0; i < model.getRowCount(); i++) {
            Row row = sheet.createRow(i + 1);
            for (int j = 0; j < model.getColumnCount(); j++) {
                row.createCell(j).setCellValue(String.valueOf(model.getValueAt(i, j)));
            }
        }

        // Lưu workbook vào file
        try (FileOutputStream fileOut = new FileOutputStream(filePath)) {
            workbook.write(fileOut);
            workbook.close();
            JOptionPane.showMessageDialog(this, "Export successful to " + filePath);
        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error exporting file: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void excel_ctMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_excel_ctMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_excel_ctMouseClicked

    private void excel_ctActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excel_ctActionPerformed
        exportToExcel("CHITIETPHIEUNHAP", "D:/Users/Admin/Documents/NetBeansProjects/QuanLyCuaHangGiay_Java/src/quanlycuahanggiay_java/excel/" + Memory.maPN + "ctpn.xlsx", ChiTiet);
    }//GEN-LAST:event_excel_ctActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ChiTiet;
    private javax.swing.JButton DeletdHD;
    private javax.swing.JLabel MaNCC;
    private javax.swing.JLabel MaNV;
    private javax.swing.JLabel MaPN;
    private javax.swing.JLabel NgayNhap;
    private javax.swing.JTable PhieuNhap;
    private javax.swing.JButton TaoMoi;
    private javax.swing.JLabel TongTien;
    private javax.swing.JPanel body_panel;
    private javax.swing.JButton excel;
    private javax.swing.JButton excel_ct;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
