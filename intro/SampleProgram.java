package intro;
public class SampleProgram {public static void main(String[] args) {
    // llama a los métodos para organizar la salida
        imprimirSaludo();
        imprimirVariables();
    }

    // método para imprimir saludo
    public static void imprimirSaludo() {
        System.out.println("Hola mundo");
        System.out.println("Bienvenido a mi clase de Java");
    }

    // método para imprimir variables
    public static void imprimirVariables() {
        int miEntero = 2;
        String saludo = "Hola!";
        System.out.println(miEntero);
        System.out.println(saludo);
    }
    
}

