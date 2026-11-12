import java.util.Scanner;

public class NamaHari{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai (1-7): ");
        int angka = scanner.nextInt();

        if (angka >= 1 && angka <= 7){ //nested if dipakai untuk eror handling
            if(angka == 1){
                System.out.println("Senin");
            }
            else if (angka == 2){
                System.out.println("Selasa");
            }
            else if (angka == 3){
                System.out.println("Rabu");
            }
            else if (angka == 4){
                System.out.println("kamis");
            }
            else if (angka == 5){
                System.out.println("Jumat");
            }
            else if (angka == 6){
                System.out.println("Sabtu");
            }
            else if (angka == 7){
                System.out.println("Minggu");
            }
        } else{System.out.println("Angka tidak Valid; ulangi Prgram!");}
    }
}