package com.ieschabas;

/**
 * Clase Circunferencia donde desarrollaremos los cálculos necesarios para obtener el área y la longitud del círculo cuyo radio hemos solicitado en la clase CircunferenciaMain
 * @author Pedro Enrique Torres Sesé
 * Version 1.0
 */


public class Circunferencia {
    /**
     * Establecemos las variables necesarias: radio y pi.
     * PI lo extraemos de una clase que se llama Math y que ya tiene el número asignado.
     */
    double radio;
    double pi = Math.PI;

    /**
     * Método que muestra el valor de radio
     * @return radio
     */

    public double getRadio() {
        return radio;
    }

    /**
     * Método para calcular el área del círculo sabiendo que el área = pi * radio^2
     * DUDA: ¿Sería correcta esta anotación para evitar poner radio*radio?
     * @param radio
     * @return area
     */

    public double area (double radio) {
        double area = radio * radio * pi;
        return area;
    }

    /**
     * Método para calcular la longitud del círculo con radio dado
     * @param radio
     * @return longitud
     */

    public double longitud (double radio) {
        double longitud = 2 * pi * radio;
        return longitud;
    }

    /**
     * Método para mostar en pantalla el resultado del área y de la longitud
     * @param area
     * @param longitud
     */
    public void circunferencia (double area, double longitud) {
        System.out.println("El área del círculo es: " + area);
        System.out.println("La longitud del círculo es: " + longitud);
    }


}
