package org.ies.tierno.pojos;

import java.sql.Array;
import java.util.Arrays;
import java.util.Objects;

public class Company {
    private String companyName;
    private String cif;
    private Department[] departaments;

    public Company(String companyName, String cif, Department[] departaments) {
        this.companyName = companyName;
        this.cif = cif;
        this.departaments = departaments;
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

    public Department[] getDepartaments() {
        return departaments;
    }

    public void setDepartaments(Department[] departaments) {
        this.departaments = departaments;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return Objects.equals(companyName, company.companyName) && Objects.equals(cif, company.cif) && Objects.deepEquals(departaments, company.departaments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(companyName, cif, Arrays.hashCode(departaments));
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                ", cif='" + cif + '\'' +
                ", departaments=" + Arrays.toString(departaments) +
                '}';
    }
}
