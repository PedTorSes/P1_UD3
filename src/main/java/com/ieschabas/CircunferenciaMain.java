package com.ieschabas;
/**
 * Clase Main de Circunferencia, donde vamos a solicitar un número positivo para asignarlo al radio y luego vamos a realizar los cálculos del área y longitud y los mostraremos por pantalla
 * @author Pedro Enrique Torres Sesé
 * version 1.0
 */

import java.util.Scanner;

/**
 * Establecemos el menú inicial del programa y solicitamos un número que asignaremos a la variable radio
 */
public class CircunferenciaMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vamos a realizar dos cálculos. El primero el área de un círculo y el segundo su longitud en función del radio que me aportes.");
        System.out.println("¿De qué medida es su radio? ");

       double radio = scanner.nextDouble();
        /**
         * Establecemos los parámetros que tiene que cumplir radio y, si no los cumple, solicitamos el número de nuevo mostrando un mensaje de error previamente.
         */

        if (radio < 0 ) {
            System.out.println("¿Seguro que se puede calcular un área o una longitud de un círculo con un radio negativo? ");
            System.out.println("Anda, introduce un dato positivo: ");
            radio = scanner.nextDouble();
        } else {
            System.out.println("Gracias, ahora procederemos al cálculo: ");

        }
        /**
         * Instanciamos la clase Circunferencia y creamos las variables double area y longitud para poder recuperar los datos de Circunferencia
         */

        Circunferencia circunferencia = new Circunferencia();
        double area = circunferencia.area(radio);
        double longitud = circunferencia.longitud(radio);
        /**
         * Mostramos en pantalla los resultados
         */
        circunferencia.circunferencia(area, longitud);

    }
}