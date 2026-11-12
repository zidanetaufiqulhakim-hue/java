import java.util.Scanner;

public class CekAngka{
    public static void main(String[] Args){
        java.util.Scanner scan = new Scanner(System.in);
        System.out.print("Masukan Nilai: ");
        int angka = scan.nextInt();

        if (angka == 0){
            System.out.println("Angka adalah 0");
        }
        else if (angka > 0){
            System.out.println("Angka adalah bilangan positif");
        }
        else{
            System.out.println("Angka adalah bilang negatif");
        }
        
    }

}