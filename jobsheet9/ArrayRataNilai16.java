import java.util.Scanner;

public class ArrayRataNilai16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa : ");
        int jmlMhs = sc.nextInt(); 

        int[] nilaiMhs = new int[jmlMhs];
        
        double totalLulus = 0;
        int countLulus = 0;
        double totalTdkLulus = 0;
        int countTdkLulus = 0;
        double rata2Lulus, rata2TdkLulus;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = sc.nextInt();

            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                countLulus++;
            } else {
                totalTdkLulus += nilaiMhs[i];
                countTdkLulus++;
            }
        }
        
        rata2Lulus = (countLulus > 0) ? (totalLulus / countLulus) : 0.0;
        rata2TdkLulus = (countTdkLulus > 0) ? (totalTdkLulus / countTdkLulus) : 0.0;

        System.out.println("Rata-rata nilai lulus = " + rata2Lulus); // [cite: 168]
        System.out.println("Rata-rata nilai tidak lulus = " + rata2TdkLulus); // [cite: 169]

        sc.close();
    }
}