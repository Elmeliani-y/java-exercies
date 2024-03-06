import java.util.Scanner;

public class Exercice3 {
    public static void main(String[] args) {
        int a ;
        int b ;
        int c ;
        Scanner reader = new Scanner(System.in) ;
        System.out.println("enter first number :");
        a = reader.nextInt();
        System.out.println("enter second number : ");
        b = reader.nextInt() ;
        c = a / b ;
        System.out.println("result is : " + c);
    }
}
