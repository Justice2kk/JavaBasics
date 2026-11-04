
import java.util.Scanner;

public class Dummy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int div = 0, max = 0;
        String str = "";

        while (div <= 1) {
            System.out.println("Enter the divisor (greater than 1):");
            div = input.nextInt();
        }

        while (max <= 10) {
            System.out.println("Enter maximum value (greater than 10):");
            max = input.nextInt();
        }

        for (int i = div; i <= max; i += div) {
            if (i > div) {
                str += ", ";
            }

            str += i;
        }

        System.out.println(str);
    }
}
