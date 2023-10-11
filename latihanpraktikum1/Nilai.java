
package latihanpraktikum1;

public class Nilai {
        String nim;
	String nama;
	Float  NAbsen;
	Float  NTugas;
	Float  NUTS;
	Float  NUAS;
	Float  NAkhir;
	
	float nilai() {
		NAkhir = (NAbsen * 10/100) + (NTugas * 20/100) + (NUTS * 30/100) + (NUAS * 40/100);
		return NAkhir;
	}
	
	void CetakNilai() {
		System.out.println("NIM: "+nim);
		System.out.println("Nama: "+nama);
		System.out.println("Nilai Absen [10%]: "+NAbsen);
		System.out.println("Nilai Tugas [20%]: "+NTugas);
		System.out.println("Nilai UTS [30%]: "+NUTS);
		System.out.println("Nilai UAS [40%]: "+NUAS);
		System.out.println("Nilai Akhir: "+nilai());
    }
}
