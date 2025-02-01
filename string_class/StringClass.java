package string_class;

public class StringClass {
    public static void main(String[] args) {
        String word = "hello";
        System.out.println("Length: " + word.length());
        System.out.println(word.substring(0)); // métodos del objeto
        word = String.valueOf(234234); // métodos de la clase
        System.out.println(word);
    }
}
