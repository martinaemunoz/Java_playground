package while_loop;

import java.util.Scanner;

public class WhileInteractiveMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option = 0;

        while (option != 5) {
            System.out.println("Ingrese una opción: ");
            System.out.println("1. Comprar producto");
            System.out.println("2. Realizar devolución");
            System.out.println("3. Ver mis pedidos");
            System.out.println("4. Preguntas frecuentes");
            System.out.println("5. Salir");

            System.out.println("Opción: ");
            option = scanner.nextInt();

            String resultado = switch (option) {
                case 1 -> "se: Seleccionaste: Opción comprar";
                case 2 -> "se: Seleccionaste: Opción devolución";
                case 3 -> "se: Seleccionaste: Opción ver mis pedidos";
                case 4 -> "se: Seleccionaste: Opción preguntas frecuentes";
                case 5 -> "se: Seleccionaste: Opción salir";
                default -> {
                    yield "se: ⚠️ Opción inválida. Intenta nuevamente.";
                }
            };

            System.out.println(resultado);
        }
        
        scanner.close();
    }
}
