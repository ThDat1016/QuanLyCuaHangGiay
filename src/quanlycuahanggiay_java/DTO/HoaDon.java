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
    private int MaNV;
    private int MaKH;
    private int MaKM;
    private Date NgayBan;
    private BigDecimal TongTien;
    private float Thue;

    public HoaDon() {
    }

    public HoaDon(int maHD, int maNV, int maKH, int maKM, Date ngayBan, BigDecimal tongTien, int thue) {
        super();
        MaHD = maHD;
        MaNV = maNV;
        MaKH = maKH;
        MaKM = maKM;
        NgayBan = ngayBan;
        TongTien = tongTien;
        Thue = thue;
    }

    public void setMaHD(int MaHD) {
        this.MaHD = MaHD;
    }

    public void setMaNV(int MaNV) {
        this.MaNV = MaNV;
    }

    public void setMaKH(int MaKH) {
        this.MaKH = MaKH;
    }

    public void setMaKM(int MaKM) {
        this.MaKM = MaKM;
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

    public int getMaNV() {
        return MaNV;
    }

    public int getMaKH() {
        return MaKH;
    }

    public int getMaKM() {
        return MaKM;
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
    int maKHA = a.getMaKH();
    int maKHB = b.getMaKH();

    if (maKHA < maKHB) {
        return -1;
    } else if (maKHA > maKHB) {
        return 1;
    } else {
        return 0;
    }
}

public static int maKHGiamdan(HoaDon a, HoaDon b) {
    int maKHA = a.getMaKH();
    int maKHB = b.getMaKH();

    if (maKHA < maKHB) {
        return 1;
    } else if (maKHA > maKHB) {
        return -1;
    } else {
        return 0;
    }
}

public static int maKMTangdan(HoaDon a, HoaDon b) {
    int maKMA = a.getMaKM();
    int maKMB = b.getMaKM();

    if (maKMA < maKMB) {
        return -1;
    } else if (maKMA > maKMB) {
        return 1;
    } else {
        return 0;
    }
}

public static int maKMGiamdan(HoaDon a, HoaDon b) {
    int maKMA = a.getMaKM();
    int maKMB = b.getMaKM();

    if (maKMA < maKMB) {
        return 1;
    } else if (maKMA > maKMB) {
        return -1;
    } else {
        return 0;
    }
}

public static int maNVTangdan(HoaDon a, HoaDon b) {
    int maNVA = a.getMaNV();
    int maNVB = b.getMaNV();

    if (maNVA < maNVB) {
        return -1;
    } else if (maNVA > maNVB) {
        return 1;
    } else {
        return 0;
    }
}

    public static int maNVGiamdan(HoaDon a, HoaDon b) {
        int maNVA = a.getMaNV();
        int maNVB = b.getMaNV();

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
