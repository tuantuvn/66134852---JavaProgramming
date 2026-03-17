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
		
		System.out.println("Danh sách vừa nhập: \n");
		//b.In ra danh sách vừa nhập
		for (int i = 0; i < ds_so_Nguyen.size();i++) {
			// Lấy giá trị phần tử ở vị trí thứ i, cất vào biến tạm
			Integer tam = ds_so_Nguyen.get(i);
			System.out.print(tam + " ");
		}
		
		//c.Đếm số phần tử chẵn
		int so_PT_chan = 0 ;
		for (Integer x: ds_so_Nguyen) {
			if (x % 2 == 0) {
				so_PT_chan++;
			}
			
		}
		System.out.println("\nSố lượng phần tử chẵn có trong List: " + so_PT_chan);
		int Tong = 0;
		for (Integer x: ds_so_Nguyen) {
			Tong = Tong + x;
		}
		System.out.println("Tổng các số có trong List là: " + Tong);

	}

}
