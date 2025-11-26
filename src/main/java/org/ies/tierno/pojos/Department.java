package org.ies.tierno.pojos;

import java.util.Arrays;
import java.util.Objects;

public class Department {
    private String departmentName;
    private double budget;
    private Employee[] employees;

    public Department(String departmentName, double budget, Employee[] employees) {
        this.departmentName = departmentName;
        this.budget = budget;
        this.employees = employees;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Double.compare(budget, that.budget) == 0 && Objects.equals(departmentName, that.departmentName) && Objects.deepEquals(employees, that.employees);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departmentName, budget, Arrays.hashCode(employees));
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentName='" + departmentName + '\'' +
                ", budget=" + budget +
                ", employees=" + Arrays.toString(employees) +
                '}';
    }
}
