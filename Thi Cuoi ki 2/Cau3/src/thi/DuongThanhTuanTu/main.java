package thi.DuongThanhTuanTu;
import java.util.ArrayList;
import java.util.List;
public class main {

	public static void main(String[] args) {
		List<NhanVien> danhSachNV = new ArrayList<>();
		NhanVien nv1 = new NhanVien(6612, "Trần Đức Chiến",1000);
		NhanVien nv2 = new NhanVien(6623, "Nguyễn Văn Nam",2000);
		NhanVien nv3 = new NhanVien(6612, "Trần Đức Chiến",3000);
		
		danhSachNV.add(nv1);
		danhSachNV.add(nv2);
		danhSachNV.add(nv3);
		for (sdss sv:dssv) {
			System.out.println(sv.toString());
		}

	}

}
