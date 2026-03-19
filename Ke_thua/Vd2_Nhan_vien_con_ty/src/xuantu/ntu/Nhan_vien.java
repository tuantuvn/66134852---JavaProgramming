package xuantu.ntu;

public class Nhan_vien {
	 protected String maNV;
	    protected String hoTen;
	    protected double luongCoBan;
	    
	    public Nhan_vien(String maNV, String hoTen, double luongCoBan) {
	        this.maNV = maNV;
	        this.hoTen = hoTen;
	        this.luongCoBan = luongCoBan;
	    }
	    
	    public double tinhLuong() {
	        return luongCoBan;
	    }
	    
	    public void hienThiThongTin() {
	        System.out.println("Mã NV: " + maNV);
	        System.out.println("Họ tên: " + hoTen);
	        System.out.println("Lương cơ bản: " + luongCoBan);
	    }
}
