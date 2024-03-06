import java.util.Scanner;

public class Exercice8 {
    public static void main(String[] args) {
        nbr() ;
    }
    public static void nbr() {
        int a ;
        Scanner reader = new Scanner(System.in);
        System.out.println("enter number :");
        a = reader.nextInt();
        boolean cond = true ;
        for (int i =2 ; i<=(a-1) ; i++) {
            if (a % i ==0) {
                cond = false;
            }
        } ;
        if (cond == true) {
            System.out.println("le nombre est premier ");
        } else {
            System.out.println("le nombre n'est pas premier");
        }
    } }

