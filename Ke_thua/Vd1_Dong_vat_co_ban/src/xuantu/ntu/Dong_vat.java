package xuantu.ntu;

public class Dong_vat {
	 protected String Ten;
	    protected int Tuoi;
	    protected double Can_Nang;
	    
	  
	    public Dong_vat(String ten, int tuoi, double Can_nang) {
	        this.Ten = ten;
	        this.Tuoi = tuoi;
	        this.Can_Nang = Can_nang;
	    }
	    
	    public void an() {
	        System.out.println(Ten + " đang ăn...");
	    }
	    
	    public void ngu() {
	        System.out.println(Ten + " đang ngủ...");
	    }
	    
	    public void hienThiThongTin() {
	        System.out.println("Tên: " + Ten);
	        System.out.println("Tuổi: " + Tuoi + " năm");
	        System.out.println("Cân nặng: " + Can_Nang + " kg");
	    }
 
 
}
