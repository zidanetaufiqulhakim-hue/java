import java.util.Scanner;

public class BacaMultipleInput{ 
    public static void main(String[] args){

        //deklarasi variabel Scanner
        Scanner scanbner = new Scanner(System.in);

        //scanner.nextline berfungsi untuk membaca input sting yg lebih dari satu line
        System.out.print("Silakan Input nama anda: ");
        String nama = scanbner.nextLine();
        System.out.print("Nama Anda adalah: "  + nama);

        //scanner.nextInt berfungsi untuk membaca input integer
        System.out.print("\nSilakan Input nilai x: ");
        int x = scanbner.nextInt();
        System.out.print("Nilai x adalah: " + x);

        //scanner.nextDouble berfungsi untuk membaca input double
        System.out.print("\nSilakan Input nilai y: ");
        double y = scanbner.nextDouble();
        System.out.print("Nilai y adalah: " + y);

        //tampilan output
        System.out.println("\nNama Anda adalah: " + nama);
        System.out.println("Nilai x adalah: " + x);
        System.out.println("Nilai y adalah: " + y);

    }
}