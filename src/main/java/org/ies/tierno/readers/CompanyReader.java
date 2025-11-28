package org.ies.tierno.readers;

import org.ies.tierno.pojos.Company;
import org.ies.tierno.pojos.Department;

import java.util.Scanner;

public class CompanyReader {

    public Company read(Scanner scanner) {
        System.out.println("Introduce nombre de la empresa:");
        String name = scanner.nextLine();

        System.out.println("Introduce CIF de la empresa:");
        String cif = scanner.nextLine();

        System.out.println("Introduce número de departamentos:");
        int departmentCount = Integer.parseInt(scanner.nextLine());

        Department[] departments = new Department[departmentCount];
        DepartmentReader dr = new DepartmentReader();

        for (int i = 0; i < departmentCount; i++) {
            System.out.println("Departamento " + (i + 1) + ":");
            departments[i] = dr.read(scanner);
        }

        return new Company(name, cif, departments);
    }
}
