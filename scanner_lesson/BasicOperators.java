package scanner_lesson;

import java.util.Scanner;

public class BasicOperators {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        int division = num1 / num2;
        int modulo = num1 % num2;
        System.out.println("La suma de " + num1 + " y " + num2 + " es " + suma);
        System.out.println("La resta de " + num1 + " y " + num2 + " es " + resta);
        System.out.println("La multiplicación de " + num1 + " y " + num2 + " es " + multiplicacion);
        System.out.println("La división de " + num1 + " y " + num2 + " es " + division);
        System.out.println("El módulo de " + num1 + " y " + num2 + " es " + modulo);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el primer número (puede ser decimal)");
        float userNum1 = scanner.nextFloat();
        System.out.println("Ingresa el segundo número: ");
        float userNum2 = scanner.nextFloat();
        float sum = userNum1 + userNum2;
        System.out.println("La suma de  "+ userNum1 +" y "+ userNum2 +" es "+ sum);
        scanner.close();
    }
}

