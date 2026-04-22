import java.io.*;
public class TongHaiSo {

	public static void main (String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\Hoc tap\\Coding\\Java\\66134852---JavaProgramming\\InputStreamReader\\TongHaiSo\\src\\noidung.txt")));
		String line1 = br.readLine();
		String line2 = br.readLine();
		
		int a = Integer.parseInt(line1);
		int b = Integer.parseInt(line2);
		int sum = a+b;
		System.out.println("Tong cua a + b = "+ sum);
		br.close();
	}

}
