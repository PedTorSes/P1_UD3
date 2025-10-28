package com.ieschabas;
/**
 * Clase MayoresAleatorios3 donde vamos a establecer los métodos para que nos genere tres números aleatorios entre el 0 y 1000
 * Que nos establezca cuál es el mayor de los números generados
 * Que se repita durante la cantidad de veces que nos haya solicitado el usuario
 * @author Pedro Enrique Torres Sesé
 * @version 1.0
 */

import java.util.Random;

public class MayoresAleatorios3 {
    /**
     * Establecemos la variable random para crear números aleatorios
     */
    Random rng;
    /**
     * Creamos el constructor MayoresAleatorios para hacer público el parámetro rng
     * @param rng
     */
    public MayoresAleatorios3(Random rng) {
        this.rng = rng;
    }
    /**
     * Establecemos la lógica para extraer el número mayor de los tres números aleatorios generados
     * @param a
     * @param b
     * @param c
     * @return numMayor
     */
    public int max3(int a, int b, int c) {
        int numMayor;
        if (a < b && b < c) {
            numMayor = c;
        } else if (a < b && b > c) {
            numMayor = b;
        } else {
            numMayor = a;
        }
        return numMayor;
    }
    /**
     * Establecemos cuántas veces se va a repetir el código y el mensaje que tiene que mostrar por pantalla
     * @param repeticiones
     * @return mayores
     */
    public int[] generarMaximos3(int repeticiones) {
        int[] mayores = new int[repeticiones];
        for (int contador = 0; contador < repeticiones; contador++) {
            int a = rng.nextInt(1001);
            int b = rng.nextInt(1001);
            int c = rng.nextInt(1001);
            int mayor = max3(a, b, c);
            mayores[contador] = mayor;
            System.out.println("De los números (" + a + ", " + b + ", " + c + "), el mayor es: " + mayor);
        }
        return mayores;
    }
}
