import java.util.Scanner;

public class BioskopWithScanner16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Deklarasi array 4 baris dan 2 kolom
        String[][] penonton = new String[4][2];
        int pilihan;

        do {
            // Jawaban Pertanyaan 2: Menu Opsi
            System.out.println("\n===== MENU BIOSKOP MINI =====");
            System.out.println("1: Input data penonton");
            System.out.println("2: Tampilkan daftar penonton");
            System.out.println("3: Exit");
            System.out.print("Pilih menu (1-3): ");
            pilihan = sc.nextInt();
            sc.nextLine(); // Membersihkan buffer setelah sc.nextInt()

            switch (pilihan) {
                case 1: // Input data penonton
                    String nama;
                    int baris, kolom;
                    boolean inputLagi = true;
                    
                    while (inputLagi) {
                        System.out.print("Masukkan nama: ");
                        nama = sc.nextLine();

                        // Loop untuk validasi input baris/kolom
                        do {
                            System.out.print("Masukkan baris (1-4): ");
                            baris = sc.nextInt();
                            System.out.print("Masukkan kolom (1-2): ");
                            kolom = sc.nextInt();
                            sc.nextLine(); // Membersihkan buffer

                            // Jawaban Pertanyaan 3: Handle baris/kolom tidak tersedia
                            if (baris < 1 || baris > penonton.length || kolom < 1 || kolom > penonton[0].length) {
                                System.out.println("Peringatan: Nomor baris/kolom kursi TIDAK TERSEDIA. Silakan masukkan kembali.");
                                continue; 
                            }
                            
                            // Jawaban Pertanyaan 4: Warning kursi sudah terisi
                            if (penonton[baris - 1][kolom - 1] != null) {
                                System.out.println("Peringatan: Kursi [" + baris + "][" + kolom + "] sudah TERISI. Silakan pilih kursi lain.");
                            } else {
                                // Input valid dan kursi kosong, isi array (Ingat: indeks = input - 1)
                                penonton[baris - 1][kolom - 1] = nama;
                                break; // Keluar dari loop do-while
                            }
                        } while (true); // Loop sampai input valid dan kursi kosong

                        System.out.print("Input penonton lainnya? (y/n): ");
                        String next = sc.nextLine();
                        if (next.equalsIgnoreCase("n")) {
                            inputLagi = false;
                        }
                    }
                    break;
                
                case 2: // Tampilkan daftar penonton (Jawaban Pertanyaan 2 & 5)
                    System.out.println("\n--- Daftar Penonton ---");
                    for (int i = 0; i < penonton.length; i++) {
                        String[] barisTampil = new String[penonton[i].length];
                        for (int j = 0; j < penonton[i].length; j++) {
                            // Jawaban Pertanyaan 5: Ganti null dengan ***
                            barisTampil[j] = (penonton[i][j] == null) ? "***" : penonton[i][j];
                        }
                        System.out.println("Baris " + (i + 1) + ": " + String.join(", ", barisTampil));
                    }
                    break;
                
                case 3: // Exit
                    System.out.println("Terima kasih, program berakhir.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 3);

        sc.close();
    }
}