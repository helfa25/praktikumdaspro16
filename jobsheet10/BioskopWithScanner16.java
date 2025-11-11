import java.util.Scanner;
import java.util.Arrays; // Diperlukan untuk utilitas seperti String.join()

public class BioskopWithScanner16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Deklarasi array 4 baris dan 2 kolom (Langkah 6)
        String[][] penonton = new String[4][2];
        int pilihan;

        do {
            // Jawaban Pertanyaan 2: Menu Opsi
            System.out.println("\n===== MENU BIOSKOP MINI =====");
            System.out.println("1: Input data penonton");
            System.out.println("2: Tampilkan daftar penonton");
            System.out.println("3: Exit");
            System.out.print("Pilih menu (1-3): ");
            
            // Handle input non-integer untuk pilihan menu
            if (sc.hasNextInt()) {
                pilihan = sc.nextInt();
                sc.nextLine(); // Membersihkan buffer
            } else {
                System.out.println("Input tidak valid. Masukkan angka 1, 2, atau 3.");
                sc.nextLine(); // Membersihkan input yang salah
                pilihan = 0; // Set pilihan default agar loop berlanjut
                continue;
            }

            switch (pilihan) {
                case 1: // Input data penonton
                    String nama;
                    int baris = 0, kolom = 0;
                    boolean inputLagi;
                    
                    do {
                        System.out.print("Masukkan nama: ");
                        nama = sc.nextLine();

                        // Loop untuk validasi input baris/kolom dan ketersediaan kursi
                        do {
                            try {
                                System.out.print("Masukkan baris (1-" + penonton.length + "): ");
                                baris = sc.nextInt();
                                System.out.print("Masukkan kolom (1-" + penonton[0].length + "): ");
                                kolom = sc.nextInt();
                                sc.nextLine(); // Membersihkan buffer

                                // Jawaban Pertanyaan 3: Handle baris/kolom tidak tersedia
                                if (baris < 1 || baris > penonton.length || kolom < 1 || kolom > penonton[0].length) {
                                    System.out.println("Peringatan: Nomor baris/kolom kursi TIDAK TERSEDIA. Silakan masukkan kembali.");
                                    continue; 
                                }
                                
                                // Jawaban Pertanyaan 4: Warning kursi sudah terisi
                                if (penonton[baris - 1][kolom - 1] != null) {
                                    System.out.println("Peringatan: Kursi [" + baris + "][" + kolom + "] sudah TERISI oleh " + penonton[baris - 1][kolom - 1] + ". Silakan pilih kursi lain.");
                                } else {
                                    // Input valid dan kursi kosong, isi array (Ingat: indeks = input - 1)
                                    penonton[baris - 1][kolom - 1] = nama;
                                    System.out.println("Kursi berhasil dipesan oleh " + nama + " di [" + baris + "][" + kolom + "]");
                                    break; // Keluar dari loop do-while input kursi
                                }
                            } catch (java.util.InputMismatchException e) {
                                System.out.println("Input tidak valid. Harap masukkan angka untuk baris dan kolom.");
                                sc.nextLine(); // Membersihkan input yang salah
                            }
                        } while (true); 

                        System.out.print("Input penonton lainnya? (y/n): ");
                        String next = sc.nextLine();
                        inputLagi = next.equalsIgnoreCase("y");
                    } while (inputLagi);
                    break;
                
                case 2: // Tampilkan daftar penonton (Jawaban Pertanyaan 2 & 5)
                    System.out.println("\n--- Daftar Penonton ---");
                    for (int i = 0; i < penonton.length; i++) {
                        String[] barisTampil = new String[penonton[i].length];
                        System.out.print("Baris " + (i + 1) + ": ");
                        for (int j = 0; j < penonton[i].length; j++) {
                            // Jawaban Pertanyaan 5: Ganti null dengan ***
                            String namaTampil = (penonton[i][j] == null) ? "***" : penonton[i][j];
                            System.out.print(namaTampil + " ");
                        }
                        System.out.println(); // Pindah baris
                    }
                    break;
                
                case 3: // Exit
                    System.out.println("Terima kasih, program berakhir.");
                    break;

                default:
                    // Pilihan 0 (jika input tidak valid) atau angka lain yang tidak terdaftar
                    if (pilihan != 0) {
                        System.out.println("Pilihan menu tidak ditemukan. Silakan coba lagi.");
                    }
            }
        } while (pilihan != 3);

        sc.close();
    }
}