package nomor1;

public class Hewan {
	protected String jenisSuara;
	
	public Hewan(String jenisSuara) {
		this.jenisSuara = jenisSuara;
	}
	
	public void berbunyi() {
		System.out.println("Hewan Bersuara: "+jenisSuara);
	}

}
