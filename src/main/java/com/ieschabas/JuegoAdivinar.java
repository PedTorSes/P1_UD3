package com.ieschabas;

/**
 * Clase JuegoAdivinar en la que tendremos todos los métodos para el juego
 * @author Pedro Torres Sesé
 * @version 1.0
 */

public class JuegoAdivinar {
    /**
     * Establecemos las variables secreto e intentosRealizados
     */
    private int secreto;
    private int intentosRealizados;
    /**
     * Establecemos el constructor para la clase
     * @param secreto
     */
    public JuegoAdivinar(int secreto) {
        this.secreto = secreto;
        this.intentosRealizados = 0;
    }
    /**
     * Establecemos el método evaluarIntento donde vamos a comprobar si el número introducido y el generado aleatorio y le proporcionamos una pista para que le sea más sencillo encontrar el número en cuestión
     * @param intento
     */
    public void evaluarIntento(int intento) {
        intentosRealizados++;
        if (intento < secreto) {
            System.out.println("Va, una pista. El número es mayor. Has realizado " + intentosRealizados + " intentos");
        } else if (intento > secreto) {
            System.out.println("Va, una pista. El número es menor. Has realizado " + intentosRealizados + " intentos");
        } else {
            System.out.println("¡Olé! ¡Has acertado!");
        }
    }
    /**
     * Establecemos la variable jugar que registra un array de intentos para registrar el contador de intentos
     * @param intentos
     * @return
     */
    public int jugar(int[] intentos) {
        for (int contador = 0; contador < intentos.length; contador++) {
            int intento = intentos[contador];
            evaluarIntento(intento);
            if (intento == secreto) {
                return intentosRealizados;
            }
        }
        return -1;
    }
}
