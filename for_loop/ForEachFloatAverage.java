package for_loop;

public class ForEachFloatAverage {
    public static void main(String[] args) {
        float[] numArray = new float[20];
        System.out.println("El array es: ");
        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = (float) (Math.random() * 100);
            System.out.println(numArray[i]);
        }

        float sum = 0;

        for (float num : numArray) {
            sum += num;
        }

        float average = sum / numArray.length;

        System.out.println("La suma de los elementos es: " + sum);
        System.out.println("El promedio de los elementos es: " + average);
    }
}
