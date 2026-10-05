public class Exercise2{
    public static void main(String[] args){
        // storage
        double a = 10.2;
        double b = 3.6;

        //process
        double hasilTambah = a + b;
        double hasilPengurangan = a - b;
        double hasilPembagian = a / b;
        double hasilPerkalian = a*b;
        double hasilModulus = a%b;

        //Output
        System.out.println("a + b = " + hasilTambah);
        System.out.println("a - b = " + hasilPengurangan);
        System.out.println("a / b = " + hasilPembagian);
        System.out.println("a * b = " + hasilPerkalian);
        System.out.println("a % b = " + hasilModulus);

    }
}

//*
//OUTPUT
// a + b = 13.799999999999999
//a - b = 6.6
//a / b = 2.833333333333333
//a * b = 36.72
//a % b = 2.999999999999999*/