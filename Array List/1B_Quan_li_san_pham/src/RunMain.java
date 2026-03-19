/**
 * 
 */

/**
 * 
 */
import java.util.Scanner;
public class RunMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Quan_li_san_pham ql = new Quan_li_san_pham();
		System.out.print("Nhập số lượng sản phẩm cần nhập: ");
		int n = Integer.parseInt(sc.nextLine());
		
		for (int i = 0; i < n; i++) {
			System.out.println("\nNhập sản phẩm thứ " + (i + 1));

            System.out.print("Mã SP: ");
            String ma = sc.nextLine();

            System.out.print("Tên SP: ");
            String ten = sc.nextLine();

            System.out.print("Giá: ");
            int gia = Integer.parseInt(sc.nextLine());

            System.out.print("Số lượng: ");
            int soLuong = Integer.parseInt(sc.nextLine());

            // Tạo object đúng theo class bạn
            San_Pham sp = new San_Pham(ma, ten, gia, soLuong);
            ql.them_SP(sp);
		}
		System.out.println("\n=== DANH SÁCH SẢN PHẨM ===");
        for (San_Pham sp : ql.ds) {
            sp.hienThi();
        }

        // Tính tổng giá trị kho
        System.out.println("\nTổng giá trị kho: " + ql.Tinh_Tong_hang());

        // Liệt kê sản phẩm sắp hết hàng
        ql.Sap_het_hang();

        // Test tìm kiếm
        System.out.print("\nNhập tên cần tìm: ");
        String tenTim = sc.nextLine();
        ql.Tim_SP(tenTim);

        // Test xóa
        System.out.print("\nNhập mã cần xóa: ");
        String maXoa = sc.nextLine();
        ql.XoaSanPham(maXoa);

        System.out.println("\nDanh sách sau khi xóa:");
        for (San_Pham sp : ql.ds) {
            sp.hienThi();
        }

        sc.close();
		
	}

}
