package while_loop;

import java.util.Scanner;

public class DoWhileGuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroSecreto = (int) (Math.random() * 20) + 1;
        int intento;

        System.out.println("Adivina el número (entre 1 y 20)");
        do {
            System.out.print("Ingresa tu número: ");
            intento = scanner.nextInt();

            if (intento < numeroSecreto) {
                System.out.println("Es un número mayor. Intenta otra vez.");
            } else if (intento > numeroSecreto) {
                System.out.println("Es un número menor. Intenta otra vez.");
            } else {
                System.out.println("Felicidades! Adivinaste el número.");
            }

        } while (intento != numeroSecreto);

        scanner.close();
    }
}
