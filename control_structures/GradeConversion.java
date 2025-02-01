package control_structures;

import java.util.Scanner;

public class GradeConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número del 1 al 5");

        int numero = scanner.nextInt();

        String resultado = switch (numero) {
            case 1 -> "Muy deficiente";
            case 2 -> "Deficiente";
            case 3 -> "Suficiente";
            case 4 -> "Notable";
            case 5 -> "Sobresaliente";
            default -> {
                yield "se: El número no es válido";
            }
        };
        System.out.println(resultado);

        scanner.close();
    }
}
