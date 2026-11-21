import java.util.Scanner;

public class Ejercicio09{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cantEmpleados;
        int cantEntre100Y300 = 0;
        int cantMayor300 = 0;
        double importeTotal = 0;

        System.out.print("Ingrese la cantidad de empleados: ");
        cantEmpleados = sc.nextInt();

        double[] sueldos = new double[cantEmpleados];

        for (int i = 0; i < cantEmpleados; i++) {

            do {
                System.out.print("Ingrese el sueldo del empleado " + (i + 1) + ": ");
                sueldos[i] = sc.nextDouble();

                if (sueldos[i] < 100 || sueldos[i] > 500) {
                    System.out.println("Sueldo inválido. Debe estar entre $100 y $500.");
                }

            } while (sueldos[i] < 100 || sueldos[i] > 500);

            importeTotal += sueldos[i];

            if (sueldos[i] <= 300) {
                cantEntre100Y300++;
            } else {
                cantMayor300++;
            }
        }

        System.out.println("\nCantidad de empleados que ganan entre $100 y $300: " + cantEntre100Y300);
        System.out.println("Cantidad de empleados que ganan más de $300: " + cantMayor300);
        System.out.println("Importe total de la nómina: $" + importeTotal);

        sc.close();
    }
}