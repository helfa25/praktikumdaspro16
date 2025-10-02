package jobsheet5;
import java.util.Scanner;

public class nestedUjianSkripsi16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String pesan;

        System.out.print("Apakah Anda bebas kompen? (Yes/No): ");
        String bebasKompen = sc.nextLine().trim();

        System.out.print("Masukkan jumlah bimbingan dengan Pembimbing 1: ");
        int bimbinganP1 = sc.nextInt();

        System.out.print("Masukkan jumlah bimbingan dengan Pembimbing 2: ");
        int bimbinganP2 = sc.nextInt();

        if (bebasKompen.equalsIgnoreCase("Yes")) {
            if (bimbinganP1 >= 8) {
                if (bimbinganP2 >= 4) {
                    pesan = "Anda dapat mendaftar ujian skripsi.";
                } else {
                    pesan = "Gagal! Bimbingan dengan Pembimbing 2 kurang dari 4 kali.";
                }
            } else {
                pesan = "Gagal! Bimbingan dengan Pembimbing 1 kurang dari 8 kali.";
            }
        } else {
            pesan = "Registrasi ditolak. Silakan lunasi kompen terlebih dahulu.";
        }

        System.out.println(pesan);
    }
}
