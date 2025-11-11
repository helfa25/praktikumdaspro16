import java.util.Scanner;

public class SIAKAD16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // SETUP DINAMIS (Modifikasi dari Pertanyaan 1)
        System.out.println("====================================");
        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = sc.nextInt();
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMatkul = sc.nextInt();
        sc.nextLine(); 

        int[][] nilai = new int[jumlahSiswa][jumlahMatkul];

        // --- INPUT NILAI (Bagian 1) ---
        System.out.println("\n--- INPUT NILAI ---");
        for (int i = 0; i < nilai.length; i++) { 
            System.out.println("Input nilai mahasiswa ke-" + (i + 1));
            for (int j = 0; j < nilai[i].length; j++) { 
                System.out.print("Nilai mata kuliah " + (j + 1) + ":");
                nilai[i][j] = sc.nextInt();
            }
        }
        
        sc.nextLine(); // Membersihkan buffer

        // --- TAMPILAN HASIL DALAM FORMAT TABEL (BARIS & KOLOM) ---
        System.out.println("\n====================================");
        System.out.println("HASIL NILAI MAHASISWA (TABEL)");
        
        // 1. HEADER KOLOM
        // %-10s: String rata kiri, lebar 10 karakter
        System.out.printf("%-10s", "SISWA"); 
        for (int j = 0; j < jumlahMatkul; j++) {
            // %-10s: String rata kiri, lebar 10 karakter untuk nama Matkul
            System.out.printf("%-10s", "MATKUL " + (j + 1)); 
        }
        System.out.printf("%-10s", "RATA-RATA");
        System.out.println(); // Pindah baris
        
        // 2. DATA BARIS SISWA
        for (int i = 0; i < nilai.length; i++) {
            double totalPerSiswa = 0;
            
            // Kolom Nama Siswa
            System.out.printf("%-10s", "Siswa " + (i + 1)); 
            
            // Kolom Nilai Matkul
            for (int j = 0; j < nilai[i].length; j++) { 
                System.out.printf("%-10d", nilai[i][j]); // %-10d: Integer rata kiri, lebar 10 karakter
                totalPerSiswa += nilai[i][j];
            }
            
            // Kolom Rata-rata Siswa
            double rataRataSiswa = totalPerSiswa / nilai[i].length;
            // %-10.2f: Floating point rata kiri, lebar 10 karakter, 2 angka di belakang koma
            System.out.printf("%-10.2f", rataRataSiswa); 
            System.out.println(); // Pindah baris
        }

        // --- BAGIAN RATA-RATA MATA KULIAH (Di bawah tabel) ---
        System.out.println("\n------------------------------------");
        System.out.print("RATA-RATA: ");
        
        double totalGlobal = 0;
        int hitungNilai = 0;
        
        // Loop untuk menghitung dan menampilkan Rata-rata per Mata Kuliah
        for (int j = 0; j < nilai[0].length; j++) { 
            double totalPerMatkul = 0;
            
            for (int i = 0; i < nilai.length; i++) { 
                totalPerMatkul += nilai[i][j];
                totalGlobal += nilai[i][j];
                hitungNilai++;
            }
            double rataRataMatkul = totalPerMatkul / nilai.length; 
            System.out.printf("%-10.2f", rataRataMatkul); 
        }

        // Tampilkan Rata-rata Global (Nilai Rata-rata keseluruhan)
        double rataRataGlobal = hitungNilai > 0 ? totalGlobal / hitungNilai : 0;
        System.out.printf(" (Global: %.2f)", rataRataGlobal);
        System.out.println();

        sc.close();
    }
}