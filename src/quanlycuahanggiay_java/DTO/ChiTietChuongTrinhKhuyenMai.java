package quanlycuahanggiay_java.DTO;

public class ChiTietChuongTrinhKhuyenMai {

    private String MaKM;
    private int MaGiay;
    private float TiLeKM;
    private Giay giay;

    public ChiTietChuongTrinhKhuyenMai() {
        giay = new Giay();
    }

    public ChiTietChuongTrinhKhuyenMai(Giay giay, String maKM, int maGiay, float tileKMtheoPhanTram) {
        MaKM = maKM;
        MaGiay = maGiay;
        TiLeKM = tileKMtheoPhanTram;
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

    public String getMaKM() {
        return MaKM;
    }

    public void setMaKM(String maKM) {
        MaKM = maKM;
    }

    public int getMaGiay() {
        return MaGiay;
    }

    public void setMaGiay(int maGiay) {
        MaGiay = maGiay;
    }

    public float getTiLeKM() {
        return TiLeKM;
    }

    public void setTileKM(float tileKMtheoPhanTram) {
        TiLeKM = tileKMtheoPhanTram;
    }

    @Override
    public String toString() {
        return "ChiTietKMDTO{" + "strMaKM=" + MaKM + ", strMaGiay=" + MaGiay + ", TiLeKM=" + TiLeKM + '}';
    }

    public static int maSPTangdan(ChiTietChuongTrinhKhuyenMai a, ChiTietChuongTrinhKhuyenMai b) {
        return Integer.compare(a.getMaGiay(), b.getMaGiay());

    }
}
