/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoraconarreglos;
import java.util.Scanner;
/**
 *
 * @author labcca
 */
public class CalculadoraConArreglos {

    private static String producto;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] arreglo = {20.5, 40.6, 78.4, 94.7, 55.3, 22.6, 84.3};
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Elija una opcion:");
            System.out.println("1. Sumar elementos del arreglo");
            System.out.println("2. Multiplicar elementos del arreglo");
            System.out.println("3. Salir");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1 -> {
                    double suma = 0;
                    for (double elemento : arreglo) {
                        suma += elemento;
                    }
                    System.out.println("La suma de los elementos es: " + suma);
                }
                case 2 -> {
                    double multiplicar = 1;
                    for (double elemento : arreglo) {
                        multiplicar  *= elemento;
                    }
                    System.out.println("El producto de los elementos es: " + multiplicar);
                }
                case 3 -> System.out.println("Saliendo del programa sin decir groserias...");
                default -> System.out.println("Opcion no valida. Por favor, elija una opcion valida.");
            }
        } while (opcion != 3);
        System.out.println("Recomendacion de películas romanticas: 'Titanic', 'La La Land', 'Notting Hill', 'Before Sunrise', 'The Notebook', 'A dos metros de ti'");
    
}
  
}
