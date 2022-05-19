package Interswitch.Interswitch.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import Interswitch.Interswitch.interfaces.NotEmpty;

@Entity
public class Corporate {
    @Id
    @Column(nullable = false)
    private String corporateId;

    @NotEmpty
    private String type;

    // @OneToMany(mappedBy = "corporate", cascade = CascadeType.ALL)
    // private List<User> user;

    public Corporate(String corporateId, String type) {
        this.corporateId = corporateId;
        this.type = type;
    }

    public String getCorporateId() {
        return corporateId;
    }

    public void setCorporateId(String corporateId) {
        this.corporateId = corporateId;
    }

    public String getType() {
        return type;

    }

    public void setType(String type) {
        this.type = type;
    }
}
