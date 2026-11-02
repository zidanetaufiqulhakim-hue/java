import java.util.Scanner;

public class PengecekanNull {
    public static void main(String arg[]){
        Scanner in = new Scanner(System.in);
        String nama = null;

        if (nama == null){
            System.out.println("Nama tidak boleh kosong");
        }

        System.out.print("Masuan nama pelanggan");
        nama = in.nextLine();

        if(nama==null || nama.isEmpty()){
            System.out.println("Nama tidak boleh kosong");
        }
        else{
            System.out.println("Halo, Selamat datang, " + nama);
        }

    }
}
