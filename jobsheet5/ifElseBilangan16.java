import java.util.Scanner;

public class ifElseBilangan16 {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan angka yang akan dicek: ");
    int angka = sc.nextInt();
    
    if (angka %2 ==0){
        System.out.println("Angka tersebut genap");
    }else{
        System.out.println("Angka tersebut ganjil");
        sc.close();
    }
    }
 }   
