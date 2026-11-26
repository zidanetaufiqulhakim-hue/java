import java.util.Scanner;
public class DuaDimensiArray {
    public static void main(String args[]){

        // CARA Basic
        System.out.println("Cara Basic");
        double[][] scores = new double[2][2];

        scores [0][0] = 1.4;
        scores [1][0] = 1.3;
        scores [1][1] = 1.0;
        scores [0][1] = 1.2;

        System.out.println(scores[1][1]);

        // CARA 1
        System.out.println("\nCara 1");
        double[][] numbers = new double[3][3];

        for (int row = 0; row < 3; row++){
            for (int col = 0; col < 3; col++){
                System.out.println(numbers[row][col]);
            }
        }

        // CARA 2 -- ada tabel nya
        System.out.println("\nCara 2");
        for (int row = 0; row < 3; row++){
            for (int col = 0; col < 3; col++){
                numbers[row][col] = row;
                numbers[row][col] = col;
                System.out.print(numbers[row][col] + " ");
            }
            System.out.println();
        }
        /* 
         // CARA 3 -- Input User
        System.out.println("\nCara 3 -- input USer");
        Scanner userIn = new Scanner(System.in);
        // INI LOOPING BUAT INPUT
        for (int row = 0; row < 3; row++){
            for (int col = 0; col < 3; col++){
                System.out.print("Masukan Input: ");
                numbers[row][col] = userIn.nextDouble();
            }
        }
        // INI LOOPING BUAT OUTPUT
        for (int row = 0; row < 3; row++){
            for (int col = 0; col < 3; col++){
                System.out.print(numbers[row][col] + " ");
            }
            System.out.println();
        }
        */

        // Mengakses Panjang
        System.out.println("\n// Mengakses Panjang");
        int[][] angka = {{1,2,3,4},
                        {5,6,7},
                        {9,10,11,12}};

        for (int row = 0; row < angka.length; row++){
            for (int col = 0; col < angka[row].length; col++){
                System.out.print(angka[row][col] + " ");
            }
            System.out.println();
        }
            
    }
}
