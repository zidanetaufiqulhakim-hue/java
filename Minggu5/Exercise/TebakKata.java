import java.util.Scanner;

public class TebakKata{
    public static void main(String args[]){
        String kataBenar = "Python";
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Apa bahasa pemrograman favorit Zidane?");
        String tebakan = scanner.nextLine();

        if (tebakan.equals(kataBenar)){
            System.out.println("BENAR");
        } else{System.out.println("SALAH");}
    }
}