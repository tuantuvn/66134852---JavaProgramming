package thigk2.DuongThanhTuanTu;
import java.util.ArrayList;
import java.util.Scanner;

public class Cau2b {

	public static void main(String[] args) {
		//Tạo ra danh sách 3 sinh viên
		ArrayList <Cau2a> dssv = new ArrayList<>();
		Cau2a sv1 = new Cau2a(6612, "Trần Đức Chiến", "Nam", 2007);
		Cau2a sv2 = new Cau2a(6623, "Nguyễn Văn Nam", "Nam", 2002);
		Cau2a sv3 = new Cau2a(6612, "Trần Đức Chiến", "Nam", 2003);
		
		dssv.add(sv1);
        dssv.add(sv2);
        dssv.add(sv3);
		//In ra danh sách sinh viên mới vừa thêm
		for (Cau2a sv:dssv) {
			System.out.println(sv.toString());
		}
		//Thêm mới một sinh viên từ bàn phím
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập thêm thông tin sinh viên mới");
		System.out.print("Nhập mã số sinh viên: ");
		int mssv = sc.nextInt();
		System.out.print("Nhập họ và tên: ");
		String hovaten = sc.nextLine();
		System.out.print("Nhập giới tính: ");
		String gioitinh = sc.nextLine();
		System.out.print("Nhập năm sinh: ");
		int namsinh = sc.nextInt();
		Cau2a svMoi = new Cau2a(mssv, hovaten, gioitinh, namsinh);
		dssv.add(svMoi);
		//In ra lại màn hình danh sách sinh viên
		for (Cau2a sv:dssv) {
			System.out.println(sv.toString());
		}
		sc.close();
		System.out.println("\nDanh sách sinh viên lớn hơn 20 tuổi:");
		int namHienTai = 2025;
		for (Cau2a sv : dssv) {
		    if (namHienTai - sv.getNamSinh() > 20) {
		        System.out.println(sv.toString());
		    }
		}
	}

}
