package xuantu.ntu;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
	int n;
  
	
	Scanner nhap2 = new Scanner(System.in);
	System.out.print("Nhập số lượng sản phẩm cần nhập: ");
	n = nhap2.nextInt();
	ArrayList<SanPham> list = new ArrayList<>();
	System.out.println("Nhập sản phẩm: ");
	for (int i = 0; i < n;i++) {
		SanPham sp1 = new SanPham();
		sp1.Nhap();
		list.add(sp1);
		
	}
	System.out.println("In thông tin sản phẩm vừa nhập ");
	 for (SanPham sp : list) { // dùng foreach
         sp.Xuat();
     }
	
	}
}
