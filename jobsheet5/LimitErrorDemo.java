import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * LimitErrorDemo
 * Sederhana: meminta user memasukkan bilangan bulat sebanyak N dan menjumlahkannya.
 * Jika user memberikan input yang bukan bilangan bulat, itu dihitung sebagai error.
 * Setelah mencapai batas MAX_ERRORS program akan berhenti menolak input lebih lanjut.
 *
 * Cara kerja:
 * - Program minta jumlah elemen (N)
 * - Membaca sampai N angka valid diterima atau errorLimit tercapai
 * - Menampilkan jumlah dari angka yang valid
 */
public class LimitErrorDemo {
    private static final int MAX_ERRORS = 3; // batas limit kesalahan

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program penjumlahan dengan batas limit error.");
        System.out.println("Ketik jumlah angka yang ingin dimasukkan (N):");

        int n = 0;
        while (true) {
            try {
                String line = scanner.nextLine().trim();
                n = Integer.parseInt(line);
                if (n <= 0) {
                    System.out.println("Masukkan nilai N > 0. Coba lagi:");
                    continue;
                }
                break;
            } catch (NumberFormatException ex) {
                System.out.println("Input tidak valid. Masukkan bilangan bulat untuk N:");
            }
        }

        int errors = 0;
        int accepted = 0;
        long sum = 0;

        System.out.println("Masukkan " + n + " bilangan bulat. Input yang bukan bilangan akan dihitung sebagai error.");
        while (accepted < n) {
            if (errors >= MAX_ERRORS) {
                System.out.println("Batas error terlampaui (" + MAX_ERRORS + "). Program dihentikan.");
                break;
            }

            System.out.print("Masukkan angka ke-" + (accepted + 1) + ": ");
            String line = scanner.nextLine().trim();
            try {
                int value = Integer.parseInt(line);
                sum += value;
                accepted++;
            } catch (NumberFormatException ex) {
                errors++;
                System.out.println("Input bukan bilangan bulat. Error count: " + errors + "/" + MAX_ERRORS);
                if (errors >= MAX_ERRORS) {
                    System.out.println("Anda telah mencapai batas kesalahan. Tidak bisa melanjutkan input.");
                }
            }
        }

        System.out.println("--- Hasil ---");
        System.out.println("Jumlah angka valid yang diterima: " + accepted);
        System.out.println("Total penjumlahan: " + sum);
        if (accepted < n) {
            System.out.println("Catatan: proses dihentikan sebelum menerima semua input karena batas error tercapai.");
        }

        scanner.close();
    }
}
