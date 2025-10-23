import java.util.Scanner;

public class SiakadFor16 {
    public static void main(String[] args) {
        // Deklarasi dan Inisialisasi
        Scanner sc = new Scanner(System.in);
        // tertinggi diinisialisasi 0 dan terendah 100 sesuai Flowchart
        double nilai, tertinggi = 0, terendah = 100; 
        
        // Variabel untuk menghitung Lulus/Tidak Lulus (Modifikasi Soal)
        int lulus = 0; 
        int tidakLulus = 0; 

        System.out.println("--- Perhitungan Nilai 10 Mahasiswa ---");

        // Perulangan FOR (i=1 sampai i<=10)
        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble(); // Input nilai

            // 1. Pengecekan Nilai Tertinggi
            if (nilai > tertinggi) {
                tertinggi = nilai; 
            }

            // 2. Pengecekan Nilai Terendah
            if (nilai < terendah) {
                terendah = nilai; 
            }


        }

        // Menampilkan hasil
        System.out.println("\n-------------------------------------");
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        

        sc.close();
    }
}