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
        
        // Perulangan DO-WHILE yang tidak memiliki kondisi keluar yang jelas/eksplisit
        do {
            System.out.print("Masukkan nama pelanggan: ");
            namaPelanggan = sc.nextLine();
            
            // Logika tidak ada break, loop akan terus berjalan tak terbatas 
            // selama kita menginput transaksi.
            
            System.out.print("Jumlah kopi: ");
            kopi = sc.nextInt();
            System.out.print("Jumlah teh: ");
            teh = sc.nextInt();
            System.out.print("Jumlah roti: ");
            roti = sc.nextInt();

            totalHarga = (long)kopi * hargaKopi + (long)teh * hargaTeh + (long)roti * hargaRoti;
            
            System.out.println("Total yang harus dibayar: Rp " + totalHarga);
            
            sc.nextLine(); // Membersihkan buffer
            
        } while (true); // Loop akan berjalan terus, hanya bisa dihentikan paksa (Ctrl+C)

        // sc.close(); // Bagian ini tidak akan pernah tercapai
    }
}