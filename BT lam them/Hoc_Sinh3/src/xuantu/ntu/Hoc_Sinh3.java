package xuantu.ntu;

public class Hoc_Sinh3 {
	private String ten;
	private int namsinh;
	protected String getTen() {
		return ten;
	}
	protected void setTen(String ten) {
		this.ten = ten;
	}
	protected int getNamsinh() {
		return namsinh;
	}
	protected void setNamsinh(int namsinh) {
		this.namsinh = namsinh;
	}

	public Hoc_Sinh3(String ten, int namsinh) {
		super();
		this.ten = ten;
		this.namsinh = namsinh;
	}
	public int Tinh_Tuoi(int namhientai) {
		namhientai = 2026;
		int tuoi = namhientai - namsinh;
		return tuoi;
	}

	
	public void Hien_thi() {
		System.out.println("Ho va ten: "+ten + "Nam sinh: "+ namsinh +" " +"Tuoi: "+Tinh_Tuoi(2026));
	}
	
}