package quanlycuahanggiay_java.DTO;

public class ChiTietChuongTrinhKhuyenMai {

    private ChuongTrinhKhuyenMai km;
    private float TiLeKM;
    private Giay giay;

    public ChiTietChuongTrinhKhuyenMai() {
        giay = new Giay();
        km = new ChuongTrinhKhuyenMai();
    }

    public ChuongTrinhKhuyenMai getKm() {
        return km;
    }

    public void setKm(ChuongTrinhKhuyenMai km) {
        this.km = km;
    }

    public ChiTietChuongTrinhKhuyenMai(ChuongTrinhKhuyenMai km, float TiLeKM, Giay giay) {
        this.km = km;
        this.TiLeKM = TiLeKM;
        this.giay = giay;
    }

    public void setTiLeKM(float TiLeKM) {
        this.TiLeKM = TiLeKM;
    }

    public void setGiay(Giay giay) {
        this.giay = giay;
    }

    public Giay getGiay() {
        return giay;
    }

    public float getTiLeKM() {
        return TiLeKM;
    }

   

    @Override
    public String toString() {
        return "ChiTietKMDTO{" + "strMaKM=" + km.getMaKM() + ", strMaGiay=" + giay.getStrMaGiay() + ", TiLeKM=" + TiLeKM + '}';
    }

    public static int maSPTangdan(ChiTietChuongTrinhKhuyenMai a, ChiTietChuongTrinhKhuyenMai b) {
        return Integer.compare(a.giay.getStrMaGiay(), b.giay.getStrMaGiay());

    }
}
