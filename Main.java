import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Insert a number");
            int x = scanner.nextInt();

            System.out.println("Insert a second number");
            int y = scanner.nextInt();

            int result = x/y;
            System.out.println("The result is: " + result);
        } catch (ArithmeticException e) {
            System.out.println("You can't divide by 0");
        } catch (InputMismatchException e) {
            System.out.println("You can't divide by a string");
        } catch (Exception e ) {
            System.out.println("There's been a problem");
        } finally {
            scanner.close();
        }
    }
}




