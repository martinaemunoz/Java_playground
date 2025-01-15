package control_structures;

import java.util.Scanner;

public class NumberClassification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un número");
        int num = scanner.nextInt();

        if (num > 0) {
            System.out.println("El número es positivo");
        } else if (num == 0) {
            System.out.println("El número es igual a 0");
        } else {
            System.out.println("El número es negativo");
        }

        scanner.close();
    }
}
