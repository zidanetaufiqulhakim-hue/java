//Latihan 4: bikin kalkulator
import java.util.Scanner;

public class Kalkulator{
    public static void main(String args[]){
        int x = 0;
        int y = 0;
        int hasil = 0;
        String operator = "";
        Boolean isValid = true;

        Scanner scan = new Scanner(System.in);

        System.out.print("Masukan Operator: ");
        operator = scan.nextLine();

        System.out.print("Masukan angka pertama: ");
        x = scan.nextInt();

        System.out.print("Masukan angka kedua: ");
        y = scan.nextInt();


        if(x!=0 || y != 0){
            switch(operator){
                case "+":
                    hasil = x + y;
                    break;
                case "-":
                    hasil = x - y;
                    break;
                case "*":
                    hasil = x * y;
                    break;
                case "/":
                    hasil = x / y;
                    break;
                default:
                    isValid = false;
                    System.out.println("Input tidak valid");
                    break;
            }

            if(isValid){
                System.out.println("\nHasil: " + x + " " + operator + " " + y + " = " + hasil);
            }
        }
    }
}