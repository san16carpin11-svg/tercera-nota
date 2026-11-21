import java.util.Scanner;

public class Ejercicio08{
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int[][] inventario = new int[3][2];
        int[] totalProducto = new int[3];

        int menor10 = 0;
        int mayor = 0;
        int productoMayor = 0;

        // Ingresar inventario
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {

                System.out.print("Producto " + (i + 1) + ", Sucursal " + (j + 1) + ": ");
                inventario[i][j] = leer.nextInt();

                while (inventario[i][j] < 0) {
                    System.out.print("Error. Ingrese una cantidad positiva: ");
                    inventario[i][j] = leer.nextInt();
                }

                totalProducto[i] += inventario[i][j];

                if (inventario[i][j] < 10) {
                    menor10++;
                }
            }
        }

        // Buscar producto con mayor inventario
        for (int i = 0; i < 3; i++) {
            if (totalProducto[i] > mayor) {
                mayor = totalProducto[i];
                productoMayor = i;
            }
        }

        // Mostrar matriz
        System.out.println("\n--- INVENTARIO ---");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(inventario[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nTotal producto 1: " + totalProducto[0]);
        System.out.println("Total producto 2: " + totalProducto[1]);
        System.out.println("Total producto 3: " + totalProducto[2]);

        System.out.println("Producto con mayor inventario: " + (productoMayor + 1));
        System.out.println("Registros con menos de 10 unidades: " + menor10);
    }
}