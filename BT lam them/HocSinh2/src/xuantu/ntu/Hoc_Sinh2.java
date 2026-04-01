package xuantu.ntu;

public class Hoc_Sinh2 {
	private String tenHS;
	private int tuoiHS;
	private String lopHS;
	protected String getTenHS() {
		return tenHS;
	}
	protected void setTenHS(String tenHS) {
		this.tenHS = tenHS;
	}
	protected int getTuoiHS() {
		return tuoiHS;
	}
	protected void setTuoiHS(int tuoiHS) {
		this.tuoiHS = tuoiHS;
	}
	protected String getLopHS() {
		return lopHS;
	}
	protected void setLopHS(String lopHS) {
		this.lopHS = lopHS;
	}
	public Hoc_Sinh2(String tenHS, int tuoiHS, String lopHS) {
		super();
		this.tenHS = tenHS;
		this.tuoiHS = tuoiHS;
		this.lopHS = lopHS;
	}
	public void Hien_thi(){
		System.out.println("Tên học sinh: " + tenHS +" "+"Tuổi học sinh: "+ tuoiHS + " " + "Lớp: "+lopHS);
	}
	
	
	
}
