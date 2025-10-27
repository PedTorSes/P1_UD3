package com.ieschabas;

/**
 * Clase AleatorioPar donde establecemos el método que tiene que seguir la clase AleatorioParMain
 * @author Pedro Enrique Torres Sesé
 * @version 1.0
 */

import java.util.Random;


    public class AleatorioPar {
        public int parAleatorioMenorQue(int limite, Random rng) {

            /**
             * Establecemos que el número límite nos muestre un mensaje de error si nos introducen un número negativo
             */
            if (limite <= 0) {
                throw new IllegalArgumentException("El límite no puede ser un número negativo");
            }

            /**
             * Establecemos la variable max que nos introduce el límite que fozamos a que sea par mediante el módulo
             */
            int max = (limite % 2 == 0) ? limite - 2 : limite - 1;
            int paresPosibles = (max / 2) + 1;
            /**
             * Generamos el número aleatorio en función de la cantidad que tiene el límite
             */
            int indice = rng.nextInt(paresPosibles);
            return indice * 2;
        }
    }
