import java.util.Scanner;

public class Act7Github {

    public static void main(String[] args) {

        // Creamos un arreglo que almacenará los números
        int[] numeros = new int[20];

        // Crear un objeto Scanner para leer desde el teclado
        Scanner lectura = new Scanner(System.in);

        //Leer los 20 números que ingresará el usuario
        for (int i = 0; i < 20; i++) {
            System.out.print("Ingrese el número #" + (i + 1) + " : ");
            numeros[i] = lectura.nextInt();
        }

        System.out.println();

        // Mensaje inicial
        System.out.println("A continuación se presentarán los elementos del arreglo con su respectivo cuadrado y cubo:");
        System.out.println("---------------------------------------------------------------");

        // Mostrar cada número junto con su cuadrado y cubo, añadiendo también una separación para mejor visibilidad
        for (int i = 0; i < 20; i++) {
            int numero = numeros[i];
            int cuadrado = numero * numero;
            int cubo = numero * numero * numero;
            System.out.printf("Número: %d, Cuadrado: %d, Cubo: %d%n", numero, cuadrado, cubo);
            System.out.println("---------------------------------------------------------------");
        }


    }
}