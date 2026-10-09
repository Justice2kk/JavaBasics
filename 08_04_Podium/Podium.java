
import java.util.Scanner;

public class Podium {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the score of the first athlete:");
        int score1 = input.nextInt();

        System.out.println("Enter the score of the second athlete:");
        int score2 = input.nextInt();

        System.out.println("Enter the score of the third athlete:");
        int score3 = input.nextInt();

        System.out.println("Enter \"asc\" or \"desc\":");
        input.nextLine();
        String written = input.nextLine().toLowerCase();

        int temp;

        if (score1 > score2) {
            temp = score1;
            score1 = score2;
            score2 = temp;
        }

        if (score1 > score3) {
            temp = score1;
            score1 = score3;
            score3 = temp;
        }

        if (score2 > score3) {
            temp = score2;
            score2 = score3;
            score3 = temp;
        }

        if (written.equals("asc")) {
            System.out.printf("Podium: %d %d %d\n",
                score1, score2, score3);
        }
        else if (written.equals("desc")) {
            System.out.printf("Podium: %d %d %d\n",
                score3, score2, score1);
        }

        input.close();
    }
}
