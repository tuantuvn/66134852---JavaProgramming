package thigk2.DuongThanhTuanTu;
import java.util.Scanner;
public class Cau1 {

	public static void main(String[] args) {
		//Khai báo lớp Scanner, viết thống báo và khai báo biến
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập thông tin chiều cao (m): ");
		double chieucao = sc.nextDouble();
		System.out.print("Nhập thông tin cân nặng (kg): ");
		double cannang = sc.nextDouble();
		//Tính BMI
		double BMI = (cannang)/(chieucao*chieucao);
		System.out.println("Chỉ số BMI của bạn là: "+BMI);
		

	}

}
