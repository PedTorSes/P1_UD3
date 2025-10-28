package com.ieschabas;
/**
 * Clase Main de JuegoAdivinar donde el programa va a generar un número aleatorio entre el 0 y el 10 y el usuario lo tiene que adivinar.
 * @author Pedro Enrique Torres Sesé
 * @version 1.0
 */

/**
 * Importamos las clases necesarias
 */

import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinarMain {

    /**
     * Establecemos el menú para introducir al usuario al juego
     */
    public static void main(String[] args) {
        System.out.println("Vamos a jugar a un juego");
        System.out.println("He pensado un número entre el 0 y el 10. Intenta adivinarlo.");
        /**
         * Generamos el número aleatorio y lo asignamos a una variable
         */
        Random rng = new Random();
        int secreto = rng.nextInt(11);
        /**
         * Solicitamos el dato al usuario e instanciamos la clase JuegoAdivinar para procesar la información introducida
         */

        Scanner scanner = new Scanner(System.in);
        JuegoAdivinar juego = new JuegoAdivinar(secreto);

        /**
         * Establecemos las variables intento y resultado para procesar la cantidad de intentos que ha realizado el usuario
         */
        int intento = 0;
        int resultado = -1;
        /**
         * Desarrollamos el bucle que queremos que se realice siempre y cuando el usuario no acierte
         */

        while (resultado == -1) {
            intento = scanner.nextInt();
            resultado = juego.jugar(new int[]{intento});
        }

        scanner.close();
    }
}