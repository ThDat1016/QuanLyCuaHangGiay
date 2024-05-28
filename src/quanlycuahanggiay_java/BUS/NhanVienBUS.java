/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlycuahanggiay_java.BUS;

import quanlycuahanggiay_java.DAO.NhanVienDAO;
import quanlycuahanggiay_java.DTO.NhanVien;
import java.util.ArrayList;

public class NhanVienBUS {

    private ArrayList<NhanVien> list_NV;

    private NhanVienDAO nvDAO;

    public NhanVienBUS() throws Exception {
        list_NV = new ArrayList<>();
        nvDAO = new NhanVienDAO();
        list_NV = nvDAO.docDB();
    }

    /**
     * thêm 1 nhân viên vào danh sách và database
     *
     * @return true nếu thành công
     */
    public Boolean them(NhanVien nv) throws Exception {
        if (nvDAO.them(nv)) {
            list_NV.add(nv);
        }
        return false;
    }

    public Boolean xoa(NhanVien nv) throws Exception {
        if (nvDAO.xoa(nv)) {

            for (NhanVien nhanvien : list_NV) {
                if (nhanvien.getMaNV() == nv.getMaNV()) {
                    list_NV.remove(nhanvien);
                    break;
                }
            }
        }

        return false;
    }

    public Boolean sua(NhanVien nv) throws Exception {
        if (nvDAO.sua(nv)) {

            for (NhanVien nhanvien : list_NV) {
                if (nhanvien.getMaNV() == nv.getMaNV()) {
                    break;
                }
            }
        }

        return false;
    }

    public NhanVien getNhanVien_MaNV(int MaNV) {
        for (NhanVien nhanvien : list_NV) {
            if (nhanvien.getMaNV() == MaNV) {
                return nhanvien;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        try {
            NhanVienBUS nhanVienBUS = new NhanVienBUS();
            int maNVCanTim = 2; // Thay thế 12345 bằng mã nhân viên bạn muốn tìm

            NhanVien nvTimThay = nhanVienBUS.getNhanVien_MaNV(maNVCanTim);

            if (nvTimThay != null) {
                System.out.println("Nhân viên có mã " + maNVCanTim + " được tìm thấy:");
                System.out.println("Mã NV: " + nvTimThay.getMaNV());
                System.out.println("Họ và tên: " + nvTimThay.getHo() + " " + nvTimThay.getTen());
                System.out.println("Giới tính: " + (nvTimThay.isGioiTinh() ? "Nam" : "Nữ"));
                System.out.println("Địa chỉ: " + nvTimThay.getDiaChi());
                System.out.println("Email: " + nvTimThay.getEmail());
                System.out.println("Lương: " + nvTimThay.getLuong());
            } else {
                System.out.println("Không tìm thấy nhân viên có mã " + maNVCanTim);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
