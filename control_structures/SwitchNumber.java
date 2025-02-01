package control_structures;

public class SwitchNumber {
    public static void main(String[] args) {
        String resultado0;
        int numero = 2;
        if (numero == 1 || numero == 2){
            resultado0 = "El número es igual a 1 o 2";
        } else if (numero == 3) {
            resultado0 = "El número es igual a 3";
        } else {
            resultado0 = "El número puede tener cualquier valor";
        }
        System.out.println(resultado0);

        String resultado1;
        switch (numero) {
            case 1:
            case 2:
            resultado1 = "El número es igual a 1 o 2";
                break;
            case 3:
            resultado1 ="El número es igual a 3";
                break;
            default:
            resultado1 = "El número puede tener cualquier valor";
                break;
        }
        System.out.println(resultado1);

        String resultado = switch (numero) {
            case 1, 2 -> "se: El número igual a 1 o 2";
            case 3 -> "se: El número igual 3";
            default -> {
                yield "se: El número puede tener cualquier valor";
            }
        };
        System.out.println(resultado);
    };
};
