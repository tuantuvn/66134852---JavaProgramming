package xuantu.ntu;

public class Con_cho {
	private String giongCho;
    private boolean coTheTruongNha;
    
   
    public ConCho(String ten, int tuoi, double canNang, 
                  String giongCho, boolean coTheTruongNha) {
        super(Ten, Tuoi, Can_Nang);  
        this.giongCho = giongCho;
        this.coTheTruongNha = coTheTruongNha;
    }
    

    public void sua() {
        System.out.println(Ten + " đang sủa: Gâu gâu!");
    }
    
    public void duoiMeo() {
        System.out.println(Ten + " đang đuổi mèo...");
    }
    
  
 
    public void hienThiThongTin() {
        super.hienThiThongTin();  
        System.out.println("Giống chó: " + giongCho);
        System.out.println("Có thể trông nhà: " + (coTheTruongNha ? "Có" : "Không"));
    }
}
