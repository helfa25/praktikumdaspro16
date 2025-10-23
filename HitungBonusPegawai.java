import java.util.Scanner;

public class HitungBonusPegawai {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double jamKerja;
        double gajiHarian;
        double bonus;

        System.out.println("=========================================");
        System.out.println("PROGRAM HITUNG BONUS PEGAWAI"); // Dihilangkan: (JAVA) dan (Sentinel Value)
        System.out.println("=========================================");

        while (true) {
            try {
                // PROMPT KOREKSI: Hanya "Masukkan Jam Kerja"
                System.out.print("Masukkan Jam Kerja: ");
                jamKerja = input.nextDouble();

                // SENTINEL CHECK (Logika Tetap Ada)
                if (jamKerja <= 0) {
                    System.out.println("\n[Program Dihentikan.]");
                    break;
                }

                // INPUT LANJUTAN
                System.out.print("Masukkan Gaji Harian: ");
                gajiHarian = input.nextDouble();

                bonus = 0.0;

                // LOGIKA BONUS
                if (jamKerja > 8) {
                    bonus = gajiHarian * 0.20;
                } 

                // OUTPUT
                System.out.println("\n-----------------------------------------");
                System.out.printf("Jam Kerja Pegawai: %.1f jam%n", jamKerja);
                System.out.printf("Bonus Diterima: Rp %.2f%n", bonus);
                System.out.println("-----------------------------------------\n");

            } catch (java.util.InputMismatchException e) {
                System.out.println("\n[ERROR: Input tidak valid. Harap masukkan angka.]\n");
                input.next();
            }
        }
        
        input.close();
    }
}