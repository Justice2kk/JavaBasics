public class PrintFormat {

    public static void main(String[] args) {
        String name = "Alice";
        int age = 25;
        double height = 1.82678;
        double grade = 8.756;
        String subject = "Mathematics";

        System.out.printf("Name: %s%n", name);
        System.out.printf("Age: %d years old%n", age);
        System.out.printf("Height: %.2f meters%n", height);
        System.out.printf("Grade in %S: %.1f", subject, grade);
    }
}