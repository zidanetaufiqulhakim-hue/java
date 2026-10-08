import java.util.Scanner;
/* Program menghitung luas segitiga
* Dibuat oleh: Zidane Taufiqul Hakim
* Terakhir diubah: 8 Oktober 2026
* System meminta user untuk menginput tinggi dan alas segitiga lalu menghitung luasnya kemudian menampilkan hasilnya*/

public class LuasSegitiga {
    public static void main(String[] args){
        /* Deklarasi variabel Scanner */
        Scanner in = new Scanner(System.in);

        /*Storage */
        double tinggi = 0;
        double alas = 0;
        double luas = 0;

        /*input*/
        System.out.print("Masukkan tinggi segitiga: ");
        tinggi = in.nextDouble(); // -> input tinggi segitiga
        System.out.print("Masukkan alas segitiga: ");
        alas = in.nextDouble(); // -> input alas segitiga

        /*process*/
        luas = 0.5 * alas * tinggi;

        /*output*/
        System.out.println("Luas Segitaga = " + luas);
    }
}
//OutputLuas Segitaga = 212.5