import java.util.Scanner;

public class Exercice5 {
    public static void main(String[] args) {
        int a;
        int b;
        int c = 0;
        String d;
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter first number: ");
        a = reader.nextInt();

        System.out.println("Enter second number: ");
        b = reader.nextInt();

        System.out.println("Enter type of equation (+, -, *, /, %):");
        d = reader.next();

        if (!d.isEmpty()) {
            switch (d) {
                case "+":
                    c = a + b;
                    break;
                case "-":
                    c = a - b;
                    break;
                case "*":
                    c = a * b;
                    break;
                case "/":
                    if (b != 0) {
                        c = a / b;
                    } else {
                        System.out.println("Error: Division by zero!");
                        return;
                    }
                    break;
                case "%":
                    if (b != 0) {
                        c = a % b;
                    } else {
                        System.out.println("Error: Modulo by zero!");
                        return;
                    }
                    break;
                default:
                    System.out.println("Wrong type, no such type!");
                    return;
            }
            System.out.println("The result is " + c);
        } else {
            System.out.println("Wrong type, no such type!");
        }
    }
}
