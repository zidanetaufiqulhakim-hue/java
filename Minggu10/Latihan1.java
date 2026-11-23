import java.util.Scanner;

public class Latihan1 {
    public static void main(String args[]){
        int[] angka = new int[10];

        // 1) Meminta input user untuk menginput 10 angka
        Scanner in = new Scanner(System.in);
        for(int index = 0; index < angka.length; index++){
            System.out.print("Masukan angka untuk index ke-" + index + " :");
            angka[index] = in.nextInt();
        }

        // menanmpilkan angka yang sudah diinput
        System.out.println("Index | Value");        System.out.println("--------------");
        for(int index = 0; index < angka.length; index++){
            System.out.println(index + "     |      " + angka[index]);
        }
    }
}
