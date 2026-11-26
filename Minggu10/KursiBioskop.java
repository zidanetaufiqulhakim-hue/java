import java.util.Scanner;

public class KursiBioskop{
    public static void main(String[] args){        
        //status kursi
        int [][] statusKursi = new int[8][10];
        
        //simulasi kursi jika semua kursi depan sudah penuh
        for(int col = 0; col < 10; col++){
            statusKursi[7][col] = 1;
        }

        // Step 1: Minta user input
        Scanner userIn = new Scanner(System.in);
        boolean userRequestCompleted = false;
        int barisPilihan = 0;
        int kolomPilihan = 0;

        //Menampilakan Denah kursi
        for (int row = 0; row < statusKursi.length; row++){
            for (int col = 0; col < statusKursi[0].length; col++){
                System.out.print(statusKursi[row][col] + " ");
            }
            System.out.println();
        }
        // proses meminta user selesai jika kursi yang kosong terpenuhi
        while(userRequestCompleted == false){
            System.out.print("Pilih Nomor baris kursi yang diinginkan: ");
            barisPilihan = userIn.nextInt();
            System.out.print("Pilih Nomor baris kursi yang diinginkan: ");
            kolomPilihan = userIn.nextInt();

            // menngecek apakah baris dan kolom yang dipilih sudah penuh
            if(statusKursi[barisPilihan - 1][kolomPilihan - 1] == 1){
                System.out.println("Maaf kursi sudah penuh, silakan pilih lagi");
            }
            else{
                userRequestCompleted = true;
                statusKursi[barisPilihan - 1][kolomPilihan - 1] = 1;
            }
            
        }
        System.out.println("Terimakasih sudah pilih kursi\n");
        //Menampilakan Denah kursi
        for (int row = 0; row < statusKursi.length; row++){
            for (int col = 0; col < statusKursi[0].length; col++){
                System.out.print(statusKursi[row][col] + " ");
            }
            System.out.println();
        }
    }
}
