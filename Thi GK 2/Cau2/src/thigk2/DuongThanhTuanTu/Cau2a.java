package thigk2.DuongThanhTuanTu;
//Câu 2a
public class Cau2a {
	protected int MSSV;
	protected String HoVaten;
	protected String GioiTinh;
	protected int NamSinh;
	//Xây dựng hàm getter và setter
	public int getMSSV() {
		return MSSV;
	}
	public void setMSSV(int mSSV) {
		MSSV = mSSV;
	}
	public String getHoVaten() {
		return HoVaten;
	}
	public void setHoVaten(String hoVaten) {
		HoVaten = hoVaten;
	}
	public String getGioiTinh() {
		return GioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		GioiTinh = gioiTinh;
	}
	public int getNamSinh() {
		return NamSinh;
	}
	public void setNamSinh(int namSinh) {
		NamSinh = namSinh;
	}
	//Xây dựng hàm Constructor
	public Cau2a(int mSSV, String hoVaten, String gioiTinh, int namSinh) {
		super();
		MSSV = mSSV;
		HoVaten = hoVaten;
		GioiTinh = gioiTinh;
		NamSinh = namSinh;
	}
	//Xây dựng hàm toString
	@Override
	public String toString() {
		return String.format("MSSV: %-10s | Họ tên: %-25s | Giới tính: %-5s | Năm sinh: %d", MSSV, HoVaten, GioiTinh, NamSinh);
	}
	
	
	
}
