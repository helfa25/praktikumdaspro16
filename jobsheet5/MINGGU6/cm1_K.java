import java.util.Scanner;

public class cm1_Khohar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama, nim;
        double utsAlgo, uasAlgo, tugasAlgo;
        double utsStruk, uasStruk, tugasStruk;
        double nilaiAkhirAlgo, nilaiAkhirStruk, rataRata;
        String nilaiHurufAlgo, nilaiHurufStruk;
        String statusAlgo, statusStruk, statusSemester;

        System.out.println("===== INPUT DATA MAHASISWA =====");
        System.out.print("Nama : ");
        nama = input.nextLine();
        System.out.print("NIM  : ");
        nim = input.nextLine();

        System.out.println("\n--- Mata Kuliah 1: Algoritma dan Pemrograman ---");
        System.out.print("Nilai UTS   : ");
        utsAlgo = input.nextDouble();
        System.out.print("Nilai UAS   : ");
        uasAlgo = input.nextDouble();
        System.out.print("Nilai Tugas : ");
        tugasAlgo = input.nextDouble();

        System.out.println("\n--- Mata Kuliah 2: Struktur Data ---");
        System.out.print("Nilai UTS   : ");
        utsStruk = input.nextDouble();
        System.out.print("Nilai UAS   : ");
        uasStruk = input.nextDouble();
        System.out.print("Nilai Tugas : ");
        tugasStruk = input.nextDouble();

        // Hitung nilai akhir
        nilaiAkhirAlgo = (0.3 * utsAlgo) + (0.4 * uasAlgo) + (0.3 * tugasAlgo);
        nilaiAkhirStruk = (0.3 * utsStruk) + (0.4 * uasStruk) + (0.3 * tugasStruk);

        // Konversi nilai ke huruf (pakai nested if)
        nilaiHurufAlgo = konversiNilaiHuruf(nilaiAkhirAlgo);
        nilaiHurufStruk = konversiNilaiHuruf(nilaiAkhirStruk);

        // Status per mata kuliah (nested if)
        if (nilaiAkhirAlgo >= 60) {
            statusAlgo = "LULUS";
        } else {
            statusAlgo = "TIDAK LULUS";
        }

        if (nilaiAkhirStruk >= 60) {
            statusStruk = "LULUS";
        } else {
            statusStruk = "TIDAK LULUS";
        }

        // Hitung rata-rata dan status semester (nested if)
        rataRata = (nilaiAkhirAlgo + nilaiAkhirStruk) / 2;

        if (statusAlgo.equals("LULUS")) {
            if (statusStruk.equals("LULUS")) {
                if (rataRata >= 70) {
                    statusSemester = "LULUS (Rata-rata >= 70)";
                } else {
                    statusSemester = "TIDAK LULUS (Rata-rata < 70)";
                }
            } else {
                statusSemester = "TIDAK LULUS (Rata-rata < 70)";
            }
        } else {
            statusSemester = "TIDAK LULUS (Rata-rata < 70)";
        }

        // Output hasil akhir
        System.out.println("\n==================== HASIL PENILAIAN AKADEMIK ====================");
        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + nim);
        System.out.println();
        System.out.println("Mata Kuliah\t\tUTS\tUAS\tTugas\tNilai Akhir\tNilai Huruf\tStatus");
        System.out.println("-----------------------------------------------------------------------");
        System.out.printf("Algoritma Pemrograman\t%.0f\t%.0f\t%.0f\t%.2f\t\t%s\t\t%s\n",
                utsAlgo, uasAlgo, tugasAlgo, nilaiAkhirAlgo, nilaiHurufAlgo, statusAlgo);
        System.out.printf("Struktur Data\t\t%.0f\t%.0f\t%.0f\t%.2f\t\t%s\t\t%s\n",
                utsStruk, uasStruk, tugasStruk, nilaiAkhirStruk, nilaiHurufStruk, statusStruk);
        System.out.println("-----------------------------------------------------------------------");
        System.out.printf("Rata-rata Nilai Akhir: %.2f\n", rataRata);
        System.out.println("Status Semester : " + statusSemester);
    }

    // Konversi nilai ke huruf pakai nested if
    static String konversiNilaiHuruf(double nilai) {
        String huruf = "";

        if (nilai > 80) {
            huruf = "A";
        } else {
            if (nilai > 73) {
                huruf = "B+";
            } else {
                if (nilai > 65) {
                    huruf = "B";
                } else {
                    if (nilai > 60) {
                        huruf = "C+";
                    } else {
                        if (nilai > 50) {
                            huruf = "C";
                        } else {
                            if (nilai > 39) {
                                huruf = "D";
                            } else {
                                huruf = "E";
                            }
                        }
                    }
                }
            }
        }

        return huruf;
    }
}
