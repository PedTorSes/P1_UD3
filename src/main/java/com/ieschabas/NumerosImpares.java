package com.ieschabas;

/**
 * Clase NumerosImpares donde calculamos la multiplicación de los 10 primeros números impares.
 */

public class NumerosImpares {

    /**
     * Establecemos las variables numerosImpares y el aumento para su posterior procesado
     */

    private long numerosImpares = 1;
    private int aumento = 1;

    public long productoDiezPrimerosImpares(){
        /**
         * Utilizamos el for donde I es el contador que irá de 0 a 10
         */
        for (int i = 0; i < 10; i++) {
            numerosImpares = numerosImpares * aumento;
            aumento = aumento +2;

        }
        return numerosImpares;
    }






}
