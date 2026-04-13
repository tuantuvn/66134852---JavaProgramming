import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
public class ViduDocStream {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fInput = new FileInputStream("noidung.txt");
		
		//Khai báo biến đối tượng InputStreamReader
		InputStreamReader ipReader = new InputStreamReader(fInput);
		//Khai báo biến đối tượng Buffee
		BufferedReader buffReader = new BufferedReader(ipReader);
		//In ra một câu hướng dẫn để User biết cần làm gì
		//System.out.print("Nhập vào một chuỗi bất kì: ");
		//Đọc đữ liệu từ file và cất biến vào chuỗi
		String line1 = buffReader.readLine();
		System.out.print(line1);
		String line2 = buffReader.readLine();
		System.out.print(line2);
		
		

	}

}
