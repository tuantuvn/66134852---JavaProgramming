package xuantu.ntu;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//2.a Tạo mới 2 danh sách học sinh
		ArrayList<Hoc_Sinh2> ds = new ArrayList<Hoc_Sinh2>();
		ds.add(new Hoc_Sinh2("Trần Văn Chiến",18,"12A1"));
		ds.add(new Hoc_Sinh2("Nguyễn Văn Đô", 17, "12A1"));
		//In ra màn hình
		System.out.println("Danh sách vừa mới khởi tạo:");
		for (Hoc_Sinh2 hs:ds) {
			hs.Hien_thi();
		}
		
	}

}
