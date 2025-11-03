import java.util.Scanner; //

public class Star16 {
    public static void main(String[] args) { //
        Scanner sc = new Scanner(System.in); //

        System.out.print("Masukkan nilai n = "); //
        int n = sc.nextInt(); //

        // Perulangan untuk mencetak '*' sebanyak n kali
        for (int i = 1; i <= n; i++) {
            System.out.print("*"); //
        }
        // Tambahkan baris baru agar output tidak bercampur dengan pesan selanjutnya
        System.out.println();
        
        sc.close();
    }
}