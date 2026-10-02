package thi.DuongThanhTuanTu;

public class DongVat {
	public String TiengKeu;
	public String Loai;
	public String getTiengKeu() {
		return TiengKeu;
	}
	public void setTiengKeu(String tiengKeu) {
		TiengKeu = tiengKeu;
	}
	public String getLoai() {
		return Loai;
	}
	public void setLoai(String loai) {
		Loai = loai;
	}
	public DongVat(String tiengKeu, String loai) {
		super();
		TiengKeu = tiengKeu;
		Loai = loai;
	}
	@Override
	public String toString() {
		return "DongVat [TiengKeu=" + TiengKeu + ", Loai=" + Loai + ", getTiengKeu()=" + getTiengKeu() + ", getLoai()="
				+ getLoai() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
}
