package for_loop;

import java.util.Scanner;

public class ForArrayReverse2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Ingrese el número " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
 
        System.out.println("El arreglo inverso es: ");

        for (int i = array.length - 1; i >= 0; i--) {
                System.out.println(array[i]);
        }

        scanner.close();
        }
}