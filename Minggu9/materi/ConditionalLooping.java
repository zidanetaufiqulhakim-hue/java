/*  CARA 1
import java.util.Scanner;

public class ConditionalLooping {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int nilai;

        System.out.print("Mauskan nilai (-1 untuk berhenti): ");
        nilai = scan.nextInt();

        while(nilai != -1){
            System.out.println("Nilai Mahasisa: " + nilai);
            System.out.print("Mauskan nilai (-1 untuk berhenti): ");
            nilai = scan.nextInt();
        }

        System.out.println("Program Selesai");
        scan.close();
    }
}
*/

import java.util.Scanner;

public class ConditionalLooping { // Cara kedua
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int nilai;
        boolean stop = false;

        System.out.print("Mauskan nilai (-1 untuk berhenti): ");
        nilai = scan.nextInt();

        while(stop == false){
            System.out.print("Mauskan nilai (-1 untuk berhenti): ");
            nilai = scan.nextInt();

            if(nilai == -1){
                stop = true;
            } else{System.out.println("Nilai Mahasisa: " + nilai);}
        }

        System.out.println("Program Selesai");
        scan.close();
    }
}