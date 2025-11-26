package org.ies.tierno.app;

import java.util.Scanner;

public class CompanyApp {
    public static Scanner scanner = new Scanner(System.in);
    public void run(){

        //Pedimos datos de la empresa:

        //Bucle del menu:
        int option;
        do {
            System.out.println("Selecciona una opción:");
            System.out.println("1. Mostrar datos de un departamento");
            System.out.println("2. Mostrar empleados de un departamento");
            System.out.println("3. Buscar empleado por NIF en un departamento");
            System.out.println("4. Salir");
            option = scanner.nextInt();
            scanner.nextLine();
            if (option == 1){

            } else if (option == 2){

            } else if (option == 3) {

            } else if (option < 1 || option > 4){
                System.out.println("Opción inválida. Inténtalo de nuevo.");
                option = scanner.nextInt();
                scanner.nextLine();
            }
        } while (option != 4);
    }
}
