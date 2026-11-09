import java.util.Scanner;

public class TehManis{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        boolean sudahManis = false;
        int gula = 0;
        String jawaban;

        while(sudahManis == false){
            System.out.print("Apakah tehnya sudah manis??? (ya/tidak)");
            jawaban = in.nextLine();

            if(jawaban.equals("ya")){
                sudahManis = true;
            }
            else{
                gula++;
                System.out.println("Menambahkan gula...");
                System.out.println("Jumlah gula: " + gula + " sendok");
            }
        }

        System.out.println("\nEs teh sudah jadi!!");
        System.out.println("total gula yang ditambahkan");
        in.close();
    }
}