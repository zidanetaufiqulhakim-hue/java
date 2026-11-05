import java.util.Scanner;

public class NestedLoop {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan jumlah baris(row): ");
        int end_row = scan.nextInt();

        System.out.print("Masukan jumlah kolom(col): ");
        int end_col = scan.nextInt();

        for(int row = 1; row <= end_row; row++){
            for(int col = 1; col <= end_col; col++){
                System.out.print("* ");
            }
        System.out.println();
        }
    }
}
