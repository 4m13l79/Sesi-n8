import java.util.Scanner;
public class Ejercicio2 {
public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.print("Ingrese cuántos números primos desea ver: ");
        int n = lectura.nextInt();
        int contadorPrimos = 0, num = 2;
        // Encontrar los primeros n números primos
        while (contadorPrimos < n) {
            boolean esPrimo = true;
            // Verificar si num es primo
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                System.out.print(num + " ");
                contadorPrimos++;
            }
            num++;
        }
    }
}
