
import java.util.Scanner;

public class InputTonyStark{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //storage nilai tetap
        double bobotAssessment = 0.3;
        double bobotUas = 0.5;
        double bobotTugas = 0.2;

        // storage hasil
        double nilaiAkhir;
        String isLulus;

        //storage input
        System.out.print("Masukkan nama mahasiswa: ");
        String namaMahasiswa = scanner.nextLine();

        System.out.print("Masukkan nilai assessment: ");
        int nilaiAssessment = scanner.nextInt();

        System.out.print("Masukkan nilai uas: ");
        int nilaiUas = scanner.nextInt();

        System.out.print("Masukkan nilai tugas: ");
        int nilaiTugas = scanner.nextInt();

        // process
        nilaiAkhir = (nilaiAssessment * bobotAssessment) + (nilaiUas * bobotUas) + (nilaiTugas * bobotTugas);
        isLulus = (nilaiAkhir >= 60) ? "LULUS" : "TIDAK LULUS";

        //ouput
        System.out.println("============ Perhitungan Nilai Mahasiswa ==============");
        System.out.println("Nama Mahasiswa: " + namaMahasiswa);
        System.out.println("Nilai Assessment: " + nilaiAssessment);
        System.out.println("Nilai UAS: " + nilaiUas);
        System.out.println("Nilai Tugas: " + nilaiTugas);

        System.out.println("---------------------------------------------------------");
        System.out.println("Nilai Akhir: " + nilaiAkhir );
        System.out.println("Status: " + isLulus);
        System.out.println("Semangat belajar dan terus tingkatkan prestasimu!");
        System.out.println("=====================================================");
    }
}

//* OUTPUT:
//============ Perhitungan Nilai Mahasiswa ==============
//Nama Mahasiswa: Tony Stark
//Nilai Assessment: 76
//Nilai UAS: 85
//Nilai Tugas: 65
//---------------------------------------------------------
//Nilai Akhir: 78.3
//Status: LULUS
//Semangat belajar dan terus tingkatkan prestasimu!
//=====================================================