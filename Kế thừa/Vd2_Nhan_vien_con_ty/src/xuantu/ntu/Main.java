package xuantu.ntu;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Nhan_vien> danhSachNV = new ArrayList<>();

        Nhan_vien_van_phong nvVP = new Nhan_vien_van_phong("VP001", "Nguyễn Văn An", 7000000, 15, 100000);
        NhanVienKinhDoanh nvKD = new NhanVienKinhDoanh("KD002", "Trần Thị Bình", 6000000, 200000000, 2.5);
        QuanLy ql = new QuanLy("QL003", "Lê Cao Cường", 15000000, 5000000, 1.8);

        danhSachNV.add(nvVP);
        danhSachNV.add(nvKD);
        danhSachNV.add(ql);

        for (Nhan_vien nv : danhSachNV) {
            nv.hienThiThongTin();
            System.out.println("------------------------------");
        }

        nvKD.chamSocKhachHang();
        ql.hopBanGiamDoc();
    }
}