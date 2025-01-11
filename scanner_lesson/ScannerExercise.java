package scanner_lesson;
import java.util.Scanner;

public class ScannerExercise {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = id.nextLine();
        System.out.println("Please enter your age: ");
        int age = id.nextInt();
        System.out.println("Your name is: " + name + " and your age is " + age);
        id.close();
    }
}
    
