import java.util.Scanner;

public class TotalSumOfCards {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int val = 0, val2 = 0, sum1 = 0, sum2 = 0;

        System.out.println("PLAYER 1");

        for (int i = 1; i <= 4; i++) {
            System.out.printf("Enter the value of card %d for player 1:%n", i);
            val = input.nextInt();

            while (val < 1 || val > 12) {
                System.out.println("Wrong card, please enter 1..12:");
                val = input.nextInt();
            }

            sum1 += val;
        }

        System.out.println();
        System.out.println("PLAYER 2");

        for (int i = 1; i <= 4; i++) {
            System.out.printf("Enter the value of card %d for player 2:%n", i);
            val2 = input.nextInt();

            while (val2 < 1 || val2 > 12) {
                System.out.println("Wrong card, please enter 1..12:");
                val2 = input.nextInt();
            }

            sum2 += val2;
        }

        System.out.println();
        System.out.println("RESULTS");

        System.out.println("Total cards Player 1: " + sum1);
        System.out.println("Total cards Player 2: " + sum2);

        if (sum1 > sum2) {
            System.out.println("Player 1 has won!");
        }
        else if (sum2 > sum1) {
            System.out.println("Player 2 has won!");
        }
        else {
            System.out.println("It is a draw.");
        }
    }
}