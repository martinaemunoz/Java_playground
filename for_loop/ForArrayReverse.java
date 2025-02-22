package for_loop;

import java.util.Scanner;

public class ForArrayReverse {
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
 
        System.out.println("El arreglo inverso es: ");

        for (int i = array.length - 1; i >= 0; i--) {
                System.out.println(array[i]);
        }

        scanner.close();
        }
}
