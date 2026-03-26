package xuantu.ntu;
import java.util.Scanner;


public class SanPham {
	private String tenSp;
	private double donGia;
	private double giamGia;
	public void SanPham(String ten_Sp,double Don_gia, double Giam_gia){
		this.tenSp = ten_Sp;
		this.donGia = Don_gia;
		this.giamGia = Giam_gia;
		
	}
	public String get_tenSP() {
		return tenSp;
	}
	public double get_Dongia() {
		return donGia;
	}
	public double get_Giamgia () {
		return giamGia;
	}
	
	public double getThueNhapKhau() {
		return donGia * 0.1;
	}
	
	public void Nhap() {
		Scanner nhap = new Scanner(System.in) ;
		System.out.print("Nhập tên SP: ");
		tenSp = nhap.nextLine();
		System.out.println("Nhập đơn giá: ");
		donGia = nhap.nextDouble();
		System.out.print("Nhập giảm giá: ");
		giamGia = nhap.nextDouble();
		
	}
	public void Xuat() {
		System.out.println("Tên SP: "+ tenSp +"Giảm giá: "+giamGia + "Đơn giá: "+ donGia + "Thuế nhập khẩu: "+getThueNhapKhau());
	}
	
}
