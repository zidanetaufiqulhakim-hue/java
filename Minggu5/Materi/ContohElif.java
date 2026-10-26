import java.util.Scanner;   

public class ContohElif{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        if (number>=80){
            System.out.println("A");
        }
        else if (number>=60){
            System.out.println("B");
        } else{System.out.println("C");}
    }
}
