import java.util.Arrays; // Diperlukan untuk menggunakan Arrays.toString()

public class Numbers16 {
    public static void main(String[] args) {
        // Langkah 3: Deklarasi dan Instansiasi array. 
        // Hanya menentukan jumlah baris (3), dimensi kedua dibiarkan kosong
        int[][] myNumbers = new int[3][]; 
        
        // Inisialisasi panjang kolom yang berbeda untuk setiap baris (Jagged Array)
        myNumbers[0] = new int[5]; // Baris 0 memiliki 5 kolom
        myNumbers[1] = new int[3]; // Baris 1 memiliki 3 kolom
        myNumbers[2] = new int[1]; // Baris 2 memiliki 1 kolom

        // Jawaban Pertanyaan 1: Menampilkan elemen array dengan for loop dan Arrays.toString()
        System.out.println("--- Isi Array myNumbers (Percobaan 3) ---");
        for (int i = 0; i < myNumbers.length; i++) {
            // Arrays.toString(myNumbers[i]) mengubah array 1D (satu baris) menjadi String
            // Nilai default int adalah 0 (Jawaban P3)
            System.out.println("Baris ke-" + (i + 1) + ": " + Arrays.toString(myNumbers[i]));
        }

        // Jawaban Pertanyaan 4: Menampilkan panjang setiap baris
        System.out.println("\n--- Panjang Setiap Baris Array ---");
        for (int i = 0; i < myNumbers.length; i++) {
            // myNumbers[i].length memberikan panjang kolom pada baris ke-i
            System.out.println("Panjang baris ke-" + (i + 1) + ":" + myNumbers[i].length);
        }
    }
}