public class Soal3a {
    public static void main(String args[]){
        for(int row = 1; row<=3; row++){
                for(int col = 1; col <= 5; col++){
                    if(col % 2 == 1){
                        System.out.print("_ ");
                    }
                    else{
                        System.out.print("* ");
                    }
            }
        System.out.println();
        }
    }
}
