public class Soal3b {
    public static void main(String args[]){
        for(int row = 1; row<=5; row++){
                for(int col = 1; col <= 5; col++){
                    if(row % 2 == 1){ // pola jika row ganjil
                        if(col % 2 == 1){
                            System.out.print("* "); //col ganjil diprint
                        }
                        else{
                            System.out.print("  "); //col genap kosong
                        }
                    }
                    else if(row % 2 == 0){ //pola jika row genap
                        if(col % 2 == 1){
                            System.out.print("  ");
                        }
                        else{
                            System.out.print("* ");
                        }
                    }
            }
                System.out.println();
         
        } 
    }   
    
}
