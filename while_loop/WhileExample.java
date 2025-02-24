package while_loop;

import java.util.Scanner;

public class WhileExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número para detectar sus cifras: ");
        int num = scanner.nextInt();
        int cifras = 0;

        while (num > 0) {
            num = num/10;
            cifras++;
        }

        System.out.println("El número tiene "+cifras+ " cifras.");

        scanner.close();
    }
}
