import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int[][] produccion = new int[4][5];

        int[] sumaMaquinas = new int[4];
        int[] sumaDias = new int[5];

        int contador = 0;
        int maquinasPromedio = 0;

        int filas = produccion.length;
        int columnas = produccion[0].length;

        for (int i = 0; i < filas; i++) {

            for (int j = 0; j < columnas; j++) {

                System.out.println("Ingrese produccion de la maquina "
                        + (i + 1) + " dia " + (j + 1));

                produccion[i][j] = leer.nextInt();

                while (produccion[i][j] < 0) {
                    System.out.println("Error, ingrese un numero positivo");
                    produccion[i][j] = leer.nextInt();
                }

                if (produccion[i][j] > 50) {
                    contador++;
                }

                sumaMaquinas[i] += produccion[i][j];
            }
        }

        for (int j = 0; j < columnas; j++) {

            for (int i = 0; i < filas; i++) {

                sumaDias[j] += produccion[i][j];
            }
        }

        int mayor = sumaMaquinas[0];
        int posicionMayor = 1;

        for (int i = 0; i < filas; i++) {

            double promedio = (double) sumaMaquinas[i] / columnas;

            System.out.println("Promedio de la maquina "
                    + (i + 1) + ": " + promedio);

            if (promedio > 100) {
                maquinasPromedio++;
            }

            if (sumaMaquinas[i] > mayor) {
                mayor = sumaMaquinas[i];
                posicionMayor = i + 1;
            }
        }

        int menor = sumaDias[0];
        int posicionMenor = 1;

        for (int j = 0; j < columnas; j++) {

            if (sumaDias[j] < menor) {
                menor = sumaDias[j];
                posicionMenor = j + 1;
            }
        }

        System.out.println("\nTotal producido por maquina:");

        for (int i = 0; i < filas; i++) {
            System.out.println("Maquina " + (i + 1)
                    + ": " + sumaMaquinas[i]);
        }

        System.out.println("\nTotal producido por dia:");

        for (int j = 0; j < columnas; j++) {
            System.out.println("Dia " + (j + 1)
                    + ": " + sumaDias[j]);
        }

        System.out.println("\nLa maquina con mayor produccion fue la "
                + posicionMayor + " con " + mayor + " piezas");

        System.out.println("El dia con menor produccion fue el "
                + posicionMenor + " con " + menor + " piezas");

        System.out.println("Registros superiores a 50: " + contador);

        System.out.println("Maquinas con promedio superior a 100: "
                + maquinasPromedio);

        System.out.println("\nMatriz completa:");

        for (int i = 0; i < filas; i++) {

            for (int j = 0; j < columnas; j++) {
                System.out.print(produccion[i][j] + " ");
            }

            System.out.println();
        }
    }
}