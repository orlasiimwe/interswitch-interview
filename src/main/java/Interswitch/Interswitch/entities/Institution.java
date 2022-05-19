package Interswitch.Interswitch.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import Interswitch.Interswitch.interfaces.NotEmpty;

@Entity
public class Institution {

    @Id
    @Column(nullable = false)
    private String institutionCode;

    @NotEmpty
    private String institutionName;

    // @OneToMany(mappedBy = "institution", cascade = CascadeType.ALL)
    // private List<User> user;

    public Institution(String institutionCode, String institutionName) {
        this.institutionCode = institutionCode;
        this.institutionName = institutionName;
    }

    public String getInstitutionCode() {
        return institutionCode;
    }

    public String getInstitutionName() {
        return institutionName;
    }

    public void setInstitutionCode(String institutionCode) {
        this.institutionCode = institutionCode;
    }

    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }

}
