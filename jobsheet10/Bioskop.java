import java.util.Arrays; // Diperlukan jika ingin menggunakan Arrays.toString()

public class Bioskop {
    public static void main(String[] args) {
        // Langkah 3 & 4: Deklarasi dan Pengisian Data Awal
        String[][] penonton = new String[4][2];
        
        penonton[0][0] = "Amin";
        penonton[0][1] = "Bena";
        penonton[1][0] = "Candra";
        penonton[1][1] = "Dela";
        penonton[2][0] = "Eka";
        penonton[2][1] = "Farhan";
        penonton[3][0] = "Gisel";
        
        // Jawaban Pertanyaan 3: Melengkapi penonton[3][1]
        penonton[3][1] = "Hana";

        // Langkah 5 (setelah dilengkapi)
        System.out.println("--- Percobaan 1: Daftar Penonton (Langkah 5 dan P3) ---");
        System.out.printf("%s \t %s\n", penonton[0][0], penonton[0][1]);
        System.out.printf("%s \t %s\n", penonton[1][0], penonton[1][1]);
        System.out.printf("%s \t %s\n", penonton[2][0], penonton[2][1]);
        System.out.printf("%s \t %s\n", penonton[3][0], penonton[3][1]);


        // Jawaban Pertanyaan 4: Menampilkan Length
        System.out.println("\n--- Jawaban Pertanyaan 4: Menampilkan Length ---");
        System.out.println("Jumlah Baris (penonton.length): " + penonton.length);
        System.out.println("Panjang Kolom Baris 0 (penonton[0].length): " + penonton[0].length);


        // Jawaban Pertanyaan 5: Menampilkan Panjang Setiap Baris dengan For Loop
        System.out.println("\n--- Jawaban Pertanyaan 5: Panjang Baris (For Loop) ---");
        for (int i = 0; i < penonton.length; i++) {
            System.out.println("Panjang baris ke-" + (i + 1) + ":" + penonton[i].length);
        }

        // Jawaban Pertanyaan 6: Menampilkan Panjang Setiap Baris dengan Foreach Loop
        System.out.println("\n--- Jawaban Pertanyaan 6: Panjang Baris (Foreach Loop) ---");
        for (String[] barisPenonton : penonton) {
            System.out.println("Panjang baris: " + barisPenonton.length);
        }

        // Jawaban Pertanyaan 7: Menampilkan Penonton Baris Ke-3 (indeks 2) dengan For Loop
        System.out.println("\n--- Jawaban Pertanyaan 7: Penonton Baris Ke-3 (For Loop) ---");
        System.out.println("Penonton pada baris ke-3: ");
        for (int i = 0; i < penonton[2].length; i++) {
            System.out.println(penonton[2][i]);
        }

        // Jawaban Pertanyaan 8: Menampilkan Penonton Baris Ke-3 dengan Foreach Loop
        System.out.println("\n--- Jawaban Pertanyaan 8: Penonton Baris Ke-3 (Foreach Loop) ---");
        System.out.println("Penonton pada baris ke-3: ");
        for (String nama : penonton[2]) {
            System.out.println(nama);
        }

        // Jawaban Pertanyaan 9: Menampilkan Penonton Setiap Baris
        System.out.println("\n--- Jawaban Pertanyaan 9: Penonton Setiap Baris ---");
        for (int i = 0; i < penonton.length; i++) {
            // String.join() menggabungkan elemen array dengan pemisah ", "
            System.out.println("Penonton pada baris ke-" + (i + 1) + ":" + String.join(", ", penonton[i]));
        }
    }
}