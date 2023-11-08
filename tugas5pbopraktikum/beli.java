package tugas5pbopraktikum;

import java.util.Scanner;
public class beli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int potongan, hasil;
	        Scanner masukan = new Scanner(System.in);
	        System.out.print("Masukkan total pembelian Anda: ");
	    int pembelian = masukan.nextInt();
	    
	    if(pembelian < 50000){
	        potongan = pembelian * 5 / 100;
	        hasil = pembelian - potongan;
	    } else {
	        potongan = pembelian * 20 / 100;
	        hasil = pembelian - potongan;
	    }
	    System.out.print("besar potongan adalah: "+potongan+"\nJumlah yang harus dibayar adalah: "+hasil);
		

	}

}
