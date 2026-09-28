public class Hello { //class -> program yang dibuat
    //sedang membuat program bernama Hello

    public static void main (String[] args) { 
        //natted main -> methode: (adalah sebuah fungsi yang akan dijalankan pertama kali ketika program dijalankan)
        System.out.println("Hello, World!");
        System.out.println("Zidane Taufiqul Hakim");

        //tipe data:
        //*
        // int: bilangan bulat no koma ->
        // double: bilangan desimal -> double height = 5.9;
        // char: satu karakter pakai petik satu ('') -> char grade = 'A';
        // String: kumpulan karakter pakai petik dua ("") -> String name = "John";
        // Bolean: true/false -> boolean isStudent = true;
        //  */

        int x = 101; //bilangan bulat
        double beratBadan = 60.2; //bilangan desimal
        char jenisKelamin = 'L'; //satu karakter
        String nama = "Zidane Hakim"; //kumpulan karakter
        boolean sudahMandi = true; //true/false

        System.out.println("Nilai x adalah " + x);
        System.out.println("Berat badan saya adalah " + beratBadan);
        System.out.println("Jenis kelamin saya adalah " + jenisKelamin);
        System.out.println("Nama saya adalah " + nama);
        System.out.println("Apakah saya sudah mandi? " + sudahMandi);

    }
}
