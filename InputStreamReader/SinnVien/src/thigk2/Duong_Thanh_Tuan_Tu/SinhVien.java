package thigk2.Duong_Thanh_Tuan_Tu;

public class SinhVien {
	protected int STT;
	protected String Ho_va_ten;
	protected int NamSinh;
	protected String GioiTinh;
	public int getSTT() {
		return STT;
	}
	public void setSTT(int sTT) {
		STT = sTT;
	}
	public String getHo_va_ten() {
		return Ho_va_ten;
	}
	public void setHo_va_ten(String ho_va_ten) {
		Ho_va_ten = ho_va_ten;
	}
	public int getNamSinh() {
		return NamSinh;
	}
	public void setNamSinh(int namSinh) {
		NamSinh = namSinh;
	}
	public String getGioiTinh() {
		return GioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		GioiTinh = gioiTinh;
	}
	public SinhVien(int sTT, String ho_va_ten, int namSinh, String gioiTinh) {
		super();
		STT = sTT;
		Ho_va_ten = ho_va_ten;
		NamSinh = namSinh;
		GioiTinh = gioiTinh;
	}
	@Override
	public String toString() {
		return "SinhVien [STT=" + STT + ", Ho_va_ten=" + Ho_va_ten + ", NamSinh=" + NamSinh + ", GioiTinh=" + GioiTinh
				+ "]";
	}
	
	
}
