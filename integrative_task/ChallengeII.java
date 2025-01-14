package integrative_task;

import java.util.Scanner;

public class ChallengeII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el primer número: ");
        int num1 = scanner.nextInt();
        System.out.println("Ingresa el segundo número");
        int num2 = scanner.nextInt();

        System.out.println("1 - sumar");
        System.out.println("2 - restar");
        System.out.println("3 - multiplicar");
        System.out.println("4 - dividir");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("La suma total es " + (num1 + num2));
            case 2:
                System.out.println("La resta total es " + (num1 - num2));
            case 3:
                System.out.println("La multiplicación total es " + (num1 * num2));
            case 4:
            if (num2 != 0) {
                System.out.println("El resultado de la división es: " + ((double) num1 / num2));
            } else {
                System.out.println("Error: No se puede dividir entre cero.");
            }
            break;
        default:
            System.out.println("Opción no válida. Por favor selecciona un número del 1 al 4.");
        }
    scanner.close();
    }
}
