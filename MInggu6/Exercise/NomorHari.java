import java.util.Scanner;

public class NomorHari{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan Angka 1-7 untuk menetukan hari:  ");
        int nomorHari = scanner.nextInt();

        switch (nomorHari) {
            case 1:
                System.out.println("Senin");
                break;
            case 2:
                System.out.println("Selasa");
                break;
            case 3:
                System.out.println("Rabu");
                break;
            case 4:
                System.out.println("Kamis");
                break;
            case 5:
                System.out.println("Jumat");
                break;
            case 6:
                System.out.println("Sabtu");
                break;
            case 7:
                System.out.println("Minggu");
                break;
        
            default:
                System.out.println("Input Invalid: hanya dapat menerima angka 1-7.");
                break;
        }

    }
}