import java.util.Scanner;
public class Programa3 {
public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de personas: ");
        int n = lectura.nextInt();
        lectura.nextLine(); // Consumir el salto de línea
        String nombreMayorTalla = "";
        double mayorTalla = 0.0;
        int contadorMasculino = 0;
        int contadorFemenino = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese los datos de la persona " + (i + 1) + ":");        
            System.out.print("Nombre: ");
            String nombre = lectura.nextLine();       
            System.out.print("Sexo (M/F): ");
            char sexo = lectura.nextLine().charAt(0);
            System.out.print("Talla: ");
            double talla = lectura.nextDouble();
            lectura.nextLine(); // Consumir el salto de línea
            // Contar personas por sexo
            if (sexo == 'M' || sexo == 'm') {
                contadorMasculino++;
            } else if (sexo == 'F' || sexo == 'f') {
                contadorFemenino++;
            }
            // Comparar la talla
            if (talla > mayorTalla) {
                mayorTalla = talla;
                nombreMayorTalla = nombre;
            }
        }
        // Mostrar resultados
        System.out.println("\nCantidad de personas de sexo masculino: " + contadorMasculino);
        System.out.println("Cantidad de personas de sexo femenino: " + contadorFemenino);
        System.out.println("La persona con la mayor talla es: " + nombreMayorTalla + " con una talla de " + mayorTalla);
    }
}
