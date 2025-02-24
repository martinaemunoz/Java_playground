package arrays;

import java.util.Arrays;

public class ArraysClassEquals {
        public static void main(String[] args) {
        int[] array1 = new int[10];
        int[] array2 = new int[10];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 100);
        }

        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) (Math.random() * 100);
        }

        System.out.println("El arreglo 1 es: " + Arrays.toString(array1)); 
        System.out.println("El arreglo 2 es: " + Arrays.toString(array2)); 

        Arrays.equals(array1, array2);

        if (Arrays.equals(array1, array2) == true) {
            System.out.println("El arreglo 1 es igual al arreglo 2");
        } else {
            System.out.println("Los arreglos no son iguales");
        }
    }
}
