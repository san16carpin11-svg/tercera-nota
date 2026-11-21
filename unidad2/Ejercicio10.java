import java.util.Scanner;

public class Ejercicio10{

    // Funcion para ingresar y validar los tiempos
    public static void llenarArreglo(int[] tiempos, Scanner sc) {

        for (int i = 0; i < tiempos.length; i++) {

            do {
                System.out.print("Ingrese el tiempo de la entrega " + (i + 1) + ": ");
                tiempos[i] = sc.nextInt();

                if (tiempos[i] < 10 || tiempos[i] > 120) {
                    System.out.println("Tiempo invalido. Ingrese entre 10 y 120.");
                }

            } while (tiempos[i] < 10 || tiempos[i] > 120);
        }
    }

    // Funcion para contar entregas entre 10 y 60 minutos
    public static int contarEntre10y60(int[] tiempos) {
        int contador = 0;

        for (int i = 0; i < tiempos.length; i++) {
            if (tiempos[i] >= 10 && tiempos[i] <= 60) {
                contador++;
            }
        }

        return contador;
    }

    // Funcion para contar entregas mayores de 60 minutos
    public static int contarMayor60(int[] tiempos) {
        int contador = 0;

        for (int i = 0; i < tiempos.length; i++) {
            if (tiempos[i] > 60) {
                contador++;
            }
        }

        return contador;
    }

    // Funcion para sumar los tiempos
    public static int sumarTiempos(int[] tiempos) {
        int suma = 0;

        for (int i = 0; i < tiempos.length; i++) {
            suma += tiempos[i];
        }

        return suma;
    }

    // Funcion para calcular el promedio
    public static double calcularPromedio(int suma, int n) {
        return (double) suma / n;
    }

    // Funcion para encontrar el mayor tiempo
    public static int encontrarMayor(int[] tiempos) {
        int mayor = tiempos[0];

        for (int i = 1; i < tiempos.length; i++) {
            if (tiempos[i] > mayor) {
                mayor = tiempos[i];
            }
        }

        return mayor;
    }

    // Metodo principal
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de entregas: ");
        int n = sc.nextInt();

        int[] tiempos = new int[n];

        llenarArreglo(tiempos, sc);

        int total = sumarTiempos(tiempos);

        System.out.println("\nEntregas entre 10 y 60 minutos: " + contarEntre10y60(tiempos));
        System.out.println("Entregas mayores de 60 minutos: " + contarMayor60(tiempos));
        System.out.println("Total de minutos empleados: " + total);
        System.out.println("Promedio por entrega: " + calcularPromedio(total, n));
        System.out.println("Mayor tiempo registrado: " + encontrarMayor(tiempos));

        sc.close();
    }
}