package arrays;

import java.util.Scanner;

public class IntArrayMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int[] array = new int[5];
        System.out.println("Ingrese el primer número: ");
        array[0] = scanner.nextInt();
        System.out.println("Ingrese el segundo número: ");
        array[1] = scanner.nextInt();
        System.out.println("Ingrese el tercer número: ");
        array[2] = scanner.nextInt();
        System.out.println("Ingrese el cuarto número: ");
        array[3] = scanner.nextInt();
        System.out.println("Ingrese el quinto número: ");
        array[4] = scanner.nextInt();

        int max = array[0]; 

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("El número máximo es: " + max);

        scanner.close();
    }
}
