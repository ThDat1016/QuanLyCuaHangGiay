/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlycuahanggiay_java.DTO;

/**
 *
 * @author Admin
 */
import java.math.BigDecimal;
import java.sql.Date;

public class HoaDon {

    private int MaHD;
    private NhanVien nv;
    private KhachHang kh;
    private ChuongTrinhKhuyenMai km;
    private Date NgayBan;
    private BigDecimal TongTien;
    private float Thue;

    public HoaDon(int MaHD, NhanVien nv, KhachHang kh, ChuongTrinhKhuyenMai km, Date NgayBan, BigDecimal TongTien, float Thue) {
        this.MaHD = MaHD;
        this.nv = nv;
        this.kh = kh;
        this.km = km;
        this.NgayBan = NgayBan;
        this.TongTien = TongTien;
        this.Thue = Thue;
    }

    public HoaDon() {
        nv = new NhanVien();
        kh = new KhachHang();
        km = new ChuongTrinhKhuyenMai();
    }

    public void setNv(NhanVien nv) {
        this.nv = nv;
    }

    public void setKh(KhachHang kh) {
        this.kh = kh;
    }

    public NhanVien getNv() {
        return nv;
    }

    public ChuongTrinhKhuyenMai getKm() {
        return km;
    }

    public void setKm(ChuongTrinhKhuyenMai km) {
        this.km = km;
    }

    public KhachHang getKh() {
        return kh;
    }

    public void setMaHD(int MaHD) {
        this.MaHD = MaHD;
    }

    public void setNgayBan(Date NgayBan) {
        this.NgayBan = NgayBan;
    }

    public void setTongTien(BigDecimal TongTien) {
        this.TongTien = TongTien;
    }

    public void setThue(float Thue) {
        this.Thue = Thue;
    }

    public int getMaHD() {
        return MaHD;
    }

    public Date getNgayBan() {
        return NgayBan;
    }

    public BigDecimal getTongTien() {
        return TongTien;
    }

    public float getThue() {
        return Thue;
    }

    public static int maHDTangdan(HoaDon a, HoaDon b) {
        int maHDA = a.getMaHD();
        int maHDB = b.getMaHD();

        if (maHDA < maHDB) {
            return -1;
        } else if (maHDA > maHDB) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int maHDGiamdan(HoaDon a, HoaDon b) {
        int maHDA = a.getMaHD();
        int maHDB = b.getMaHD();

        if (maHDA < maHDB) {
            return 1;
        } else if (maHDA > maHDB) {
            return -1;
        } else {
            return 0;
        }
    }

    public static int maKHTangdan(HoaDon a, HoaDon b) {
        int maKHA = a.getKh().getMaKH();
        int maKHB = b.getKh().getMaKH();

        if (maKHA < maKHB) {
            return -1;
        } else if (maKHA > maKHB) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int maKHGiamdan(HoaDon a, HoaDon b) {
        int maKHA = a.getKh().getMaKH();
        int maKHB = b.getKh().getMaKH();

        if (maKHA < maKHB) {
            return 1;
        } else if (maKHA > maKHB) {
            return -1;
        } else {
            return 0;
        }
    }

    public static int maNVTangdan(HoaDon a, HoaDon b) {
        int maNVA = a.getNv().getMaNV();
        int maNVB = b.getNv().getMaNV();

        if (maNVA < maNVB) {
            return -1;
        } else if (maNVA > maNVB) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int maNVGiamdan(HoaDon a, HoaDon b) {
        int maNVA = a.getNv().getMaNV();
        int maNVB = b.getNv().getMaNV();

        if (maNVA < maNVB) {
            return 1;
        } else if (maNVA > maNVB) {
            return -1;
        } else {
            return 0;
        }
    }

    public static int tongTienTangdan(HoaDon a, HoaDon b) {
        return (-1) * b.getTongTien().compareTo(a.getTongTien());

    }

    public static int tongTienGiamdan(HoaDon a, HoaDon b) {
        return b.getTongTien().compareTo(a.getTongTien());
    }
}
