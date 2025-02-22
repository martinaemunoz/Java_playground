package string_class;

public class StringClass {
    public static void main(String[] args) {
        String word = "hello";
        System.out.println("Length: " + word.length()); // método de instancia 1
        System.out.println(word.substring(0)); // métodos de instancia 2
        word = String.valueOf(234234); // métodos de la clase static 1
        System.out.println(word); // métodos de la clase static 2
    }
}

// de instancia: length(), substring(), toUpperCase()
// de clase: valueOf(), format(), join()