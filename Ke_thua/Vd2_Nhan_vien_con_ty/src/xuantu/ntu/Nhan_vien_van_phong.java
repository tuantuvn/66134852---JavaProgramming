package xuantu.ntu;

public class Nhan_vien_van_phong extends Nhan_vien {
    private double soGioLamThem;
    private double luongThemMoiGio;
    
    public Nhan_vien_van_phong(String maNV, String hoTen, double luongCoBan,
                           double soGioLamThem, double luongThemMoiGio) {
        super(maNV, hoTen, luongCoBan);
        this.soGioLamThem = soGioLamThem;
        this.luongThemMoiGio = luongThemMoiGio;
    }
    
    @Override
    public double tinhLuong() {
        return luongCoBan + (soGioLamThem * luongThemMoiGio);
    }
    
    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Số giờ làm thêm: " + soGioLamThem);
        System.out.println("Lương làm thêm/giờ: " + luongThemMoiGio);
        System.out.println("Tổng lương: " + this.tinhLuong());
        System.out.println("Chức vụ: Nhân viên văn phòng");
    }
}
