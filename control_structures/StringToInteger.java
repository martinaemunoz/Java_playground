package control_structures;

import java.util.Scanner;

public class StringToInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a whole number");
        String userInput = input.nextLine();

        try {
            int number = Integer.parseInt(userInput);
            System.out.println("The entered number is " + number);
        } catch (NumberFormatException e) {
        System.out.println("Error. Not a valid number");
        }
    input.close();
    }
}
