import java.util.Scanner;

public class kafe16 {

    public static void Menu(String namaPelanggan, boolean isMember) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");
        if (isMember) {
            System.out.println("Anda adalah member (Diskon 10% belum dihitung di sini).");
        }
        System.out.println("1. Kopi Hitam (15k) | 2. Cappuccino (20k) | 3. Latte (22k)");
        System.out.println("4. Teh Tarik (12k)  | 5. Roti Bakar (10k) | 6. Mie Goreng (18k)");
        System.out.println("Silakan pilih menu yang Anda inginkan.");
    }

    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;

        if (kodePromo.equals("DISKON50")) {
            System.out.println("\n>> Diskon 50% berhasil diterapkan!");
            hargaTotal = (int)(hargaTotal * 0.5);
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("\n>> Diskon 30% berhasil diterapkan!");
            hargaTotal = (int)(hargaTotal * 0.7);
        } else {
            System.out.println("\n>> Tidak ada kode promo yang valid.");
        }

        return hargaTotal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Menu("Budi", true); 

         System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
        int pilihanMenu = sc.nextInt();
        
        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int banyakItem = sc.nextInt();
        
         System.out.print("Masukkan kode promo: ");
        String kodePromo = sc.next(); 

        int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);
        
        System.out.println("Total harga setelah diskon: Rp " + totalHarga);
    }
}