import java.util.Scanner;

public class InputAngka {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan nilai awal: ");
        int nilaiAwal = scan.nextInt();

        System.out.print("Masukan nilai Akhir: ");
        int nilaiAkhir = scan.nextInt();

        while(nilaiAwal <= nilaiAkhir){
            System.out.println(nilaiAwal);
            nilaiAwal++;
        }
    }
    
}
