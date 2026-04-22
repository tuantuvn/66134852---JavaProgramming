package xuantu.ntu;

import java.io.InputStreamReader;

public class RedChars {

	public static void main(String[] args) {
		char c;
		BufferedReader br = new BufferedReader();
		System.out.println("Nhap chuoi ky tu, gioi han dau cham.");
		 // read characters
		do
		{
		c = (char) br.read();
		System.out.println(c);
		} while(c != '.'); 

	}

}
