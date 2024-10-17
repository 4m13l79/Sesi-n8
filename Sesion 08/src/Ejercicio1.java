import java.util.Scanner;
public class Ejercicio1 {
  public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.print("Ingrese un número para calcular su factorial: ");
        int numero = lectura.nextInt();
        long factorial = 1; 
        // Calcular el factorial usando un bucle for
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
}