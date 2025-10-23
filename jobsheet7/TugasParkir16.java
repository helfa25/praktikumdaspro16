import java.util.Scanner;

public class TugasParkir16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Deklarasi sesuai flowchart: int jenis, durasi, total = 0 [cite: 250]
        int jenis, durasi; 
        long total = 0; 

        System.out.println("--- Sistem Pembayaran Parkir ---");
        
        // Output/Input awal [cite: 251, 253]
        System.out.println("\nMasukkan jenis kendaraan (1 Mobil, 2 Motor, 0 Keluar)");
        System.out.print("Input jenis: ");
        jenis = sc.nextInt();
        
        // Perulangan WHILE (jenis != 0) [cite: 264]
        while (jenis != 0) { 

            // IF (jenis == 1) || (jenis == 2) [cite: 254]
            if (jenis == 1 || jenis == 2) {
                
                System.out.print("Input durasi parkir (jam): ");
                durasi = sc.nextInt(); // Input durasi [cite: 256]

                // IF (durasi > 5) [cite: 258]
                if (durasi > 5) {
                    // Tarif tetap Rp 12.500 [cite: 277, 271]
                    total += 12500; 
                } else {
                    // IF (jenis == 1) [Mobil] [cite: 260]
                    if (jenis == 1) { 
                        // Mobil: Rp 3.000 per jam [cite: 276, 272]
                        total += (long)durasi * 3000;
                    } 
                    // IF (jenis == 2) [Motor] [cite: 263]
                    else if (jenis == 2) { 
                        // Motor: Rp 2.000 per jam [cite: 276, 273]
                        total += (long)durasi * 2000;
                    }
                }
            } else {
                // False dari IF (jenis == 1) || (jenis == 2)
                System.out.println("Jenis kendaraan tidak valid. Silakan masukkan 1, 2, atau 0.");
            }

            // Input jenis kendaraan berikutnya (kembali ke awal loop)
            System.out.println("\nMasukkan jenis kendaraan (1 Mobil, 2 Motor, 0 Keluar)");
            System.out.print("Input jenis: ");
            jenis = sc.nextInt();
        } 

        // Output total (setelah WHILE False) [cite: 266]
        System.out.println("\n=============================================");
        System.out.println("TOTAL Pembayaran Parkir Hari Ini: Rp " + total);
        System.out.println("=============================================");
        
        sc.close();
    }
}