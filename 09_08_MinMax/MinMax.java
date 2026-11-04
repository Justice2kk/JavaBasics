import java.util.Scanner;

public class minMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a positive double (negative number to finish):");
        double num = input.nextDouble();

        double minNum = num;
        double maxNum = num;

        if (num < 0) {
            System.out.println("No numbers entered");
        }
        else {
            while (num >= 0) {
                if (num < minNum) {
                    minNum = num;
                }
                if (num > maxNum) {
                    maxNum = num;
                }

                System.out.println("Enter a positive double (negative number to finish):");
                num = input.nextDouble();
            }

            System.out.println("MINIM = " + minNum);
            System.out.println("MAXIM = " + maxNum);
        }
    }
}
