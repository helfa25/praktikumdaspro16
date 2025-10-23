package jobsheet5;

import java.util.Scanner;

public class ifCetakKRS16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

 System.out.println("---CETAK KRS SIAKAD---");
        System.out.print("Apakah UKT sudah lunas (True/False): ");
        Boolean uktLunas = sc.nextBoolean();

        if (uktLunas){
            System.out.println("Pembayaran UKT terverifikasi");
            System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");

            System.out.print("Masukkan nilai penilaian (0-100): ");
            int nilai = sc.nextInt();

            if (nilai > 100) {
                System.out.println("Error: Nilai penilaian tidak boleh lebih dari 100");
            } else {
                System.out.println("Penilaian berhasil. Nilai: " + nilai);
            }
        }else{
            System.out.println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu");
        }
        sc.close();
        

    }
}