import java.util.Scanner;

public class Tugas2TotalBiayaPesanan16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah pesanan yang akan diinput: "); 
        int jumlahPesanan = sc.nextInt();
        sc.nextLine(); 

        String[] namaPesanan = new String[jumlahPesanan]; 
        double[] hargaPesanan = new double[jumlahPesanan]; 
        double totalBiaya = 0;

        System.out.println("\n=== Input Daftar Pesanan Kafe ===");
        
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println("--- Pesanan ke-" + (i + 1) + " ---");
            
            System.out.print("Nama Pesanan: "); 
            namaPesanan[i] = sc.nextLine();
            
            System.out.print("Harga Satuan: Rp "); 
            hargaPesanan[i] = sc.nextDouble();
            sc.nextLine(); 
            
            totalBiaya += hargaPesanan[i]; 
        }

        System.out.println("\n==================================");
        System.out.println("     DAFTAR PESANAN DAN TOTAL BIAYA"); 
        System.out.println("==================================");
        
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.printf("%d. %-20s : Rp %.2f\n", (i + 1), namaPesanan[i], hargaPesanan[i]);
        }
        
        System.out.println("----------------------------------");
        System.out.printf("Total Biaya Keseluruhan: Rp %.2f\n", totalBiaya); 
        System.out.println("==================================");

        sc.close();
    }
}