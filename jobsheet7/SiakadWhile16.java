import java.util.Scanner;

public class SiakadWhile16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nilai, jml, i = 0; 

        System.out.print("Masukkan jumlah mahasiswa: ");
        jml = sc.nextInt(); 

        // Perulangan WHILE (i < jml)
        while (i < jml) { 
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai = sc.nextInt();

            // Pengecekan validitas nilai
            if (nilai < 0 || nilai > 100) { 
                System.out.println("Nilai tidak valid. Masukkan lagi nilai yang valid!");
                continue; // Lompati sisa kode, i tidak bertambah
            }

            // Pengecekan Kategori Nilai Huruf
            if (nilai > 80 && nilai <= 100) { // Nilai A
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah A");
                // Modifikasi: Tambahkan pesan
                System.out.println("Bagus, pertahankan nilainya!"); 
            } else if (nilai > 73 && nilai <= 80) { // B+
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah B+");
            } else if (nilai > 65 && nilai <= 73) { // B
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah B");
            } else if (nilai > 60 && nilai <= 65) { // C+
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah C+");
            } else if (nilai > 50 && nilai <= 60) { // C
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah C");
            } else if (nilai > 39 && nilai <= 50) { // D
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah D");
            } else { // E
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah E");
            }
            
            // i++ hanya dieksekusi jika nilai VALID
            i++; 
        }
        
        System.out.println("\nSemua nilai sudah dikelompokkan.");
        sc.close();
    }
}