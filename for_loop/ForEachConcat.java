package for_loop;

import java.util.Scanner;

public class ForEachConcat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        float[] numArray = new float[20];
        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = (float) (Math.random() * 100);
        }

        for (float numsPrint : numArray) {
            System.out.print(numsPrint + " ");
        }

        System.out.println(); 

    scanner.close();
    }
}
