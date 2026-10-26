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
public class JumlahHari{ 
    public static void main(String args[]){
        int jumlahHari = 0;
        String namaBulan;
        Boolean isValid = true;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama bulan (Januari - Desember):");
        namaBulan = scanner.nextLine();

        switch(namaBulan){
            case "Januari": case "Maret": case "Mei": case "Juli": case "Agustus": case "Oktober": case "Desember":
                jumlahHari = 31;
                break;
            case "April": case "Juni": case "September": case "November":
                jumlahHari = 30;
                break;
            case "Februari":
                jumlahHari = 28;
                break;
            default:
                isValid = false;
                System.out.println("Input tidak valid: masukan nama bulan dengan benar");
                break;

        }

        if(isValid == true){System.out.println("bulan " + namaBulan + " ada " + jumlahHari + " hari.");}

        }
    }