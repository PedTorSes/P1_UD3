package com.ieschabas;
/**
 * Clase Main de Mayores donde vamos a solicitar dos números al usuario y luego los vamos a comparar para mostrar cuál de los dos es mayor.
 * @author Pedro Enrique Torres Sesé
 * @version 1.0
 */

import java.util.Scanner;

public class MayoresMain {
    /**
     * Solicitamos los números "a" y "b" al usuario
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Estás de suerte, vamos a introducir dos números y, como soy tan crack, te voy a devolver el mayor de ellos, sin coste alguno");
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuál será el primer número?");
        int a = scanner.nextInt();
        System.out.println("¿Cuál será el segundo número?");
        int b = scanner.nextInt();
        /**
         * Creamos la instancia a la clase Mayores para trabajar con los datos introducidos.
         */
        Mayores mayores = new Mayores();
        /**
         * Mostramos en pantalla el resultado de las operaciones realizadas en la clase Mayores.
         */
        System.out.println("El número mayor entre ambos dos es: "+mayores.max2(a, b));

        scanner.close();

    }
}
