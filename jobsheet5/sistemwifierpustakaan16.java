package jobsheet5;

import java.util.Scanner;

public class sistemwifierpustakaan16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Apakah mahasiswa sudah bebas tanggungan perpustakaan? (Ya/Tidak): ");
        String bebasPerpus = sc.nextLine();

        
        System.out.print("Apakah kartu mahasiswa masih aktif? (Ya/Tidak): ");
        String kartuAktif = sc.nextLine();

        String pesan = "";

       
        if (bebasPerpus.equalsIgnoreCase("Ya")) {
            if (kartuAktif.equalsIgnoreCase("Ya")) {
               
                System.out.print("Masukkan poin kedisiplinan mahasiswa (0–100): ");
                int poin = sc.nextInt();

                if (poin >= 80) {
                    pesan = " Akses WiFi diizinkan sepenuhnya. Terima kasih sudah menjaga kedisiplinan!";
                } else if (poin >= 60) {
                    pesan = " Akses WiFi diizinkan terbatas (hanya jam tertentu). Tingkatkan kedisiplinanmu!";
                } else {
                    pesan = " Akses WiFi ditolak karena poin kedisiplinan rendah.";
                }
            } else {
                pesan = " Kartu mahasiswa tidak aktif, tidak bisa mengakses WiFi.";
            }
        } else {
            pesan = " Mahasiswa masih memiliki tanggungan perpustakaan, akses WiFi ditolak.";
        }

        System.out.println("\nHasil: " + pesan);

        sc.close();
    }
}

