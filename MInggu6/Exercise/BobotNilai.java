//Latihan 2: membuat program menghitung bobot
import java.util.Scanner;

public class BobotNilai{
    public static void main(String args[]){
        double bobotNilai = 0;
        Boolean isValid = true;

        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan huruf nilai anda: ");
        String hurufNilai = scan.next();

        switch(hurufNilai){
            case("A"):
                bobotNilai = 4.00;
                break;
            case("A-"):
                bobotNilai = 3.67;
                break;
            case("B+"):
                bobotNilai = 3.33;
                break;
            case("B"):
                bobotNilai = 3.00;
                break;
            case("B-"):
                bobotNilai = 2.50;
                break;
            case("C"):
                bobotNilai = 2.00;
                break;
            case("D"):
                bobotNilai = 1.00;
                break;
            case("E"):
                bobotNilai = 0.00;
                break;
            default:
                isValid = false;
                System.out.println("Input tidak valid. Mohon masaukan huruf yang valid (A-E)");
        }
    
        if(isValid == true){
            System.out.println("Bobot nilai: " + bobotNilai);

    }
}
}