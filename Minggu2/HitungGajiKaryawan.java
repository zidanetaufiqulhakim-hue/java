public class HitungGajiKaryawan{
    public static void main(String[] args){
        //storage input
        int jumlahHariKerja;
        int jumlahJamLembur;

        //storage nilai tetap
        String namaKaryawan = "Black Widow";
        String namaPerusahaan = "GameStudio";
        int gajiPokok = 300000;
        int uangLembur = 50000;

        // storage hasil
        int totalGaji;

        // input
        jumlahHariKerja = 20;
        jumlahJamLembur = 16;

        // process
        totalGaji = (jumlahHariKerja * gajiPokok) + (jumlahJamLembur * uangLembur);

        // output
        System.out.println("============ Perhitungan Gaji Karyawan PT. " + namaPerusahaan + " ==============");
        System.out.println("\n");
        System.out.println("Nama Karyawan: " + namaKaryawan);
        System.out.println("Nama Perusahaan: " + namaPerusahaan);
        
        System.out.println("---------------------------------------------------------");
        System.out.println("Jumlah Hari Kerja: " + jumlahHariKerja);
        System.out.println("Jumlah Jam Lembur: " + jumlahJamLembur);

        System.out.println("---------------------------------------------------------");
        System.out.println("Gaji Pokok per Hari: " + gajiPokok);
        System.out.println("Uang Lembur per Jam: " + uangLembur);

        System.out.println("---------------------------------------------------------");
        System.out.println("Total Gaji Bulan Oktober: " + totalGaji);
        
        System.out.println("\n");
        System.out.println("=====================================================");
        System.out.println("Terima kasih atas dedikasi dan kerja kerasnya, Ibu/Bapak " + namaKaryawan + "!");
    }
}
//* OUTPUT:============ Perhitungan Gaji Karyawan PT. GameStudio ==============


//Nama Karyawan: Black Widow
//Nama Perusahaan: GameStudio
//---------------------------------------------------------
//Jumlah Hari Kerja: 20
//Jumlah Jam Lembur: 16
//---------------------------------------------------------
//Gaji Pokok per Hari: 300000
//Uang Lembur per Jam: 50000
//---------------------------------------------------------
//Total Gaji Bulan Oktober: 6800000


//=====================================================
//Terima kasih atas dedikasi dan kerja kerasnya, Ibu/Bapak Black Widow!
