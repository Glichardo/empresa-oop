package org.ies.tierno.pojos;

import java.util.Arrays;

import java.util.Objects;

public class Company {
    private String companyName;
    private String cif;
    private Department[] department;

    public Company(String companyName, String cif, Department[] department) {
        this.companyName = companyName;
        this.cif = cif;
        this.department = department;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public Department[] getDepartment() {
        return department;
    }

    public void setDepartment(Department[] department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return Objects.equals(companyName, company.companyName) && Objects.equals(cif, company.cif) && Objects.deepEquals(department, company.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(companyName, cif, Arrays.hashCode(department));
    }

    @Override
    public String toString() {
        return "Company{" + "companyName='" + companyName + '\'' + ", cif='" + cif + '\'' + ", departaments=" + Arrays.toString(department) + '}';
    }
}
