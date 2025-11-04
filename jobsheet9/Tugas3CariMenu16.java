import java.util.Scanner;

public class Tugas3CariMenu16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", 
                         "Kentang Goreng", "Teh Tarik", "Cappucino", 
                         "Chocolate Ice"};
        
        int hasilIndeks = -1;
        
        System.out.println("=== Pencarian Menu Kafe (Linear Search) ===");
        System.out.println("Menu Tersedia: " + String.join(", ", menu));
        System.out.println("-------------------------------------------");

        System.out.print("Masukkan nama makanan/minuman yang ingin dicari: "); 
        String key = sc.nextLine();

        for (int i = 0; i < menu.length; i++) {
            if (key.equalsIgnoreCase(menu[i])) { 
                hasilIndeks = i; 
                break; 
            }
        }

        System.out.println("\n--- Hasil Pencarian ---");
        if (hasilIndeks != -1) {
            System.out.println("Makanan '" + menu[hasilIndeks] + "' **TERSEDIA** di menu!");
            System.out.println("Ditemukan pada indeks ke-" + hasilIndeks + ".");
        } else {
            System.out.println("Makanan '" + key + "' **TIDAK ADA** di menu.");
        }

        sc.close();
    }
}