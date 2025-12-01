import java.util.Scanner;

public class RekapPenjualanCafe16 {

    public static void inputDataPenjualan(int[][] dataPenjualan, String[] namaMenu, Scanner sc) {
        System.out.println("\n=== INPUT DATA PENJUALAN ===");
        
        for (int i = 0; i < namaMenu.length; i++) {
            System.out.print("Masukkan nama menu ke-" + (i + 1) + ": ");
            if (sc.hasNextLine()) sc.nextLine();
            namaMenu[i] = sc.next();
            
            System.out.println("Input penjualan untuk " + namaMenu[i] + ":");
            for (int j = 0; j < dataPenjualan[0].length; j++) {
                System.out.print("- Hari ke-" + (j + 1) + ": ");
                dataPenjualan[i][j] = sc.nextInt();
            }
            System.out.println();
        }
    }

    public static void tampilkanDataPenjualan(int[][] dataPenjualan, String[] namaMenu) {
        System.out.println("\n=== DATA PENJUALAN ===");
        System.out.print("Menu\t\t");
        
        for (int j = 0; j < dataPenjualan[0].length; j++) {
            System.out.print("H-" + (j + 1) + "\t");
        }
        System.out.println();

        for (int i = 0; i < dataPenjualan.length; i++) {
            System.out.print(namaMenu[i] + "\t\t");
            for (int j = 0; j < dataPenjualan[0].length; j++) {
                System.out.print(dataPenjualan[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void menuTerlaris(int[][] dataPenjualan, String[] namaMenu) {
        System.out.println("\n=== MENU TERLARIS ===");
        
        int maxPenjualan = 0;
        String menuTerlaris = "";

        for (int i = 0; i < dataPenjualan.length; i++) {
            int totalPerMenu = 0;
            for (int j = 0; j < dataPenjualan[0].length; j++) {
                totalPerMenu += dataPenjualan[i][j];
            }
            
            if (totalPerMenu > maxPenjualan) {
                maxPenjualan = totalPerMenu;
                menuTerlaris = namaMenu[i];
            }
        }
        
        System.out.println("Menu terlaris adalah: " + menuTerlaris);
        System.out.println("Dengan total penjualan: " + maxPenjualan);
    }

    public static void rataRataPenjualan(int[][] dataPenjualan, String[] namaMenu) {
        System.out.println("\n=== RATA-RATA PENJUALAN ===");
        
        for (int i = 0; i < dataPenjualan.length; i++) {
            double totalPerMenu = 0;
            for (int j = 0; j < dataPenjualan[0].length; j++) {
                totalPerMenu += dataPenjualan[i][j];
            }
            
            double rataRata = totalPerMenu / dataPenjualan[0].length;
            System.out.println(namaMenu[i] + ": " + rataRata);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("--- PROGRAM REKAP PENJUALAN KAFE ---");
        
        System.out.print("Masukkan jumlah menu: ");
        int jumlahMenu = sc.nextInt();
        
        System.out.print("Masukkan jumlah hari: ");
        int jumlahHari = sc.nextInt();

        int[][] dataPenjualan = new int[jumlahMenu][jumlahHari];
        String[] namaMenu = new String[jumlahMenu];

        inputDataPenjualan(dataPenjualan, namaMenu, sc);

        tampilkanDataPenjualan(dataPenjualan, namaMenu);

        menuTerlaris(dataPenjualan, namaMenu);

        rataRataPenjualan(dataPenjualan, namaMenu);
    }
}