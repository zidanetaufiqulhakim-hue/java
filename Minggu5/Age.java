import java.util.Scanner;

public class Age{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukan umur anda! ");
        int umur = scan.nextInt();

        System.out.println("\nあなたの歳は：" + umur);

        if (umur < 17){
            if (umur < 10){
                System.out.println("Anda masih anak-anak");
            } 
            else{System.out.println("Anda sudah remaja");}

        } 
        else{System.out.println("Anda Sudah dewasa, Ingat umur!");}
    }
}