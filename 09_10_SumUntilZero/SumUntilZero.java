import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int iNumber = 0;
        int sum = 0;
        int count = 0;

        System.out.println("Enter number:");
        iNumber = input.nextInt();

        while (iNumber != 0) {
            sum += iNumber;
            count++;

            System.out.println("Enter number:");
            iNumber = input.nextInt();
        }

        System.out.printf("Sum: %d\nCount: %d", sum, count);
    }
}