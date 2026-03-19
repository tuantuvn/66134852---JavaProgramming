package xuantu.ntu;

public class Con_meo {
	  private String mauLong;
	    private boolean thichLeoTree;
	    
	    public ConMeo(String ten, int tuoi, double canNang, 
	                  String mauLong, boolean thichLeoTree) {
	        super(ten, tuoi, canNang);
	        this.mauLong = mauLong;
	        this.thichLeoTree = thichLeoTree;
	    }
	    
	    
	    public void batChuot() {
	        System.out.println(Ten + " đang rình bắt chuột...");
	    }
	    
	    public void keu() {
	        System.out.println(Ten + " kêu: Meo meo!");
	    }
	    
	  
	    public void an() {
	        System.out.println(Ten + " đang ăn cá một cách nhẹ nhàng...");
	    }
	    
	   
	    public void hienThiThongTin() {
	        super.hienThiThongTin();
	        System.out.println("Màu lông: " + mauLong);
	        System.out.println("Thích leo trèo: " + (thichLeoTree ? "Có" : "Không"));
	    }
}
