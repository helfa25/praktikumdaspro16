import java.util.Scanner;

public class NilaiMahasiswa16 {

    public static void isianArray(int[] nilaiMhs, Scanner sc) {
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = sc.nextInt();
        }
    }

    public static void tampilArray(int[] nilaiMhs) {
        System.out.println("\nDaftar Nilai Mahasiswa:");
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiMhs[i]);
        }
    }

    public static int hitTot(int[] nilaiMhs) {
        int total = 0;
        for (int nilai : nilaiMhs) {
            total += nilai;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = sc.nextInt();

        int[] nilaiMhs = new int[n];

        isianArray(nilaiMhs, sc);

        tampilkanArray(nilaiMhs);

        int totalNilai = hitTot(nilaiMhs);
        System.out.println("\nTotal nilai seluruh mahasiswa: " + totalNilai);
    }
}