/**
 * 
 */
package tuantu.ntu;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 */
public class runMain {

	public static void main(String[] args) {
		//Câu a
		
		//Khai báo một biến danh sách chứa các số nguyên
		ArrayList<Integer> ds_so_Nguyen = new ArrayList<Integer>();
		//a. Nhập 10 phần tử từ bàn phím
		Scanner banphim = new Scanner(System.in);
		for (int i = 0; i < 10 ;i++) {
		//Nhập 1 phần tử
		// In ra một hướng dẫn cho người dùng 
		System.out.print("Mời nhập phần tử thứ " + i + ":");
		// Cho user nhập, cất biến tạm
		Integer tam = banphim.nextInt();
		//Thêm vào cuối danh sách
		ds_so_Nguyen.add(tam);
		}
		
		
		//b.In ra danh sách vừa nhập
		for (int i = 0; i < ds_so_Nguyen.size();i++) {
			
		}
		

	}

}
