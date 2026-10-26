import java.util.Scanner;

public class KonversiNilai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai (0-100): ");
        double nilai = scanner.nextDouble();

        if (nilai >= 80 && nilai<=100){
            System.out.println("Niali Anda adalah A!");
        }
        else if (nilai >= 70 && nilai <= 79.99){
            System.out.println("Niali Anda adalah B!");
        }
        else if (nilai>=60 && nilai <= 69.99){
            System.out.println("Nilai Anda adalah C!");
        }
        else if (nilai>=50 && nilai <= 59.99){
            System.out.println("Nilai Anda adalah D.");
        }
        else{
            System.out.println("Nilai Anda adalah E.");
        }
    }
}
