import java.util.Scanner;

public class TebakKata {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String jawabanBenar = "kucing gak wrong";
        String jawaban;
        Boolean benar = false;
        int sisaKesampatan = 3;

        System.out.println("Kucing kucing apa yang ga pernah salah?");
        while (benar != true) {
            System.out.print("\nMasukan jawaban: ");
            jawaban = in.nextLine();
            
            if(jawaban.equals(jawabanBenar)){
                System.out.println("Jawaban Anda Benar!!! BUhahahaha");
                benar = true;
            }
            else{
                System.out.println("Tebakan mu salah coba lagii");
                sisaKesampatan--;

                if(sisaKesampatan > 0){
                    System.out.println("Sisa kesempatan: " + sisaKesampatan);
                }
                else{
                    System.out.println("Kesempatan mu habis");
                    benar = true;
                }
            }

        }
    }
}
