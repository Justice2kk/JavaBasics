public class PrintTable {
    public static void main(String[] args) {

        int age1 = 25;
        double grade1 = 8.756;
        String name1 = "Alice";
        String lastname1 = "Black";
        String subject1 = "Maths";

        int age2 = 33;
        double grade2 = 7.734;
        String name2 = "Peter";
        String lastname2 = "Green";
        String subject2 = "Geography";

        int age3 = 24;
        double grade3 = 9.142;
        String name3 = "Anne";
        String lastname3 = "White";
        String subject3 = "Computing";

        int age4 = 23;
        double grade4 = 6.2663;
        String name4 = "John";
        String lastname4 = "Pink";
        String subject4 = "Physics";

        System.out.printf("|%-10s|%-10s|%-10s|%-10s|%-10s|%n", "NAME", "LASTNAME", "AGE", "SUBJECT", "GRADE" );    // HEADERS
        System.out.printf("|----------|----------|----------|----------|----------|%n" );
        System.out.printf("|%-10s|%-10s|%10d|%-10S|%10.2f|%n", name1, lastname1, age1, subject1, grade1 );    //STUDENT1
        System.out.printf("|%-10s|%-10s|%10d|%-10S|%10.2f|%n", name2, lastname2, age2, subject2, grade2 );    //STUDENT2
        System.out.printf("|%-10s|%-10s|%10d|%-10S|%10.2f|%n", name3, lastname3, age3, subject3, grade3 );    //STUDENT3
        System.out.printf("|%-10s|%-10s|%10d|%-10S|%10.2f|%n", name4, lastname4, age4, subject4, grade4 );    //STUDENT4
    }
}