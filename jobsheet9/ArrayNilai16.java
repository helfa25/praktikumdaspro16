import java.util.Scanner; // 3. Import Scanner [cite: 51]

public class ArrayNilai16 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 4. Deklarasi array nilaiAkhir 10 elemen [cite: 52, 53]
        int[] nilaiAkhir = new int[10]; 

        // 5. Perulangan untuk menerima input dan mengisi elemen array 
        for (int i = 0; i < 10; i++) { 
            System.out.print("Masukkan nilai akhir ke-" + i + ": "); 
            nilaiAkhir[i] = sc.nextInt(); 
        }

        // 6. Perulangan untuk menampilkan semua isi elemen [cite: 58, 59, 60, 61]
        for (int i = 0; i < 10; i++) { 
            System.out.println("Nilai akhir ke-" + i + " adalah " + nilaiAkhir[i]);
        }
        
        sc.close();
    }
}