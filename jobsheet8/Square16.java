import java.util.Scanner; //

public class Square16 {
    public static void main(String[] args) { //
        Scanner sc = new Scanner(System.in); //

        System.out.print("Masukkan nilai N = "); //
        int N = sc.nextInt(); //

        // Outer Loop (Perulangan Luar) untuk Baris
        for (int iOuter = 1; iOuter <= N; iOuter++) {
            // Inner Loop (Perulangan Dalam) untuk Kolom (mencetak bintang ke samping)
            for (int i = 1; i <= N; i++) { 
                System.out.print("*"); //
            }
            // Mencetak baris baru setelah satu baris bintang selesai dicetak
            System.out.println(); 
        }

        sc.close();
    }
}