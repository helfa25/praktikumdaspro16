import java.util.Scanner;

public class Triangle16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();
        
        int i = 1; // Mulai dari baris 1 (atau i=0 jika Anda ingin mencetak n+1 baris)
        
        // Outer Loop (i) untuk Baris
        while (i <= n) {
            int j = 0;
            
            // Inner Loop (j) untuk Kolom/Bintang
            // Perulangan berjalan sebanyak i kali (j < i)
            while (j < i) {
                System.out.print("*");
                j++;
            }
            
            // PENTING: Mencetak baris baru
            System.out.println(); 
            i++;
        }
        sc.close();
    }
}