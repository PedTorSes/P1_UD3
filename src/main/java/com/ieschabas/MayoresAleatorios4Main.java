package com.ieschabas;
/**
 * Clase Main de MayoresAleatorios4 donde vamos a solicitarle al usuario que introduzca una cantidad de repeticiones para el bucle que va a generar cuatro números aleatorios
 * @author Pedro Enrique Torres Sesé
 * version 1.0
 */
/**
 * Importamos las clases necesarias para la actividad
 */
import java.util.Random;
import java.util.Scanner;
public class MayoresAleatorios4Main {
    public static void main(String[] args) {
        /**
         * Establecemos las variables
         */
        Scanner scanner = new Scanner(System.in);
        Random rng = new Random();
        int repeticiones = -1;
        /**
         * Creamos el menú para solicitar la cantidad de repeticiones que quiere el usuario estableciendo como mínimo 1 y máximo 20
         * En el caso que no se introduzca un número permitido saldrá el mensaje de error
         */
        while (repeticiones <= 0) {
            System.out.print("Introduce el número (positivo) de repeticiones (como máximo acepto 20): ");
            if (scanner.hasNextInt()) {
                repeticiones = scanner.nextInt();
                if (repeticiones <= 0 || repeticiones > 20) {
                    System.out.println("Las repeticiones no pueden ser un número negativo ni tampoco un número superior a 20, lee el enunciado que está explicado anteriormente");
                }
            } else {
                System.out.println("Por favor, introduce un número válido.");
                scanner.next();
            }
        }
        /**
         * Instanciamos la clase MayoresAleatorios4 para acceder a los procesos de la clase MayoresAleatorios4 y nos los muestre en pantalla
         */
        MayoresAleatorios4 generador = new MayoresAleatorios4(rng);
        int[] mayores = generador.generarMaximos4(repeticiones);
        scanner.close();
    }
}
