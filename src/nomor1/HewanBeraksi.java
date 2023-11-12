package nomor1;

import java.util.Scanner;

public class HewanBeraksi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner input = new Scanner(System.in);
		        Kucing kucing = new Kucing(null);
		        Anjing anjing = new Anjing(null);

		        System.out.print("Masukkan jenis hewan: ");
		        String jenisHewan = input.nextLine();

		        if (jenisHewan.equalsIgnoreCase("Kucing")) {
		            kucing.berbunyi();
		        } else if (jenisHewan.equalsIgnoreCase("Anjing")) {
		            anjing.berbunyi();
		        } else {
		            System.out.println("Jenis hewan ini tidak dikenal.");
		        }

		        System.out.print("\nApakah Anda ingin melihat jenis hewan ini? (Y/N): ");
		        String pilihan = input.nextLine();

		        if (pilihan.equalsIgnoreCase("Y")) {
		            if (jenisHewan.equalsIgnoreCase("Kucing")) {
		                (kucing).jenis();
		            } else if (jenisHewan.equalsIgnoreCase("Anjing")) {
		                (anjing).jenis();
		            } else {
		                System.out.println("Hewan ini bukan mamalia.");
		            }
		        } else if (pilihan.equalsIgnoreCase("N")) {
		            System.out.println(".");
		        } else {
		            System.out.println("Pilihan yang Anda masukkan salah.");
		        }
		    }
		}

	}

}
