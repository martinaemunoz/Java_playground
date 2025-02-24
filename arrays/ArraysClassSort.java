package arrays;

import java.util.Arrays;

public class ArraysClassSort {
    public static void main(String[] args) {
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println("El arreglo inicial es: " + Arrays.toString(array)); 

        Arrays.sort(array);

        System.out.println("El arreglo ordenado es: " + Arrays.toString(array));


    }
}
 