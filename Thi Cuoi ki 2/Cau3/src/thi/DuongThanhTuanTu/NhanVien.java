package thi.DuongThanhTuanTu;

public class NhanVien {
	public int maNV;
	public String hoTen;
	public int luong;
	public int getMaNV() {
		return maNV;
	}
	public void setMaNV(int maNV) {
		this.maNV = maNV;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public int getLuong() {
		return luong;
	}
	public void setLuong(int luong) {
		this.luong = luong;
	}
	 public void hienThiThongTin() {
	        System.out.println("Mã NV: " + maNV);
	        System.out.println("Họ tên: " + hoTen);
	        System.out.println("Lương : " + luong);
	    }
	 
	
}
