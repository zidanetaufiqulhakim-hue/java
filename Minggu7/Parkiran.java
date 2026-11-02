import java.util.Scanner;

import javax.imageio.plugins.tiff.FaxTIFFTagSet;

public class Parkiran {
    public static void main(String args[]){
        String inputKendaraan = null;
        Scanner in = new Scanner(System.in);
        Boolean isValid = true;

        if(inputKendaraan == null){
            System.out.println("Input tidak boleh kosong");
        }

        System.out.println("Mobil: Rp.10,000");
        System.out.println("Motor: Rp.5,000");
        System.out.println("Truk Rp.15,000");
        System.out.print("\nSelamat datang, masukan jenis kendaraan anda:");
        inputKendaraan = in.nextLine();

        //cek kevalidan input
        if(inputKendaraan.equals("") || inputKendaraan == null){
            isValid = false;
        }

        if(isValid){
            if(inputKendaraan.equals( "Mobil")){
                System.out.println("Tarif " + inputKendaraan + ":" + "Rp.10,000");
            }
            else if (inputKendaraan.equals("Motor")){
                System.out.println("Tarif " + inputKendaraan + ":" + "Rp.5,000");
            }
            else if (inputKendaraan.equals("Truk")){
                System.out.println("Tarif " + inputKendaraan + ":" + "Rp.15,000");
            }
        }
        else{
            System.out.println("Jenis Kendaraan tidak valid");
        }
    }
}
