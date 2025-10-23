import java.util.Scanner;

public class TugasBioskop16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Harga dan variabel total global
        final int HARGA_TIKET = 50000; // Rp 50.000 per tiket [cite: 237]
        long totalPenjualan = 0;
        int totalTiketTerjual = 0;
        
        // Variabel untuk setiap transaksi
        int jumlahTiket;
        double diskon;
        long hargaTransaksi;

        System.out.println("--- Sistem Penjualan Tiket Bioskop ---");

        do {
            // Perulangan untuk memastikan input tiket valid (tidak negatif) [cite: 245]
            do {
                System.out.print("\nMasukkan jumlah tiket yang dibeli (0 untuk keluar): ");
                if (sc.hasNextInt()) {
                    jumlahTiket = sc.nextInt();
                    if (jumlahTiket < 0) { // Pengecekan input negatif
                        System.out.println("Input tidak valid. Jumlah tiket tidak boleh negatif. Silakan masukkan lagi.");
                    } else {
                        break; // Input valid (>= 0)
                    }
                } else {
                    System.out.println("Input tidak valid. Silakan masukkan angka.");
                    sc.next(); // Bersihkan buffer
                }
            } while (true);

            // Kondisi Keluar Loop Utama
            if (jumlahTiket == 0) {
                break; 
            }
            
            // 1. Tentukan Diskon
            diskon = 0.0;
            if (jumlahTiket > 10) {
                diskon = 0.15; // Diskon 15% jika beli > 10 tiket [cite: 239]
                System.out.println("Mendapat Diskon 15%");
            } else if (jumlahTiket > 4) {
                diskon = 0.10; // Diskon 10% jika beli > 4 tiket [cite: 238]
                System.out.println("Mendapat Diskon 10%");
            }

            // 2. Hitung Harga Transaksi
            hargaTransaksi = (long)jumlahTiket * HARGA_TIKET;
            hargaTransaksi -= (long)(hargaTransaksi * diskon); // Terapkan diskon

            // 3. Update Total Global
            totalPenjualan += hargaTransaksi;
            totalTiketTerjual += jumlahTiket;

            System.out.println("Harga transaksi ini: Rp " + hargaTransaksi);
            
            sc.nextLine(); // Membersihkan buffer

        } while (true); // Loop terus berjalan sampai di-break

        // Tampilkan Hasil Akhir
        System.out.println("\n=============================================");
        System.out.println("TOTAL PENJUALAN TIKET HARI INI:");
        System.out.println("Jumlah tiket terjual: " + totalTiketTerjual + " tiket");
        System.out.println("Total harga penjualan: Rp " + totalPenjualan);
        System.out.println("=============================================");

        sc.close();
    }
}