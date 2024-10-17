import java.util.Scanner;
public class Ejercicio3 {
public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int suma = 0;
        int contador = 0;
        char continuar;
        // Bucle do-while para ingresar varios números
        do {
            System.out.print("Ingrese un número: ");
            int numero = lectura.nextInt();
            suma += numero;
            contador++;
            // Preguntar si quiere continuar
            System.out.print("?Desea continuar ingresando números? (s/n): ");
            continuar = lectura.next().charAt(0);
        } while (continuar == 's' || continuar == 'S');
        // Bucle for para calcular y mostrar la media
        for (int i = 1; i <= 1; i++) {
            if (contador > 0) {
                double media = (double) suma / contador;
                System.out.println("La media de los números ingresados es: " + media);
            }
        }
    }
}
