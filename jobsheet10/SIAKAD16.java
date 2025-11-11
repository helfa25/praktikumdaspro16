import java.util.Scanner;

public class SIAKAD16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Array dibuat kaku: 4 baris (siswa) dan 3 kolom (matkul)
        int[][] nilai = new int[4][3];

        // --- Bagian 1: Input dan Rata-rata Per Siswa ---
        System.out.println("--- Input Nilai dan Rata-rata Per Siswa ---");
        // Loop siswa: i < 4 (hardcoded)
        for (int i = 0; i < 4; i++) { 
            System.out.println("Input nilai mahasiswa ke-" + (i + 1));
            double totalPerSiswa = 0;
            
            // Loop matkul: j < 3 (hardcoded)
            for (int j = 0; j < 3; j++) { 
                System.out.print("Nilai mata kuliah " + (j + 1) + ":");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];
            }
            // Pembagian rata-rata juga hardcoded: / 3
            double rataRataSiswa = totalPerSiswa / 3; 
            System.out.println("Nilai rata-rata: " + rataRataSiswa);
        }

        // --- Bagian 2: Rata-rata Per Mata Kuliah ---
        System.out.println("\n====================================");
        System.out.println("Rata-rata Nilai setiap Mata Kuliah:");
        
        // Loop matkul: j < 3 (hardcoded)
        for (int j = 0; j < 3; j++) { 
            double totalPerMatkul = 0;
            
            // Loop siswa: i < 4 (hardcoded)
            for (int i = 0; i < 4; i++) { 
                totalPerMatkul += nilai[i][j]; 
            }
            // Pembagian rata-rata juga hardcoded: / 4
            double rataRataMatkul = totalPerMatkul / 4; 
            System.out.println("Mata Kuliah " + (j + 1) + ": " + rataRataMatkul);
        }

        sc.close();
    }
}