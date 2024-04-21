package quanlycuahanggiay_java.DTO;

public class ChiTietChuongTrinhKhuyenMai {
	private int MaKM;
	private int MaGiay;
	private float TiLeKM;
        public ChiTietChuongTrinhKhuyenMai(){}
	public ChiTietChuongTrinhKhuyenMai(int maKM, int maGiay, float tileKMtheoPhanTram) {
		MaKM = maKM;
		MaGiay = maGiay;
		TiLeKM = tileKMtheoPhanTram;
	}

	public int getMaKM() {
		return MaKM;
	}
	public void setMaKM(int maKM) {
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

	
}
