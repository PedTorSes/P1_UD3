package com.ieschabas;
/**
 * Clase Main de AleatorioPar donde el usuario introducirá un número que será el límite y luego aparecerá en pantalla un número aleatorio dentro del límite
 * @author Pedro Enrique Torres Sesé
 * @version 1.0
 */

import java.util.Random;
import java.util.Scanner;

public class AleatorioParMain {
    public static void main(String[] args) {

        /**
         * Establecemos el Scanner para que nos detecte los datos del usuario
         * Establecemos Random para que el sistema genere un número aleatorio
         */
        Scanner sc = new Scanner(System.in);
        Random rng = new Random();
        int limite = -1;
        /**
         * Establecemos el comportamiento del while.
         * Primero solicitamos el número que asignaremos a la variable límite
         * Luego establecemos que si se introduce un número inferior a 0 nos salga un mensaje de error
         */
        while (limite <= 0) {
            System.out.print("Introduce un número límite positivo: ");
            if (sc.hasNextInt()) {
                limite = sc.nextInt();
                if (limite <= 0) {
                    System.out.println("El límite no puede ser un número negativo");
                }

            } else {
                System.out.println("Por favor, introduce un número válido.");
                sc.next(); // limpiar entrada inválida
            }
        }

        /**
         * Establecemos la variable numeroPar que nos recoge los datos del objeto y nos muestra en pantalla los resultados
         */

        AleatorioPar par = new AleatorioPar();
        int numeroPar = par.parAleatorioMenorQue(limite, rng);
        System.out.println("Número par aleatorio menor que " + limite + ": " + numeroPar);
    }
}
