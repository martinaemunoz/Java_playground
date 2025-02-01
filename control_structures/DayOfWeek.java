package control_structures;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] daysWeek = {
            "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
        };
        System.out.println("1: Monday\n2: Tuesday\n3: Wednesday\n4: Thursday\n5: Friday\n6: Saturday\n7: Sunday\nChoose a day of the week (e.g., 1 for Monday):");
        int dayNumber = input.nextInt();

        while (dayNumber < 1 || dayNumber > 7) {
            System.out.println("Invalid input. Try again: ");
            dayNumber = input.nextInt();
        }

        if (dayNumber >= 1 && dayNumber <= 7) {
            String dayName = daysWeek[dayNumber - 1];
            System.out.println("The selected day is: " + dayName);

            switch (dayNumber) {
                case 6, 7 -> System.out.println(dayName + " is a non-working day");
                case 1, 2, 3, 4, 5 -> System.out.println(dayName + " is a working day");
            }
        }
        input.close();
    }
}
