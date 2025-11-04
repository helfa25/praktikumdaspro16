import java.util.Scanner;

public class Tugas1ManajemenNilai16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai mahasiswa: "); 
        int jumlahMhs = sc.nextInt();

        if (jumlahMhs <= 0) {
            System.out.println("Jumlah mahasiswa harus lebih dari 0.");
            sc.close();
            return; 
        }

        int[] nilai = new int[jumlahMhs];
        double total = 0;
        
        System.out.println("=== Input Nilai ===");

        for (int i = 0; i < jumlahMhs; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": "); 
            nilai[i] = sc.nextInt();
            total += nilai[i];
        }

        int nilaiTertinggi = nilai[0];
        int nilaiTerendah = nilai[0];
        
        for (int i = 1; i < jumlahMhs; i++) {
            if (nilai[i] > nilaiTertinggi) {
                nilaiTertinggi = nilai[i]; 
            }
            if (nilai[i] < nilaiTerendah) {
                nilaiTerendah = nilai[i]; 
            }
        }

        double rataRata = total / jumlahMhs; 

        System.out.println("\n--- Hasil Analisis Nilai ---");

        System.out.print("Semua Nilai: ["); 
        for (int i = 0; i < jumlahMhs; i++) {
            System.out.print(nilai[i] + (i < jumlahMhs - 1 ? ", " : ""));
        }
        System.out.println("]");
        
        System.out.println("Nilai Tertinggi: " + nilaiTertinggi); 
        System.out.println("Nilai Terendah: " + nilaiTerendah); 
        System.out.printf("Nilai Rata-Rata: %.2f\n", rataRata);
        System.out.println("----------------------------");

        sc.close();
    }
}