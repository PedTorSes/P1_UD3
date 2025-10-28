package com.ieschabas;
import java.util.Random;


    public class SumasAleatorias {

        Random rng;

        /**
         * Devolvemos la suma de dos números enteros entre el 0 y el 1000
         * @param rng a y rng b
         * @return suma de int a + int b
         */
        public int sumaDosAleatorios(Random rng) {
            int a = rng.nextInt(1001);
            int b = rng.nextInt(1001);
            return a + b;
        }

        /**
         * Establecemos el constructor
         * @param rng
         */

        public SumasAleatorias(Random rng) {
            this.rng = rng;
        }

        /**
         * Generamos un array en el que realiza sumas aleatorias según el número que se introduzca por consola
         */
        public int[] generarSumas(int repeticiones, Random rng) {
            if (repeticiones <= 0) {
                System.out.println("Las repeticiones no puede ser un número negativo");
            }
            /**
             * Creamos un array del tamaño del número de repeticiones
             */

            int[] resultados = new int[repeticiones];

            /**
             * Hacemos un recorrido por el array "resultados" guardando los datos de "sumaDosAleatorios"
             */
            for (int contador = 0; contador < repeticiones; contador++) {
                resultados[contador] = sumaDosAleatorios(rng);
            }
            return resultados;
        }
    }

