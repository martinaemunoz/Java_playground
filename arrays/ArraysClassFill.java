package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysClassFill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Ingrese el tamaño del arreglo");
        int valorArray = scanner.nextInt();
        System.out.println("Ingrese un número entero con el cual rellenarlo");
        int contenidoArray = scanner.nextInt();

        int[] array = new int[valorArray];

        // for (int i = 0; i < array.length; i++) {
        //     array[i] = (int) (contenidoArray);
        // }

        Arrays.fill(array, contenidoArray);
        
        System.out.println("El arreglo es: " + Arrays.toString(array));
        
        scanner.close();
    }
}
