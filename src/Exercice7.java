import java.util.Scanner;

public class Exercice7 {
    public static void main(String[] args) {
        int a ;
        int c=1 ;
        Scanner reader = new Scanner(System.in);
        System.out.println("enter number : ");
        a = reader.nextInt() ;
        for (int i = a ; i>=1 ; i--) {
            c*= i ;
        }
        System.out.println("result is " + c);
    }
}
