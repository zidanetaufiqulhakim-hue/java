import java.util.Scanner;;

public class Pelanggan {
    public static void main(String args[]){
        Boolean isValid = true;
        double totalHarga = 0;
        String jenisPelangan = null;
        Scanner in = new Scanner(System.in);

        // Input jenis pelanggan dan total harga transaksi
        System.out.println("Halo. Selamat datang, masukan jenis member anda(VIP,MEMBER,NON-MEMBER):");
        jenisPelangan = in.nextLine();

        System.out.print("Masukan harga total belanja anda:");
        totalHarga = in.nextDouble();

        //validasi input
        if(jenisPelangan.equals("") || jenisPelangan == null || totalHarga == 0){
            isValid = false;
        }

        // hitung diskon
        if(isValid){
            switch (jenisPelangan) {
                case "VIP":
                    if(totalHarga > 300000){
                        totalHarga = totalHarga - (totalHarga*0.10);
                    } 
                    else if(totalHarga < 100000){
                        System.out.println("Tidak ada discount");
                    }
                    break;

                case "MEMBER":
                    if(totalHarga > 500000) {
                        totalHarga = totalHarga - (totalHarga*0.10);
                    }
                    else if(totalHarga < 100000){
                        System.out.println("Tidak ada discount");
                    }
                    break;
            
                default:
                    if(totalHarga < 100000) {
                        System.out.println("Tidak ada discount");
                    break;
                    }
                }
            }
            else{
                System.out.println("Data tidak valid");
            }

            //Ouput tolah pembayaran
            System.out.println("TotalPembayaran: " + totalHarga);
    
    }   
}
