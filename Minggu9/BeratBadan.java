import java.util.Scanner;

public class BeratBadan {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        double inputBeratBadat = 0;

        int jumlahKurus = 0;
        int jumlahIdeal = 0;
        int jumlahGemuk = 0;

        while(inputBeratBadat >= 0){
            System.out.print("Masukan Berat badan anda (kg): ");
            inputBeratBadat = in.nextDouble();

            if(inputBeratBadat >0 && inputBeratBadat <= 50){
                System.out.println("Berat badan anda: " + inputBeratBadat + "kg");
                System.out.println("Kategori: Kurus");
                jumlahKurus++;
            }
            else if(inputBeratBadat >= 50 && inputBeratBadat <= 70){
                System.out.println("Berat badan anda: " + inputBeratBadat + "kg");
                System.out.println("Kategori: Ideal");
                jumlahIdeal++;

                if(inputBeratBadat == 67){
                    System.out.println("SIXXXX SEVENNNNN");
                }
            }
            else if(inputBeratBadat > 70){
                System.out.println("Berat badan anda: " + inputBeratBadat + "kg");
                System.out.println("Kategori: Gemuk");
                jumlahGemuk++;
            }
        }
        System.out.println("----------------------------");
        System.out.println("Jumlah kategori kurus: " + jumlahKurus);
        System.out.println("Jumlah kategori ideal: " + jumlahIdeal);
        System.out.println("Jumlah kategori gemuk: " + jumlahGemuk);

        System.out.println("\nTotal pasien: " + (jumlahGemuk+jumlahIdeal+jumlahKurus));

    }
    
}
