import java.util.ArrayList;

import java.util.Comparator;
public class Quan_li_san_pham {
	public ArrayList<San_Pham> ds = new ArrayList<>();
	
	//a.Thêm sản phẩm
	public void them_SP(San_Pham sp) {
		ds.add(sp);
		
	}
	//b.Xoas sản phẩm theo mã
	public void XoaSanPham(String ma) {
		for (int i = 0;i < ds.size();i++) {
			if (ds.get(i).get_maSP().equals(ma)) {
				San_Pham sp_bi_xoa = ds.remove(i);
                System.out.println("Đã xóa: " + sp_bi_xoa.get_tenSP());
                return ;
		}
	}
	System.out.println("Không tìm thấy sản phẩm");
	}	
	//c.Tìm sản phẩm theo tên
	public void Tim_SP(String ten) {
		System.out.println("Kết quả tìm kiếm:");
		for (San_Pham sp :ds) {
			if (sp.get_tenSP().toLowerCase().contains(ten.toLowerCase())) {
				sp.hienThi();
			} 
		}
	}
	//d.Sắp xếp sản phẩm theo giá tăng dần hoặc giảm dần
	//Sắp xếp giảm dần
	public void Sap_xep_giam() {
		for (int i = 0; i < ds.size() - 1; i++) {
			for (int j = 0;j < ds.size() - i - 1; j++) {
				if (ds.get(j).get(j).get_gia() < ds.get(j + 1).get_gia()) {
					San_Pham temp = ds.get(j);
                    ds.set(j, ds.get(j + 1));
                    ds.set(j + 1, temp);
				}
			}
		}
	}
	//Tính tổng giá trị kho hàng
	public double Tinh_Tong_hang() {
		double Tong = 0;
		for (San_Pham sp : ds) {
			Tong += sp.Gia_tri();
		}
		return Tong;
	}
	//Liệt kê số lượng sản phẩm sắp hết hàng (số lượng < 10)
	public void Sap_het_hang() {
		System.out.println("Sản phẩm sắp hết hàng: ");
		for (San_Pham sp:ds) {
			if (sp.get_soLuong() < 10) {
				sp.hienThi();
			}
		}
	}
}
