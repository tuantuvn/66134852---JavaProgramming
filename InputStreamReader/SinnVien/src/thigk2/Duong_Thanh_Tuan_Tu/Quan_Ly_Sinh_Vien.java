package thigk2.Duong_Thanh_Tuan_Tu;
import java.util.ArrayList;
import java.io.*;
import java.util.Collections;
import java.util.Comparator;
//Tạo lớp "Quản lý Sinh Viên" kế thừa từ lớp "SinhVien"
public class Quan_Ly_Sinh_Vien{
	
	
	public ArrayList<SinhVien> dsSinhVien = new ArrayList<SinhVien>();
	public void DocFile() {
		try {
		  BufferedReader br = new BufferedReader(new FileReader("bin//SinhVien.csv"));
          String line;

          br.readLine(); // bỏ dòng tiêu đề

          while ((line = br.readLine()) != null) {
              String[] arr = line.split(";");

              int stt = Integer.parseInt(arr[0]);
              String ten = arr[1];
              int namSinh = Integer.parseInt(arr[2]);
              String gioiTinh = arr[3];

              SinhVien sv = new SinhVien(stt, ten, namSinh, gioiTinh);
              dsSinhVien.add(sv);
          }

          br.close();
      } catch (IOException e) {
          System.out.println("Lỗi đọc file!");
      }
		
	}
	//in ra danh sách sinh viên.
	public void InDanhSach() {
		for (SinhVien sv: dsSinhVien) {
			System.out.println(sv.toString());
		}
			
	}
	public void inSoluonng() {
		System.out.println("Số lượng sinh viên là: "+dsSinhVien.size());
	}
	//In sinh viên sinh 2006
	public void inSV2006() {
		for (SinhVien sv: dsSinhVien) {
			if (sv.getNamSinh()==2006) {
				System.out.println(sv);
			}
		}
	}
	//In ra danh sách sinh viên nữ
	public void inSVnu() {
		for (SinhVien sv : dsSinhVien) {
			if (sv.getGioiTinh().equals("Nu")) {
				 System.out.println(sv);
			}
		}
	}
	//Sắp xếp sinh viên theo tên
	public void Sapxeptheoten() {
		Collections.sort(dsSinhVien, new Comparator<SinhVien>(){
			public int compare (SinhVien a, SinhVien b) {
				return a.getHo_va_ten().compareToIgnoreCase(b.getHo_va_ten());
			}
		});
		
		InDanhSach();
	}
	
}
