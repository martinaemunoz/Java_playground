package while_loop;

import java.util.Scanner;

public class DoWhileExample {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese un número para detectar sus cifras: ");
            int num = 0;
    
            do {
                System.out.println("Por favor ingresa un número mayor que 0");
                num = scanner.nextInt();
            } while (num <= 0);

            int cifras = 0;

            while (num > 0) {
                num = num/10;
                cifras++;
            }
            
            System.out.println("El número tiene "+cifras+ " cifras.");
            scanner.close();
    }
}
