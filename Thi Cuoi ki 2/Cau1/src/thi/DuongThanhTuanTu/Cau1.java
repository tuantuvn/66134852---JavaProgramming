package thi.DuongThanhTuanTu;

import java.util.Scanner;

public class Cau1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap n");
		int n = sc.nextInt();
		int S = (n*(n+1)*(2n+1))/6 ;
		System.out.print("Tong S ="+S);

	}

}
