import java.util.Scanner;
public class Programa1 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] ventas = new double[6];
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio"};
        
        // Ingresar las ventas para cada mes
        for (int i = 0; i < 6; i++) {
            System.out.print("Ingrese las ventas de " + meses[i] + ": ");
            ventas[i] = scanner.nextDouble();
        }

        // Calcular el total y el promedio de ventas
        double totalVentas = 0;
        double mayorVenta = ventas[0];
        int mesMayorVenta = 0;

        for (int i = 0; i < 6; i++) {
            totalVentas += ventas[i];

            // Encontrar el mes con la mayor venta
            if (ventas[i] > mayorVenta) {
                mayorVenta = ventas[i];
                mesMayorVenta = i;
            }
        }

        double promedioVentas = totalVentas / 6;

        // Mostrar los resultados
        System.out.println("\nTotal de ventas del semestre: " + totalVentas);
        System.out.println("Promedio de ventas del semestre: " + promedioVentas);
        System.out.println("Mes con la mayor venta: " + meses[mesMayorVenta] + " con " + mayorVenta);
    }
}
