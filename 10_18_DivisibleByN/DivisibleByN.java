import java.util.Scanner;

public class DivisibleByN {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        int div = 0, max = 0, oper = 0;
        String ry = "";

        while (div <= 1) {
            System.out.println("Enter the divisor (greater than 1):");
            div = ip.nextInt();
        }

        while (max <= 10) {
            System.out.println("Enter maximum value (greater than 10):");
            max = ip.nextInt();
        }

        for (int i = 1; oper + div <= max; i++) {
            oper += div;

            if (i > 1) {
                ry += ", ";
            }

            ry += oper;
        }

        System.out.println(ry);
    }
}
