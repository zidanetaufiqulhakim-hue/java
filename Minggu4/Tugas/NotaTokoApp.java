import java.util.Scanner;
/* Aplikasi Nota Toko Bu Diana*
* Developer: Zidane Taufiql Hakim*
* Terakhir diubah: 8 Oktober 2026, pukul 12:36*
* Tujuan aplikasi: Membuat nota pembelian untuk toko buku milik Bu Diana agar process pembelian lebih efisien
* KPI: 1) UI yang mudah dipahami user sehingga user tahu alur aplikasi dan tidak bingung saat menggunakannya
*      2) User tahu harga barang yang dibeli
       3) User tahu total harga yang harus dibayar
       4) User tahu kembalian yang harus diterima
       5) User tahu jumlah barang yang dibeli
       6) Jika uang pembayaran kurang dari total harga, user tahu bahwa uang pembayaran tidak cukup dan harus menjalankan aplikasi lagi (kurang UX friendly)
       7) Operasi aplikasi benar dan tidak ada keliruan dalam perhitungan total harga dan kembalian
       8) Alur kode program mudah dipahami sehingga mudah untuk diubah jika ada perubahan sistem
*/

public class NotaTokoApp {
    public static void main(String[] args) {
        // deklarasi variabel konstanta (harga barang)
        int hargaKertas = 35000; // per rim
        int hargaPulpen = 20000; // per box
        int hargaAmplop = 17000; // per box
        String namaToko = "Toko Miss Diana";

        // deklarasi variabel uang pembayaran
        int uangPembayaran;

        // deklaris Clss Scanner
        Scanner scanner = new Scanner(System.in);

        // Input jumlah barang yang dibeli
        System.out.println("Selamat datang di " + namaToko + "!");
        
        System.out.print("Masukan Nomor Nota: ");
        String nomorNota = scanner.next();

        System.out.println("\nSilakan masukkan jumlah barang yang dibeli:");
        System.out.print("Qty. Kertas (" + hargaKertas + " per rim): ");
        int jumlahKertas = scanner.nextInt();

        System.out.print("Qty. Pulpen (" + hargaPulpen + " per box) : ");
        int jumlahPulpen = scanner.nextInt();

        System.out.print("Qty. Amplop (" + hargaAmplop + " per box): ");
        int jumlahAmplop = scanner.nextInt();

        System.out.println("\n---------------------------------------------------------------------------");

        /*Proses perhitungan total harga*/
        int totalHargaKertas = jumlahKertas * hargaKertas;
        int totalHargaPulpen = jumlahPulpen * hargaPulpen;
        int totalHargaAmplop = jumlahAmplop * hargaAmplop;
        int totalHarga = totalHargaKertas + totalHargaPulpen + totalHargaAmplop;

        // Output nota pembelian
        System.out.println("RINCIAN NOTA PEMBELIAN: " + nomorNota);
        System.out.println("+-----------------------------------------------------------------------------------------------------------+");
        System.out.println("| NO.  | Nama Barang  | Qty  | Harga Satuan  | Total Harga  |");
        System.out.println("+-----------------------------------------------------------------------------------------------------------+");
        System.out.println("|1.    | Kertas       | " + jumlahKertas + "    | " + hargaKertas + "        | " + totalHargaKertas + "       |");
        System.out.println("|2.    | Pulpen       | " + jumlahPulpen + "    | " + hargaPulpen + "        | " + totalHargaPulpen + "       |");
        System.out.println("|3.    | Amplop       | " + jumlahAmplop + "    | " + hargaAmplop + "        | " + totalHargaAmplop + "       |");
        System.out.println("+-----------------------------------------------------------------------------------------------------------+");
        System.out.println("Total: Rp." + totalHarga);

        // Input uang pembayaran
        System.out.print("\nMasukkan jumlah uang pembayaran: Rp.");
        uangPembayaran = scanner.nextInt();

        // process jumlah kembalian
        Object kembalian = (uangPembayaran >= totalHarga) ? uangPembayaran - totalHarga : "Uang pembayaran tidak cukup. Silakan jalankan java NotaTokoApp lagi.";
        
        // Output kembalian
        System.out.println("+-----------------------------------------------------------------------------------------------------------+");
        System.out.println("Kembalian: Rp." + kembalian);
        System.out.println("+-----------------------------------------------------------------------------------------------------------+");
        System.out.println("\nTerima kasih telah berbelanja di " + namaToko + "!");

    }
}