public class TonyStark{
    public static void main(String[] args){
        //storage input
        int nilaiAssessment;
        int nilaiUas;
        int nilaiTugas;

        //storage nilai tetap
        String namaMahasiswa = "Tony Stark";
        double bobotAssessment = 0.3;
        double bobotUas = 0.5;
        double bobotTugas = 0.2;

        // storage hasil
        double nilaiAkhir;
        String isLulus;

        // input
        nilaiAssessment = 76;
        nilaiUas = 85;
        nilaiTugas = 65;

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
// ============ Perhitungan Nilai Mahasiswa ==============
//Nama Mahasiswa: Tony Stark
//Nilai Assessment: 76
//Nilai UAS: 85
//Nilai Tugas: 65
//---------------------------------------------------------
//Nilai Akhir: 78.3
//Semangat belajar dan terus tingkatkan prestasimu!
//===================================================== *//