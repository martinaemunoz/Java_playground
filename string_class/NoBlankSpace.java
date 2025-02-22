package string_class;

import java.util.Scanner;

public class NoBlankSpace {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a phrase (string)");
        String phrase = input.nextLine();

        String trimmedString = phrase.trim();

        System.out.println("Trimmed phrase without leading or trailing spaces: " + trimmedString);

        input.close();
    }
}
