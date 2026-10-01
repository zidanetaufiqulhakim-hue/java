public class Balok{
    public static void main(String[] args){
          //storage hasil
    int luas;
    int volume;

    //storage input
    int panjang;
    int lebar;
    int tinggi;

    //input
    panjang = 10;
    lebar = 5;
    tinggi = 4;

    //process
    luas = panjang * lebar * tinggi;
    volume = 2*(panjang * lebar) + 2 * (panjang * tinggi) + 2 * (tinggi * lebar);

    //output
    System.out.println("Luas Balok: " + luas);
    System.out.println("Volume Balok: " + volume);
    }
}