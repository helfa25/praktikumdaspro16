import java.util.Scanner;

public class NilaiKelompok16 { // Pastikan nama file sesuai dengan class
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, nilai;
        float totalNilai, rataNilai;
        
        float maxRataRata = -1;
        int kelompokTerbaik = 0; 

        i = 1;
        while (i <= 6) { // Asumsi 6 kelompok
            System.out.println("Kelompok " + i);
            
            totalNilai = 0; 

            for (j = 1; j <= 5; j++) { // Asumsi 5 penilai
                System.out.print(" Nilai dari Kelompok Penilai " + j + ": ");
                
                if (sc.hasNextInt()) {
                    nilai = sc.nextInt();
                    totalNilai += nilai;
                } else {
                    System.out.println("Input tidak valid! Program berhenti.");
                    sc.close();
                    return;
                }
            }

            rataNilai = totalNilai / 5;
            System.out.println("Kelompok " + i + ": nilai rata-rata = " + rataNilai);
            
            if (rataNilai > maxRataRata) {
                maxRataRata = rataNilai; 
                kelompokTerbaik = i;     
            }
            
            System.out.println(); 

            i++;
        }
        
        // TAMPILKAN HASIL AKHIR YANG DIPERBAIKI (Baris 60 & 61 error Anda)
        System.out.println("==============================================");
        System.out.println("Hasil Akhir: ");
        
        if (kelompokTerbaik > 0) {
            // Hapus semua karakter double asterisk (**) di sekitar variabel
            System.out.println("Kelompok dengan rata-rata nilai TERBAIK adalah Kelompok " + kelompokTerbaik + 
                               " dengan rata-rata nilai " + maxRataRata); 
        } else {
            System.out.println("Tidak ada kelompok yang diproses.");
        }
        
        System.out.println("==============================================");

        sc.close();
    }
}