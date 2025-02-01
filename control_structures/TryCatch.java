package control_structures;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a divisor");
        int divisor = input.nextInt();
        int quotient = 0;
        try {
            quotient = 10 / divisor;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by 0");
        } catch (InputMismatchException e) {
            System.out.println("A character was entered instead of a number.");
        } finally {
        System.out.println("The result is: " + quotient);
        }
        input.close();
    }
}
