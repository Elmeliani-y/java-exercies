import java.util.Scanner;

public class exercice10 {
    public static void main(String[] args) {
        calculate();
    }

    static void calculate() {
        int x;
        double a = 0;
        double c = 0;
        Scanner reader = new Scanner(System.in);

        do {
            System.out.println("Give the number of notes: ");
            while (!reader.hasNextInt()) {
                System.out.println("Please enter a valid integer!");
                reader.next();
            }
            x = reader.nextInt();
        } while (x <= 0);

        double[] array = new double[x];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter note " + (i + 1) + ": ");
            array[i] = reader.nextDouble();
            a += array[i];
        }

        c = calculateAverage(a, x);
        System.out.println("The average of the notes is " + c);
    }

    static double calculateAverage(double sum, int count) {
        return sum / count;
    }
}
