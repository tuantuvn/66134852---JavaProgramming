
public class Tinh_tien_dien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Sodien = 250;
		double Tiendien = 0;
		if (Sodien <= 50) {
			Tiendien = Sodien * 1678;
		}else if (Sodien <= 100) {
			Tiendien = Sodien * 1678 + (Sodien - 50) * 1734;
		}else if (Sodien <= 200) {

            Tiendien = 50 * 1678 + 50 * 1734 + 100 * 2014 + (Sodien - 200) * 2536;
		}else if(Sodien <= 300) {
			 Tiendien = 50 * 1678 + 50 * 1734 + 100 * 2014 + 100 * 2536 + (Sodien - 300) * 2834;
		}
		 System.out.println("Số điện: " + Sodien + " kWh");
	     System.out.println("Tiền điện: " + Tiendien + " đồng");
	     System.out.println("Tiền điện (VND): " + String.format("PT,.0f", Tiendien) + " đ");
	}
	

}
