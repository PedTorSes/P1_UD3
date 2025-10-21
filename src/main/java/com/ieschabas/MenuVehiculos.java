package com.ieschabas;

/**
 * Clase MenuVehiculos donde mostraremos en pantalla la selección que elija del menú mostrado en Main
 * @author Pedro Enrique Torres Sesé
 * @version 1.0
 */

public class MenuVehiculos {
    private int opcion;

    /**
     * Establecemos el constructor para la clase MenuVehiculos
     * @param opcion
     */
    public MenuVehiculos(int opcion){
    this.opcion = opcion;
}

    /**
     * Realizamos el switch para que nos muestre un mensaje u otro en función de la opción deseada en Main
     * @param opcion
     * @return Mensaje elección
     */
    public String seleccionarOpcion(int opcion){
    switch (opcion) {
        case 1:
            return " Ha elegido: Mantenimiento de clientes";
        case 2:
            return "Ha elegido: Introducción de facturas";
        case 3:
            return "Ha elegido: Listado de facturas";
        case 4:
            return "Ha elegido: Finalizar. Sayonara, baby";
        default:
            return "La opción no existe. Vuelve a intentarlo";
        }
    }
}
