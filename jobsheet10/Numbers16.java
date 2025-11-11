import java.util.Arrays; 

public class Numbers16 {
    public static void main(String[] args) {
        // Langkah 3: Deklarasi Jagged Array
        int[][] myNumbers = new int[3][]; 
        
        myNumbers[0] = new int[5]; // Baris 0 memiliki 5 kolom
        myNumbers[1] = new int[3]; // Baris 1 memiliki 3 kolom
        myNumbers[2] = new int[1]; // Baris 2 memiliki 1 kolom

        // Modifikasi: Mengisi elemen array dengan nilai (bukan nilai default 0)
        int counter = 1;
        for (int i = 0; i < myNumbers.length; i++) {
            for (int j = 0; j < myNumbers[i].length; j++) {
                myNumbers[i][j] = counter;
                counter++;
            }
        }
        
        // Jawaban Pertanyaan 1: Menampilkan elemen array dengan for loop dan Arrays.toString()
        System.out.println("--- Isi Array myNumbers (Setelah Diisi Nilai) ---");
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println("Baris ke-" + (i + 1) + ": " + Arrays.toString(myNumbers[i]));
        }

        // Jawaban Pertanyaan 4: Menampilkan panjang setiap baris
        System.out.println("\n--- Panjang Setiap Baris Array ---");
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println("Panjang baris ke-" + (i + 1) + ":" + myNumbers[i].length);
        }
    }
}