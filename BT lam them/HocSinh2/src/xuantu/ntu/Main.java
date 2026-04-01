package xuantu.ntu;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void themHocSinh(ArrayList<Hoc_Sinh2> ds, Scanner nhap) {

	    System.out.print("Nhập tên: ");
	    String ten = nhap.nextLine();
	    System.out.println("\n");
	    System.out.print("Nhập tuổi: ");
	    int tuoi = nhap.nextInt();
	    nhap.nextLine();
	    System.out.println("\n");
	    System.out.print("Nhập lớp: ");
	    String lop = nhap.nextLine();
	    
	    Hoc_Sinh2 hs = new Hoc_Sinh2(ten, tuoi, lop);
	    ds.add(hs);

	    System.out.println("Đã thêm học sinh mới!");
	}
	public static void Xoa_HS_theo_ten(ArrayList<Hoc_Sinh2> ds, Scanner nhap) {
		System.out.print("Nhập tên sinh viên cần xoá: ");
		String ten = nhap.nextLine();
		 for (int i = 0; i < ds.size(); i++) {
	            if (ds.get(i).getTenHS().equals(ten)) {
	                Hoc_Sinh2 hs_bi_xoa = ds.remove(i);
	                System.out.println("Đã xóa học sinh: " + hs_bi_xoa.getTenHS());
	                return ;
	            }
	        }
	        System.out.println("Không tìm thấy sinh viên với tên: " +ten);
	        
	}
	
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
		//Nhập dữ liệu từ bàn phím
		Scanner nhap = new Scanner(System.in);
		System.out.print("Nhập ds N học sinh: ");
		int n = nhap.nextInt();
		System.out.print("\n");
		for (int i = 2;i < n; i++) {
			System.out.println("Nhập thông tin sinh viên thứ "+(i+1));
			//Nhập tên
			System.out.print("Nhập tên: ");
			String ten = nhap.nextLine();
			System.out.println("\n");
			//Nhập tuổi
			System.out.print("Nhập tuổi: ");
			int tuoi = nhap.nextInt();
			System.out.println("\n");
			//Nhập lớp
			System.out.println("Nhập lớp: ");
			String lop = nhap.nextLine();
			System.out.println("\n");
			Hoc_Sinh2 hs = new Hoc_Sinh2(ten, tuoi, lop);
			ds.add(hs);
		}
		//3.b Hiển thị danh sách vừa nhập
		System.out.println("In ra danh sách học sinh: ");
		for (Hoc_Sinh2 hs1:ds) {
			hs1.Hien_thi();
		}
		//4.a Bổ sung thêm một học sinh mới
		themHocSinh(ds, nhap);
		//4.b Xuất lại danh sách
		for (Hoc_Sinh2 hs2:ds) {
			hs2.Hien_thi();
		}
		//5.a Xoá sinh viên theo tên
		Xoa_HS_theo_ten(ds, nhap);
		//5.b Xuất lại danh sách
		for (Hoc_Sinh2 hs3:ds) {
			hs3.Hien_thi();
		}
	}

}
