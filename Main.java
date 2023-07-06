import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your first name ?");
        String name = scanner.nextLine();

        System.out.println("What is your last name ?");
        String lastName = scanner.nextLine();

        System.out.println("What is your age ?");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("My name is " + name + " " + lastName );
        System.out.println("I'm " + age + " " + "years old.");
    }
}
