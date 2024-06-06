/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlycuahanggiay_java.BUS;
import quanlycuahanggiay_java.DAO.TaiKhoangNVDAO;
import quanlycuahanggiay_java.DTO.TaiKhoangNV;
import java.util.ArrayList;
/**
 *
 * @author Admin
 */
public class TaiKhoanBUS {
     private ArrayList<TaiKhoangNV> list_TK;
    /**
     * Xử lý các lệnh trong SQL
     */
    private TaiKhoangNVDAO tkDAO;
    
    public TaiKhoanBUS() throws Exception {
        list_TK = new ArrayList<>();
        tkDAO = new TaiKhoangNVDAO();
        list_TK = tkDAO.docDB();
    }
    
    /**
     * thêm 1 tài khoản vào danh sách và database
     * @return true nếu thành công
     */
    public Boolean them(TaiKhoangNV tk) throws Exception{
        if ( tkDAO.them(tk) ) {
            list_TK.add(tk);
        }
        return false;
    }
    
    /**
     * xóa 1 tài khoản khỏi danh sách và database
     * @return true nếu thành công
     */
    public Boolean xoa(TaiKhoangNV tk) throws Exception {
        if ( tkDAO.xoa(tk) ) {
            
            // duyệt từng phẩn tử
            for ( TaiKhoangNV taikhoan : list_TK ) {
                if (taikhoan.getNv().getMaNV() == tk.getNv().getMaNV()){
                    list_TK.remove(taikhoan);
                break;
                }
            }
        }
        
        return false;
    }
    
    /**
     * sửa thông tin của 1 tài khoản 
     * - Trừ thông tin đăng nhập của tài khoản đó
     * @return true nếu thực hiện thành công
     */
    public Boolean sua(TaiKhoangNV tk) throws Exception {
        if ( tkDAO.sua(tk) ) {
            
            // duyệt từng phẩn tử
            for ( TaiKhoangNV taikhoan : list_TK ) {
                if (taikhoan.getNv().getMaNV() == tk.getNv().getMaNV()){
                break;
                }
            }
        }
        
        return false;
    }

    
    public Boolean kiemTraDangNhap(TaiKhoangNV tk) {
        for ( TaiKhoangNV taikhoan : list_TK ) {
            // kiểm tra mật khảu và tên đăng nhập
           if (taikhoan.getNv().getMaNV() == tk.getNv().getMaNV() && taikhoan.getMatKhau().equalsIgnoreCase(tk.getMatKhau())) {
    return true;
}

        }
        return false;
    }
    
    public String getCapBac_Ten(int strTen) {
        for ( TaiKhoangNV taikhoan : list_TK ) {
            if ( taikhoan.getNv().getMaNV()== strTen )
                return taikhoan.getNv().getChucVu();
        } 
        return "-1";
    }
}
