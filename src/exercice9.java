import java.util.Scanner;

public class exercice9 {
    public static void main(String[] args) {
        int radius ;
        double cer ;
        double surface ;
        Scanner reader = new Scanner(System.in) ;
        System.out.println("enter radius : ");
        radius = reader.nextInt();
        cer = 2 * radius * Math.PI ;
        surface = Math.PI * radius * radius ;
        System.out.println("the surface is : " + surface);
        System.out.println("the circum chi haja is : " + cer);

    }
}
