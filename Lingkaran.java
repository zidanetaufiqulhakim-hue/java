public class Lingkaran {
    public static void main(String[] args){
        //Storage
        double pi = 0;
        double jariJari = 0;
        double luas = 0;
        double keliling = 0;

        //input
        pi = 3.1415926535897932384;
        jariJari = 32;

        //Process
        luas = pi * jariJari * jariJari;
        keliling = 2 * pi * jariJari;

        //Output
        System.out.println("Luas Lingkaran = " + luas);
        System.out.println("Keliling Lingkaran = " + keliling);
    }
}
