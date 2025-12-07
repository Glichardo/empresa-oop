package org.ies.tierno.app;

import org.ies.tierno.pojos.Company;

import org.ies.tierno.pojos.Department;

import org.ies.tierno.pojos.Employee;

import org.ies.tierno.readers.CompanyReader;

import java.util.Scanner;

public class CompanyApp {
    public static Scanner scanner = new Scanner(System.in);
    private Company company;

    public void run() {

        startMessage();
        askForData();
        showMenu();

    }

    public void showMenu() { //bucle con menú
        int option;
        do {
            System.out.println("Selecciona una opción:");
            System.out.println("1. Mostrar datos de un departamento");
            System.out.println("2. Mostrar empleados de un departamento");
            System.out.println("3. Buscar empleado por NIF en un departamento");
            System.out.println("4. Salir");
            System.out.print("Opción: ");

            option = scanner.nextInt();
            scanner.nextLine();

            if (option == 1) {
                System.out.println("Departamentos disponibles:");
                for (Department d : company.getDepartment()) {
                    System.out.println("- " + d.getDepartmentName());
                }
                System.out.println("Introduce el nombre del departamento: ");
                String deptName = scanner.nextLine();
                Department dept = findDepartment(deptName);
                if (dept == null) {
                    System.out.println("No se encuentra el departamento");
                } else {
                    System.out.println("Datos del departamento:");
                    System.out.println("Nombre: " + dept.getDepartmentName());
                    System.out.println("Presupuesto: " + dept.getBudget());
                    System.out.println("Empleados:");
                    Employee[] employees = dept.getEmployees();
                    for (int i = 0; i < employees.length; i++) {
                        System.out.println((i + 1) + ". " + employees[i]);
                    }
                }

            } else if (option == 2) {
                System.out.println("Departamentos disponibles:");
                for (Department d : company.getDepartment()) {
                    System.out.println("- " + d.getDepartmentName());
                }
                System.out.println("Introduce el nombre del departamento: ");
                String deptName = scanner.nextLine();
                Department dept = findDepartment(deptName);
                if (dept == null) {
                    System.out.println("No se encuentra el departamento");
                } else {
                    System.out.println("Empleados del departamento " + dept.getDepartmentName() + ":");
                    Employee[] employees = dept.getEmployees();
                    for (int i = 0; i < employees.length; i++) {
                        System.out.println((i + 1) + ". " + employees[i]);
                    }
                }

            } else if (option == 3) {
                System.out.println("Departamentos disponibles:");
                for (Department d : company.getDepartment()) {
                    System.out.println("- " + d.getDepartmentName());
                }
                System.out.println("Introduce el nombre del departamento: ");
                String deptName = scanner.nextLine();
                Department dept = findDepartment(deptName);
                if (dept == null) {
                    System.out.println("No existe el departamento");
                } else {
                    System.out.println("Empleados disponibles en " + dept.getDepartmentName() + ":");
                    for (Employee e : dept.getEmployees()) {
                        System.out.println("- " + e.getNif());
                    }
                    System.out.println("Introduce el NIF del empleado: ");
                    String nif = scanner.nextLine();
                    Employee emp = findEmployeeInDepartment(dept, nif);
                    if (emp == null) {
                        System.out.println("No se encuentra el empleado en el departamento");
                    } else {
                        System.out.println("Empleado encontrado:");
                        System.out.println(emp);
                    }
                }

            } else if (option < 1 || option > 4) {
                System.out.println("Opción inválida. Inténtalo de nuevo.");
            }

        } while (option != 4);
    }

    private Department findDepartment(String name) { //buscar departamento por nombre
        for (Department d : company.getDepartment()) {
            if (d.getDepartmentName().equalsIgnoreCase(name)) return d;
        }
        return null;
    }

    private Employee findEmployeeInDepartment(Department dept, String nif) {  //buscar empleado en departamento por nif
        for (Employee e : dept.getEmployees()) {
            if (e.getNif().equalsIgnoreCase(nif)) return e;
        }
        return null;
    }

    public static void main(String[] args) {
        new CompanyApp().run();
    }

    public static void startMessage() { //mensaje al ejecutar
        System.out.println("Introduce los datos de la empresa en orden:");
        System.out.println("Nombre de la empresa, CIF, número de departamentos.");
    }

    public void askForData() { // pedimos datos de la empresa
        CompanyReader cr = new CompanyReader();
        company = cr.read(scanner);

        System.out.println("Datos introducidos correctamente");

    }
}
