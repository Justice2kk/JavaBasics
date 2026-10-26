import java.util.Scanner;

public class ParkTicket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your age:");
        int age = input.nextInt();
        
        System.out.println("Is it a weekday? (true/false)");
        boolean weekDay = input.nextBoolean();
        
        double preu = (age < 12 ? (weekDay ? 5.0 : 9.0) : (weekDay ? 15.0 : 22.0));
        
        System.out.printf("Ticket price: %.2f €", preu);
    }
}