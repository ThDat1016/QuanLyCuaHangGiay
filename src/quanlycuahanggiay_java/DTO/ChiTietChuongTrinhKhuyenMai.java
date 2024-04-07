package quanlycuahanggiay_java.DTO;

public class ChiTietChuongTrinhKhuyenMai {
	private String MaKM;
	private String MaGiay;
	private float TileKMtheoPhanTram;
        public ChiTietChuongTrinhKhuyenMai(){}
	public ChiTietChuongTrinhKhuyenMai(String maKM, String maGiay, float tileKMtheoPhanTram) {
		MaKM = maKM;
		MaGiay = maGiay;
		TileKMtheoPhanTram = tileKMtheoPhanTram;
	}

	public String getMaKM() {
		return MaKM;
	}
	public void setMaKM(String maKM) {
		MaKM = maKM;
	}
	public String getMaGiay() {
		return MaGiay;
	}
	public void setMaGiay(String maGiay) {
		MaGiay = maGiay;
	}
	public float getTileKMtheoPhanTram() {
		return TileKMtheoPhanTram;
	}
	public void setTileKMtheoPhanTram(float tileKMtheoPhanTram) {
		TileKMtheoPhanTram = tileKMtheoPhanTram;
	}

	
}
