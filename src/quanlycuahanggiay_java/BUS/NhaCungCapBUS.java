/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlycuahanggiay_java.BUS;

import quanlycuahanggiay_java.DAO.NhaCungCapDAO;
import quanlycuahanggiay_java.DTO.NhaCungCap;
import java.util.ArrayList;

public class NhaCungCapBUS {
    private ArrayList<NhaCungCap> list_NV;
   
    private NhaCungCapDAO nvDAO;

    public ArrayList<NhaCungCap> getList_NV() {
        return list_NV;
    }

    public void setList_NV(ArrayList<NhaCungCap> list_NV) {
        this.list_NV = list_NV;
    }
    
    public NhaCungCapBUS() throws Exception {
        list_NV = new ArrayList<>();
        nvDAO = new NhaCungCapDAO();
        list_NV = nvDAO.docDB();
    }
    
    public int getNumb() {
        return list_NV.size();
    }
    
    /**
     * thêm 1 nhân viên vào danh sách và database
     * @return true nếu thành công
     */
    public Boolean them(NhaCungCap nv) throws Exception{
        if ( nvDAO.them(nv) ) {
            list_NV.add(nv);
        }
        return false;
    }
    
    /**
     * xóa 1 nhân viên khỏi danh sách và database
     * @return true nếu thành công
     */
    public Boolean xoa(NhaCungCap nv) throws Exception {
        if ( nvDAO.xoa(nv) ) {
            
            for ( NhaCungCap nhanvien : list_NV ) {
                if (nhanvien.getMaNCC().equals(nv.getMaNCC())){
                    list_NV.remove(nhanvien);
                break;
                }
            }
        }
        
        return false;
    }
    
    /**
     * sửa thông tin của 1 nhân viên <br>
     * - Trừ thông tin đăng nhập của nhân viên đó
     * @return true nếu thực hiện thành công
     */
    public Boolean sua(NhaCungCap nv) throws Exception {
        if ( nvDAO.sua(nv) ) {
            
            // duyệt từng phẩn tử
            for ( NhaCungCap nhanvien : list_NV ) {
                if (nhanvien.getMaNCC().equals(nv.getMaNCC())){
                    nhanvien = nv;
                    return true;
                }
            }
        }
        
        return false;
    }
        

}
