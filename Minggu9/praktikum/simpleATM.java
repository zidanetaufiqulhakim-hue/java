import java.util.Scanner;

public class simpleATM {
    public static void main(String args[]){
        // inisialisasi inputer
        Scanner in = new Scanner(System.in);
        String userInput = "";
        boolean isRunning = true; // false secara default

        //user's data
        int saldo = 0;
        int jumlahSetor = 0;

        // Program ini
        while(isRunning){
            
            System.out.println("\nMENU PILIHAN");
            System.out.println("----------------------");
            System.out.println("Tekan 1: Cek Saldo");
            System.out.println("Tekan 2: Setor Ulang");
            System.out.println("Tekan 3: Tarik Uang");
            System.out.println("Tekan 4: Keluar/Cancel");
            System.out.println("----------------------");

            // aplikasi meminta input
            System.out.print("Masukan pilihan anda:");
            userInput = in.nextLine();

            // verifikasi kevalidan input
            switch (userInput) {
                case "1": // SALDO
                    //String saldoString = Integer.toString(saldo);
                    //System.out.println("\n--> SALDO ANDA SAAT INI : Rp." + String.format("%,.2f", saldoString));
                    System.out.println("\n--> SALDO ANDA SAAT INI : Rp." + saldo);
                    break;
                case "2": //SETOR
                    boolean jumlahSetorValid = false;
                    Scanner localIn = new Scanner(System.in);

                    System.out.println("\n--> SETOR UANG");
                    while(jumlahSetorValid != true){
                        // meminta input yanf disetor
                        System.out.print("Masukan nominal setoran: ");
                        jumlahSetor = localIn.nextInt();

                        if(jumlahSetor >= 50000 && jumlahSetor <= 1000000){
                            saldo += jumlahSetor;
                            System.out.println("SALDO ANDA SAAT INI: Rp." + saldo);
                            jumlahSetorValid = true;
                    }
                        else{
                            System.out.println("Uang yang disetor minimal 50rb");
                    }
                    }
                    break;
                case "3":
                    boolean jumlahTarikValid = false;
                    Scanner tarikIn = new Scanner(System.in);
                    System.out.println("\n--> Tarik uang");

                    while(jumlahTarikValid != true){
                        // meminta input yanf disetor
                        System.out.print("Masukan nominal uang tarik: Rp.");
                        int jumlahTarik = tarikIn.nextInt();
                        //validasi input
                        if(jumlahTarik > saldo){
                            System.out.println("Saldo Anda Tidak Cukup");
                            }
                        else if(jumlahTarik < 50000 || jumlahTarik > 1500000){
                            System.out.println("Input Tidak Valid");
                            }
                        else if(jumlahTarik%50000 != 0){
                            System.out.println("Input Tidak Valid");
                            }
                        else{
                            saldo -= jumlahTarik;
                            System.out.println("SISA SALDO ANDA: Rp." + saldo);
                            jumlahTarikValid = true; // now it's valid
                        }
                    }

                    break;
                case "4":
                    System.out.println("\n--> Terima kasih");
                    isRunning = false; // program berhenti
                    break;
                default:
                    System.out.println("\n--> Menu tidak valid");
                    break;
            }
        }
    }
}
