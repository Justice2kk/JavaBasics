import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        System.out.println("How many numbers do you want to enter?");
        int count = ip.nextInt();

        while (count <= 0) {
            System.out.println("Invalid amount. Please enter a positive number.");
            count = ip.nextInt();
        }

        double sum = 0;

        for (int i = 1; i <= count; i++) {
            System.out.println("Enter number " + i + ":");
            double num = ip.nextDouble();

            sum += num;
        }

        double average = sum / count;

        System.out.printf("The average is: %.2f%n", average);
    }
}