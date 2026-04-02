package xuantu.ntu;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		Hoc_Sinh3 hs1 = new Hoc_Sinh3(null, 0);
		System.out.print("Nhập tên: ");
		String ten = nhap.nextLine();
		System.out.print("Nhập tuổi: ");
		int tuoi = nhap.nextInt();
		hs1.Hien_thi();
	}

}
