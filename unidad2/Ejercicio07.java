
import java.util.Arrays;

public class Ejercicio07{

    public static void modificarArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2;
        }

        System.out.println("Dentro del método: " + Arrays.toString(arr));
    }

    public static void main(String[] args) {

        int[] numeros = {1, 2, 3, 4, 5};

        System.out.println("Antes de modificar: " + Arrays.toString(numeros));

        modificarArray(numeros);

        System.out.println("Después de modificar: " + Arrays.toString(numeros));
    }
}
```