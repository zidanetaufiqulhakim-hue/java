public class ContohOperatorLogika{
    public static void main(String[] args){
        int a = 25;
        int b = 13;

        boolean hasilAnd;
        boolean hasilOr;
        boolean hasilNot;

        hasilAnd = (a<b) && (a!=b);
        hasilOr = (a<b) || (a!=b);
        hasilNot = !(hasilAnd);

        System.out.println("Nilai a:" + a + ", Nilai b: " + b);
        System.out.println("Hasil And: " + hasilAnd);
        System.out.println("Hasil Or: " + hasilOr);
        System.out.println("Hasil Not dari hasilAnd: " + hasilNot);

    }
}