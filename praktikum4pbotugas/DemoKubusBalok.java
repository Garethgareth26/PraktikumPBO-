package praktikum4pbotugas;

public class DemoKubusBalok {
	
	 public static void main(String[] args) {
	       
	        Perhitungan kubus = new Kubus(6);
	        System.out.println("Volume Kubus: " + kubus.Volume());
	        System.out.println("Luas Permukaan Kubus: " + kubus.LuasPermukaan());

	       
	        Perhitungan balok = new Balok(5, 4, 3);
	        System.out.println("Volume Balok: " + balok.Volume());
	        System.out.println("Luas Permukaan Balok: " + balok.LuasPermukaan());
	    }
}
