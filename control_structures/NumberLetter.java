package control_structures;

import java.util.Scanner;

public class NumberLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un número del 1 al 100:");
        int num = scanner.nextInt();

        if (num >= 90 && num <= 100) {
            System.out.println("El puntaje es A");
        } else if (num >= 80 && num < 90) {
            System.out.println("El puntaje es B");
        } else if (num >= 70 && num < 80) {
            System.out.println("El puntaje es C");
        } else if (num >= 60 && num < 70) {
            System.out.println("El puntaje es D");
        } else if (num >= 0 && num < 60) {
            System.out.println("El puntaje es F");
        } else {
            System.out.println("El número ingresado no es válido. Ingresa un número entre 1 y 100.");
        }

        scanner.close();
    }
}
