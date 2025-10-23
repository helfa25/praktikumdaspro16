import java.util.Scanner;

public class KafeDoWhile16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int kopi, teh, roti;
        String namaPelanggan;
        final int hargaKopi = 12000;
        final int hargaTeh = 7000;
        final int hargaRoti = 20000;
        long totalHarga; 

        System.out.println("--- Sistem Transaksi Kafe ---");
        
        // Perulangan DO-WHILE
        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();

            // MODIFIKASI: Kondisi berhenti menggunakan break
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break; // Keluar dari perulangan
            }
            // END MODIFIKASI

            // Input jumlah item
            System.out.print("Jumlah kopi: ");
            kopi = sc.nextInt();
            System.out.print("Jumlah teh: ");
            teh = sc.nextInt();
            System.out.print("Jumlah roti: ");
            roti = sc.nextInt();

            // Hitung total harga
            totalHarga = (long)kopi * hargaKopi + (long)teh * hargaTeh + (long)roti * hargaRoti;
            
            // Tampilkan hasil
            System.out.println("Total yang harus dibayar: Rp " + totalHarga);
            
            sc.nextLine(); // Membersihkan buffer
            
        } while (true); // Kondisi loop tetap true

        System.out.println("Semua transaksi selesai.");
        sc.close();
    }
}