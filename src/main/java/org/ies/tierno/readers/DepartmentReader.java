package org.ies.tierno.readers;

import org.ies.tierno.pojos.Department;

import org.ies.tierno.pojos.Employee;

import java.util.Scanner;

public class DepartmentReader {

    public Department read(Scanner scanner) {
        System.out.println("Nombre del departamento:");
        String name = scanner.nextLine();

        System.out.println("Presupuesto del departamento:");
        double budget = Double.parseDouble(scanner.nextLine());

        System.out.println("Número de empleados en este departamento:");
        int employeeCount = Integer.parseInt(scanner.nextLine());

        Employee[] employees = new Employee[employeeCount];
        EmployeeReader er = new EmployeeReader();

        for (int i = 0; i < employeeCount; i++) {
            System.out.println("Empleado " + (i + 1) + ":");
            employees[i] = er.read(scanner);
        }

        return new Department(name, budget, employees);
    }
}
