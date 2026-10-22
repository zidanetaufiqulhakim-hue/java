/*
If month is 1,2, or 3, season " "dingin"
Else if month is 4, 5. or 6, season = "semi"
Else if month is 7, 8, or 9, season = "panas"
Else if month is 10, 11, or 12, season « "gugur"
If month is divisible by 3 and day => 21
    If season is "dingin", season = "semi"
    Else if season is "semi", season = "panas"
    Else if season is "panas", season = "gugur"
    Else season = "dingin"
*/

import java.util.Scanner;

public class Season{
    public static void main(String args[]){
        int jumlahHari = 0;
        String musim;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai (1-12): ");
        int bulan = scanner.nextInt();

        // 1.Logika penentuan jumlah hari dari bulan yang diinputkan
        if (bulan >= 1 && bulan <= 12){
            if (bulan >=1 && bulan <= 7){
                if (bulan%2 == 1){
                    jumlahHari = 31;
                } 
                else if (bulan == 2){
                    jumlahHari = 28;
                }
                else{jumlahHari = 30;}
            }
            else{
                if (bulan%2 == 0){
                    jumlahHari = 31;
                } 
                else{jumlahHari = 30;}
            }
        }
            else{System.out.println("Angka tidak Valid");}

        // Logika penentuan musim
        if (bulan >= 1 && bulan <= 3){
            musim = "dingin";
        }
        else if (bulan >= 4 && bulan <= 6){
            musim = "semi";
        }
        else if (bulan >=7 && bulan <= 9){
            musim = "panas";
        }
        else{musim = "gugur";}

        // logika penentuan musim jika
        if (bulan%3 == 0 && jumlahHari >= 21){
            if (musim.equals("dingin")){
                musim = "semi";
            }
            else if (musim.equals("semi")){
                musim = "panas";
            }
            else if (musim.equals("panas")){
                musim = "gugur";
            } 
            else{musim = "dingin";}

        }

        // Output
        System.out.println("Sekarang adalah musim " + musim);
    }
}

