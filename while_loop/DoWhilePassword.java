package while_loop;

import java.util.Scanner;

public class DoWhilePassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = "secreto";
        String intento;

        do {
        System.out.print("Ingrese la contraseña: ");
        intento = scanner.nextLine();

        if (!password.equals(intento)) {
            System.out.println("Intente nuevamente");
        } else {
            System.out.println("Contraseña correcta. Ingresando...");
        }
        } while (!password.equals(intento));

        scanner.close();
    }
}
