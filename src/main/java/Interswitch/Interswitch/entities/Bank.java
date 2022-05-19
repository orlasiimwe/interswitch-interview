package Interswitch.Interswitch.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import Interswitch.Interswitch.interfaces.NotEmpty;
@Entity
public class Bank {

    @Id
    @Column(nullable = false)
    private String bankCode;

    @NotEmpty
    private String bankName;

    // @OneToMany(mappedBy = "bank", cascade = CascadeType.ALL)
    // private List<User> user;

    public String getBankCode() {
        return bankCode;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

}
