
public class San_Pham {
	public String maSP;
	public String tenSp;
	public int gia;
	public int soLuong;
	
	
	public San_Pham (String Ma_SP, String Ten_SP, int Gia,int So_luong) {
		this.maSP = Ma_SP;
		this.tenSp = Ten_SP;
		this.gia = Gia;
		this.soLuong = So_luong;
	}
	public String get_maSP() {
		return maSP;
	}
	public String get_tenSP() {
		return tenSp;
	}
	public double get_gia() {
		return gia;
	}
	public double get_soLuong() {
		return soLuong;
	}
	public double Gia_tri() {
		return gia * soLuong;
	}
	 public void hienThi() {
	        System.out.println(maSP + " | " + tenSp + " | Giá: " + gia + " | SL: " + soLuong);
	 }
	 public San_Pham get(int j) {
		// TODO Auto-generated method stub
		return null;
	 }
}
