package com.ieschabas;
/**
 * Clase Main de SumasAleatorias donde vamos a solicitar al usuario
 */

import java.util.Random;
import java.util.Scanner;

    public class SumasAleatoriasMain {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random rng = new Random();
            int repeticiones = -1;

            /**
             * Solicitamos y verificamos que el número introducido por el usuario corresponde con los parámetros solicitados.
             */
            while (repeticiones <= 0 || repeticiones > 20) {
                System.out.print("Introduce el número de repeticiones (como máximo es 20): ");
                if (scanner.hasNextInt()) {
                    repeticiones = scanner.nextInt();
                    /**4
                     * Establecemos los mensajes de error en el caso de que el usuario introduzca un número negativo
                     */
                    if (repeticiones <= 0) {
                        System.out.println("Las repeticiones no puede ser un número negativo");
                    } else if (repeticiones > 20) {
                        System.out.println("El número máximo de repeticiones permitido es 20, a ver si leemos: ");
                    }
                } else {
                    System.out.println("Por favor, introduce un número válido.");
                    scanner.next();
                }
            }

            /**
             * Con esto establecemos la cantidad de veces que tiene que sumar el número
             */
            SumasAleatorias sumador = new SumasAleatorias(rng);
            int[] sumas = sumador.generarSumas(repeticiones,rng);

            /**
             * Mostramos los resultados de la operación en pantalla
             */
            System.out.println("Resultados de las sumas aleatorias:");
            for (int i = 0; i < sumas.length; i++) {
                System.out.println("Suma " + (i + 1) + ": " + sumas[i]);
            }
        }
    }
