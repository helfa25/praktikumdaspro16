package jobsheet5;

import java.util.Scanner;

public class nestedUjianSkripsi16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pesan = "";

        System.out.print("Apakah Anda bebas kompen? (Ya/Tidak): ");
        String bebasKompen = sc.nextLine().trim();

        if (bebasKompen.equalsIgnoreCase("Ya")) {
            System.out.print("Masukan log bimbingan pembimbing 1: ");
            int bimbinganP1 = sc.nextInt();
            System.out.print("Masukan log bimbingan pembimbing 2: ");
            int bimbinganP2 = sc.nextInt();

            if (bimbinganP1 >= 8 && bimbinganP2 >= 4) {
                pesan = "Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi.";
            } else if (bimbinganP1 < 8 && bimbinganP2 < 4) {
                pesan = "Gagal! Log bimbingan P1 kurang dari 8 kali dan P2 kurang dari 4 kali.";
            } else if (bimbinganP1 < 8) {
                pesan = "Gagal! Log bimbingan P1 belum mencapai 8 kali.";
            } else {
                pesan = "Gagal! Log bimbingan P2 belum mencapai 4 kali.";
            }
        } else {
            pesan = "Gagal! Mahasiswa masih memiliki tanggungan kompen.";
        }

        System.out.println("\n" + pesan);
        sc.close();
    }
}
