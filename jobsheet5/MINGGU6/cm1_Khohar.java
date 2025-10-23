import java.util.Scanner;

public class cm1_Khohar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//tambahkan input memasukan nilai mata kuliah ketiga (matematika dengan nilai kuis,uts,uas)
//hitung rata rata dengan nilai bobot sama 
//lakukakan pengecekan kondisi untuk mengetahui nilai rata-rata  manna yang terbesar dari ketiga mata kuliah tersebut
        String nama, nim;
        double utsAlgo, uasAlgo, tugasAlgo;
        double utsStruk, uasStruk, tugasStruk;
        double kuisMat, utsMat, uasMat; // Nilai untuk Matematika
        double nilaiAkhirAlgo, nilaiAkhirStruk, nilaiAkhirMat, rataRata;
        String nilaiHurufAlgo, nilaiHurufStruk, nilaiHurufMat;
        String statusAlgo, statusStruk, statusMat, statusSemester;

        // Input Data Mahasiswa
        System.out.println("===== INPUT DATA MAHASISWA =====");
        System.out.print("Nama : ");
        nama = input.nextLine();
        System.out.print("Nilai Tugas : ");
        tugasStruk = input.nextDouble();

        // Input untuk mata kuliah ketiga (Matematika)
        System.out.println("\n--- Mata Kuliah 3: Matematika ---");
        System.out.print("Nilai Kuis  : ");
        kuisMat = input.nextDouble();
        System.out.print("Nilai UTS   : ");
        utsMat = input.nextDouble();
        System.out.print("Nilai UAS   : ");
        uasMat = input.nextDouble();

        // Hitung nilai akhir
        // Bobot Algoritma & Struktur Data: UTS 30%, UAS 40%, Tugas 30%
        nilaiAkhirAlgo = (0.3 * utsAlgo) + (0.4 * uasAlgo) + (0.3 * tugasAlgo);
        nilaiAkhirStruk = (0.3 * utsStruk) + (0.4 * uasStruk) + (0.3 * tugasStruk);
        // Bobot Matematika: Kuis, UTS, UAS dibagi rata (bobot sama)
        nilaiAkhirMat = (kuisMat + utsMat + uasMat) / 3;

        // Konversi nilai ke huruf (pakai nested if)
        nilaiHurufAlgo = konversiNilaiHuruf(nilaiAkhirAlgo);
        nilaiHurufStruk = konversiNilaiHuruf(nilaiAkhirStruk);
        nilaiHurufMat = konversiNilaiHuruf(nilaiAkhirMat);
        
        // Status per mata kuliah (nested if)
        if (nilaiAkhirAlgo >= 60) {
            statusAlgo = "LULUS";
            statusStruk = "TIDAK LULUS";
        }

        if (nilaiAkhirMat >= 60) {
            statusMat = "LULUS";
        } else {
            statusMat = "TIDAK LULUS";
        }

        // Hitung rata-rata dan status semester
        rataRata = (nilaiAkhirAlgo + nilaiAkhirStruk + nilaiAkhirMat) / 3;

        // Status semester: Lulus jika semua mata kuliah lulus DAN rata-rata >= 70
        if (statusAlgo.equals("LULUS") && statusStruk.equals("LULUS") && statusMat.equals("LULUS") && rataRata >= 70) {
            statusSemester = "LULUS SEMESTER";
        } else {
            statusSemester = "TIDAK LULUS SEMESTER";
        }

        // Output hasil akhir
        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + nim);
        System.out.println();
        System.out.println("Mata Kuliah\t\tNilai 1\tNilai 2\tNilai 3\tNilai Akhir\tNilai Huruf\tStatus");
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.printf("Algoritma Pemrograman\t%.0f\t%.0f\t%.0f\t%.2f\t\t%s\t\t%s\n",
                utsAlgo, uasAlgo, tugasAlgo, nilaiAkhirAlgo, nilaiHurufAlgo, statusAlgo);
        System.out.printf("Struktur Data\t\t%.0f\t%.0f\t%.0f\t%.2f\t\t%s\t\t%s\n",
                utsStruk, uasStruk, tugasStruk, nilaiAkhirStruk, nilaiHurufStruk, statusStruk);
        System.out.printf("Matematika\t\t%.0f\t%.0f\t%.0f\t%.2f\t\t%s\t\t%s\n",
                kuisMat, utsMat, uasMat, nilaiAkhirMat, nilaiHurufMat, statusMat);
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.printf("Rata-rata Nilai Akhir: %.2f\n", rataRata);
        System.out.println("Status Semester : " + statusSemester);

        // Pengecekan nilai akhir tertinggi
        System.out.println("\n--- Analisis Nilai Tertinggi ---");
        if (nilaiAkhirAlgo > nilaiAkhirStruk && nilaiAkhirAlgo > nilaiAkhirMat) {
            System.out.printf("Nilai tertinggi diraih oleh mata kuliah Algoritma dan Pemrograman: %.2f\n", nilaiAkhirAlgo);
        } else if (nilaiAkhirStruk > nilaiAkhirAlgo && nilaiAkhirStruk > nilaiAkhirMat) {
            System.out.printf("Nilai tertinggi diraih oleh mata kuliah Struktur Data: %.2f\n", nilaiAkhirStruk);
        } else if (nilaiAkhirMat > nilaiAkhirAlgo && nilaiAkhirMat > nilaiAkhirStruk) {
            System.out.printf("Nilai tertinggi diraih oleh mata kuliah Matematika: %.2f\n", nilaiAkhirMat);
        } else {
            System.out.println("Terdapat beberapa mata kuliah dengan nilai tertinggi yang sama.");
        }
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
