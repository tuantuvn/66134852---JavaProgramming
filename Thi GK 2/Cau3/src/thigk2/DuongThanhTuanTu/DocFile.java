package thigk2.DuongThanhTuanTu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
 
public class DocFile {
 
    public static void main(String[] args) {
        ArrayList<Integer> dsSoNguyen = new ArrayList<>();
        String duongDanFile = "100_so_nguyen.txt";
 
        // Đọc file
        try {
            BufferedReader br = new BufferedReader(new FileReader(duongDanFile));
            String dong;
            while ((dong = br.readLine()) != null) {
                if (!dong.trim().isEmpty()) {
                    dsSoNguyen.add(Integer.parseInt(dong.trim()));
                }
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Lỗi đọc file: " + e.getMessage());
            return;
        }
 
        // In ra danh sách
        System.out.println("Danh sách 100 số nguyên:");
        for (int i = 0; i < dsSoNguyen.size(); i++) {
            System.out.println((i + 1) + ": " + dsSoNguyen.get(i));
        }
    }
}