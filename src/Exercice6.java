import java.util.Scanner;

public class Exercice6 {
    public static void main(String[] args) {
        int a ;
        int c ;
        Scanner reader = new Scanner(System.in);
        System.out.println("enter number");
        a = reader.nextInt() ;
        for( int i=0 ; i<=10 ; i++) {
            c = a * i ;
            System.out.println(a + " * " + i + " = " + c);
        }
    }
}
