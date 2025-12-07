package org.ies.tierno.readers;

import org.ies.tierno.pojos.Employee;

import java.util.Scanner;

public class EmployeeReader {

    public Employee read(Scanner scanner) {
        System.out.println("NIF del empleado:");
        String nif = scanner.nextLine();

        System.out.println("Nombre del empleado:");
        String name = scanner.nextLine();

        System.out.println("Apellidos del empleado:");
        String surname = scanner.nextLine();

        System.out.println("Puesto del empleado:");
        String position = scanner.nextLine();

        return new Employee(nif, name, surname, position);
    }
}
