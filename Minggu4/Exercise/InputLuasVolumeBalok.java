import java.util.Scanner;

public class InputLuasVolumeBalok{
    // Tugas 1: Menghitung luas dan volume balok
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    //storage hasil
    double luas;
    double volume;

    //storage input panjang
    System.out.print("Masukkan panjang balok:");
    double panjang =  scanner.nextDouble();

    //storage input lebar
    System.out.println("Masukan lebar balok");
    double lebar =  scanner.nextDouble();

    //storage input tinggigi
    System.out.print("Masukkan tinggi balok: ");
    double tinggi =  scanner.nextDouble();

    //process
    luas = panjang * lebar * tinggi;
    volume = 2*(panjang * lebar) + 2 * (panjang * tinggi) + 2 * (tinggi * lebar);

    //output
    System.out.println("Luas Balok: " + luas);
    System.out.println("Volume Balok: " + volume);
    }
}