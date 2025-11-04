import java.util.Scanner;

public class ArrayNilai16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiAkhir = new int[10]; 

        for (int i = 0; i < nilaiAkhir.length; i++) { 
            System.out.print("Masukkan nilai akhir mahasiswa ke-" + (i + 1) + ": "); 
            nilaiAkhir[i] = sc.nextInt(); 
        }

        System.out.println("\n--- Hasil Status Kelulusan ---");

        for (int i = 0; i < nilaiAkhir.length; i++) { 

            if (nilaiAkhir[i] > 70) {
                System.out.println("Mahasiswa ke-" + (i + 1) + " LULUS!"); // Menggunakan i+1 agar nomor mahasiswa dimulai dari 1
            } else {
                System.out.println("Mahasiswa ke-" + (i + 1) + " TIDAK LULUS!");
            }
        }
        
        sc.close();
    }
}