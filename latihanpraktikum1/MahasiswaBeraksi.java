
package latihanpraktikum1;

public class MahasiswaBeraksi {
    public static void main(String[] args) {
        mahasiswa mahasiswa = new mahasiswa();

        System.out.println("Mahasiswa sedang beraksi:");
        System.out.println("------------------------------------");

        mahasiswa.membaca();
        mahasiswa.nyontek();
        mahasiswa.modifikasi();
    }
}
