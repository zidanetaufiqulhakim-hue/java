import java.util.Scanner;
/*
• Januari: 31 hari
• Februari: 28 hari (atau 29 hari pada tahun kabisat)
• Maret: 31 hari
• April: 30 hari
• Mei: 31 hari
• Juni: 30 hari
• Juli: 31 hari
• Agustus: 31 hari
• September: 30 hari
• Oktober: 31 hari
• November: 30 hari
• Desember: 31 hari
 */
public class Days{
    public static void main(String args[]){
        int jumlahHari;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai (1-12): ");
        int angka = scanner.nextInt();

        if (angka >= 1 && angka <= 12){
            if (angka >=1 && angka <= 7){
                if (angka%2 == 1){
                    System.out.println("31 hari");
                } 
                else if (angka == 2){
                    System.out.println("28 hari");
                }
                else{System.out.println("30 hari");}
            }
            else{
                if (angka%2 == 0){
                    System.out.println("31 hari");
                } 
                else{System.out.println("30 hari");}
            }
            }
            else{System.out.println("Angka tidak Valid");}

        }
    }