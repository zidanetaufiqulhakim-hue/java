public class Soal4a {
    public static void main(String main[]){
        for(int row = 1; row<=5; row++){
            for(int col = 1; col <= 5; col++){
                if(col <= row){
                    System.out.print("* ");
                }
                else if (col >= row){
                    System.out.print(" ");
                }

                }
        System.out.println();
        }
    }
    
}
