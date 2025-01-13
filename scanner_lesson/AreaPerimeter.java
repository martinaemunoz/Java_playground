package scanner_lesson;

import java.util.Scanner;

public class AreaPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculadora de Perímetro de un Rectángulo");
        System.out.print("Ingrese la base del rectangulo: ");
        double baseRectangulo = scanner.nextDouble();
        System.out.print("Ingrese la altura del rectangulo: ");
        double alturaRectangulo = scanner.nextDouble();

        double perimetroRectangulo = 2 * (baseRectangulo + alturaRectangulo);
        System.out.println("El perímetro del rectángulo es: " + perimetroRectangulo);

        double areaRectangulo = baseRectangulo * alturaRectangulo;
        System.out.println("El area del rectángulo es: " + areaRectangulo);

        scanner.close();
    }
}
