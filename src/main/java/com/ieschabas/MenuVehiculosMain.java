package com.ieschabas;
import java.util.Scanner;

/**
 *Clase Main de MenuVehiculos donde solicitamos una opción que corresponde a un menú diferente o muestra un error
 * @author Pedro Torres Sesé
 * @version 1.0
 */

public class MenuVehiculosMain {
    public static void main(String[] args) {

        /**
         * Establecemos el menú de referencia para que el usuario pueda seleccionar la opción
         */
        System.out.println("Bienvenid@ al menú del programa");
        System.out.println("¿Qué opción desea elegir?");
        System.out.println("1 - Mantenimento de clientes");
        System.out.println("2 - Introducción de facturas");
        System.out.println("3 - Listado de facturas");
        System.out.println("4 - Finalizar");
        /**
         * Habilitamos que el usuario pueda introducir un número
         */
        Scanner scanner = new Scanner(System.in);

        /**
         * Establecemos la variable selección en función del dato introducido
         */

        int seleccion = scanner.nextInt();
        /**
         * Creamos el objeto para la clase MenuVehiculos
         */
        MenuVehiculos menu = new MenuVehiculos(seleccion);

        /**
         * Establecemos como String resultado el caso del switch que corresponde a la opción ingresada
         */
        String resultado = menu.seleccionarOpcion(seleccion);

        // Mostrar en pantalla
        System.out.println(resultado);


    }

}