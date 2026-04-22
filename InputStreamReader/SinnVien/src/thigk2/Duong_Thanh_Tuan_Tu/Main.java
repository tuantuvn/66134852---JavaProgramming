package thigk2.Duong_Thanh_Tuan_Tu;
import java.io.*;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Quan_Ly_Sinh_Vien quanly = new Quan_Ly_Sinh_Vien();
		quanly.DocFile();
		
		System.out.println("1.DANH SÁCH SINH VIÊN:");
		quanly.InDanhSach();
		System.out.println("2.SỐ LƯỢNG SINH VIÊN:");
		quanly.inSoluonng();
		System.out.println("3.SINH VIÊN SINH NĂM 2006:");
		quanly.InDanhSach();
		System.out.println("4.SINH VIÊN NỮ:");
		quanly.inSVnu();
		System.out.println("5.SẮP XẾP THEO TÊN:");
		quanly.Sapxeptheoten();
	}

}
