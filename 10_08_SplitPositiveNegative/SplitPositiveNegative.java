
import java.util.Scanner;

public class SplitPositiveNegative {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        String positive = "";
        String negative = "";

        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter a number [" + i + "]:");
            int num = ip.nextInt();

            if (num >= 0) {
                positive += num + " ";
            }
            else {
                negative += num + " ";
            }
        }

        System.out.println("Positive or zero: " + positive);
        System.out.println("Negative: " + negative);
    }
}
