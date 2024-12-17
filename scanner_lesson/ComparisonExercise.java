package scanner_lesson;

import java.util.Scanner;

public class ComparisonExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el primer número: ");
        int num1 = scanner.nextInt();
        System.out.println("Ingresa el segundo número");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("El número (" + num1 + ") es mayor que el segundo número (" + num2 + ").");
        } else {
            System.out.println("El número (" + num1 + ") es menor que el segundo número (" + num2 + ").");
        }

        if (num1 != num2) {
            System.out.println("El número (" + num1 + ") es diferente del segundo número (" + num2 + ").");
        } else {
            System.out.println("El número (" + num1 + ") es equivalente al segundo número (" + num2 + ").");
        }

        if (num1 % 2 == 0) {
            System.out.println("El número (" + num1 + ") es divisible por dos.");
        } else {
            System.out.println("El número (" + num1 + ") no es divisible por dos.");
        }

        System.out.println("Ingresa un tercer número");
        int num3 = scanner.nextInt();
        System.out.println("Ingresa un cuarto número");
        int num4 = scanner.nextInt();

        if (num1 > num2 && num3 > num4) {
            System.out.println("La condición es verdadera, el primer número es mayor que el segundo Y el tercer número es mayor que el cuarto.");
        } else {
            System.out.println("La condición es falsa, el primer número es menor que el segundo O el tercer número es menor que el cuarto.");
        }

        if (num1 > num2 || num3 > num4) {
            System.out.println("La condición es verdadera, el primer número es mayor que el segundo O el tercer número es mayor que el cuarto.");
        } else {
            System.out.println("La condición es falsa, ninguna condición se cumple.");
        }

        scanner.close();
    }
}