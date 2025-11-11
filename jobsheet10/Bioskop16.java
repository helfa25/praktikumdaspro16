package jobsheet10;
public class Bioskop16 {
    public static void main(String[] args) {
        // Langkah 3: Buat array of String 4 baris dan 2 kolom
        String[][] penonton = new String[4][2];

        // Langkah 4: Isi masing-masing elemen array
        penonton[0][0] = "Amin";
        penonton[0][1] = "Bena";
        penonton[1][0] = "Candra";
        penonton[1][1] = "Dela";
        penonton[2][0] = "Eka";
        penonton[2][1] = "Farhan";
        penonton[3][0] = "Gisel";
        // penonton[3][1] dibiarkan null

        // Langkah 5: Tampilkan semua isi elemennya ke layar
        System.out.println("--- Daftar Penonton Awal (Langkah 5) ---");
        System.out.printf("%s \t %s\n", penonton[0][0], penonton[0][1]);
        System.out.printf("%s \t %s\n", penonton[1][0], penonton[1][1]);
        System.out.printf("%s \t %s\n", penonton[2][0], penonton[2][1]);
        System.out.printf("%s \t %s\n", penonton[3][0], penonton[3][1]); // Output: Gisel    null
    }
}