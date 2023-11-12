package nomor1;

public class Anjing extends Hewan {
	
	public Anjing(String jenisSuara) {
		super("Guk Guk");
	}
	
	public void berbunyi() {
		System.out.println("Suara Anjing: "+jenisSuara);
	}
	
	public void jenis() {
		System.out.println("Hewan ini addalah Mamalia");
	}

}
