import java.util.Scanner;

public class Ejercicio06{
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        double[][] notas = new double[3][2];
        double[] promedios = new double[3];
        int perdidas = 0;
        double mayor = -1;
        int estudianteMayor = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Estudiante " + (i + 1) +
                    ", nota " + (j + 1) + ": ");
                notas[i][j] = leer.nextDouble();

                while (notas[i][j] < 0 || notas[i][j] > 5) {
                    System.out.print("Nota inválida. Ingrese de 0 a 5: ");
                    notas[i][j] = leer.nextDouble();
                }

                promedios[i] += notas[i][j] / 2;

                if (notas[i][j] < 3) {
                    perdidas++;
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            if (promedios[i] > mayor) {
                mayor = promedios[i];
                estudianteMayor = i;
            }
        }

        System.out.println("\n--- RESULTADOS ---");

        for (int i = 0; i < 3; i++) {
            System.out.println("Promedio estudiante " + (i + 1)
                + ": " + promedios[i]);
        }

        System.out.println("Mejor estudiante: " + (estudianteMayor + 1));
        System.out.println("Notas menores que 3: " + perdidas);

        System.out.println("\n--- MATRIZ ---");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(notas[i][j] + "\t");
            }
            System.out.println();
        }

        leer.close();
    }
}