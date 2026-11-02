import java.util.Scanner;

public class RumahMakan {
    public static void main(String args[]){
        boolean isDapetBonus = false;
        // list harga makanan
        int hargaAyamBakar = 16000;
        int hargaAyamGoreng = 15000;
        int hargaEsteh = 3000;

        //Print Daftar harga:
        System.out.println("---Daftar Harga---");
        System.out.println("a) Ayam Bakar: Rp 16.000");
        System.out.println("b) Ayam Goreng: Rp 15.000");
        System.out.println("c) Es Teh: Rp 3.000\n");

        //varibel input users
        int kuantitas = 0;
        String pesanan = null;

        //variabel output
        int totalPembayaran = 0;
        String bonus = null;

        /*  +--------Input Data User----------+  */

        //Input nama pesanan
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan nama pesanan anda (a, b, c): ");
        pesanan = in.nextLine();

        //Input kuantitas pesanan
        System.out.print("Qty: ");
        kuantitas = in.nextInt();
        if(kuantitas == 0){
            System.out.println("Kuantitas tidak boleh kosong");
        }

        /* Proses Hitung Total Jumlah Pembayran */
            // hitung harga pesanan dikali jumalh pesanan
            switch (pesanan) {
                case "a":
                    totalPembayaran = hargaAyamBakar * kuantitas;
                    if(kuantitas >=3){
                        isDapetBonus = true;
                        bonus = "Gratis es teh 1";
                        }
                    break;

                case "b":
                    totalPembayaran = hargaAyamGoreng * kuantitas;
                    if(kuantitas >= 5){
                        isDapetBonus = true;
                        bonus = "Gratis Jus Melon 1";
                    }
                    break;

                case "c":
                    totalPembayaran = hargaEsteh * kuantitas;
                    break;

                default:
                    System.out.println("Pesanan tidak dikenali atau kosong");
                    break;
            }

        // ---------Print Nota---------+
        System.out.println("Total Bayar: " + "Rp."+ totalPembayaran);
        if(isDapetBonus){
            System.out.println("Bonus: " + bonus);
        }
    }
}

