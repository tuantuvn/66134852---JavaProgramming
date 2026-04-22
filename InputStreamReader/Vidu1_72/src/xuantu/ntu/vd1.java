package xuantu.ntu;
import java.io.*;

public class vd1 {

	public static void main(String[] args) {
		char c;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Nhap chuoi ky tu, gioi han dau cham.");
		 // read characters
		do
		{
		c = (char) br.read();
		System.out.println(c);
		} while(c != '.');

	}

}
