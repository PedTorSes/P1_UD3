package com.ieschabas;

/**
 * Clase Main de NumerosImpares donde vamos a mostrar en pantalla el resultado de la multiplicación de los 10 primeros números impares
 * @author Pedro Enrique Torres Sesé
 * @version 1.0
 */

public class NumerosImparesMain {
    public static void main(String[] args) {
        System.out.println("Vamos a ver cuál es el resultado de multiplicar los 10 primeros números impares:");
/**
 * Establecemos el objeto de la clase NumerosImpares para que nos muestre el resultado
 */
        NumerosImpares numerosImpares = new NumerosImpares();
        System.out.println(numerosImpares.productoDiezPrimerosImpares());

    }
}
