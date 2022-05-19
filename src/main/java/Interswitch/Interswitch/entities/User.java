package Interswitch.Interswitch.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import Interswitch.Interswitch.interfaces.NotEmpty;

@Entity
// @Table(name ="user")
public class User {
    @Id
    @Column(nullable = false)
    @SequenceGenerator(name = "user_sequence", sequenceName = "user_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_sequence")
    private Long id;

    @NotEmpty
    private String username;

    @NotEmpty
    private String firstName;

    @NotEmpty
    private String lastName;

    @NotEmpty
    private String email;

    private String password;

    @ManyToOne(optional = false)
    @JoinColumn(name = "userRole", nullable = false, referencedColumnName = "roleCode")
    private Role role;

    // @ManyToOne(optional = false)
    // @JoinColumn(name = "institution", nullable = false, referencedColumnName = "institutionCode")
    // private Institution institution;

    // @ManyToOne(optional = true)
    // @JoinColumn(name = "bankBranch", nullable = true, referencedColumnName = "bankCode")
    // private Bank bank;

    // @ManyToOne(optional = true)
    // @JoinColumn(name = "corporateType", nullable = true, referencedColumnName = "corporateId")
    // private Corporate corporate;

    // @ManyToOne(optional = true)
    // @JoinColumn(name = "department", nullable = true, referencedColumnName = "departmentCode")
    // private Department department;

    // @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    // private List<LeaveRequest> leaveRequest;

    public User(String username, String firstName, String lastName, String email, String password) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public Long getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    // A toString() is an in-built method in Java that returns the value given to it
    // in string format.
    // Overrides inbuilt java toString method that returns hashcode values of the
    // objects
    @Override
    public String toString() {
        return "User {" + "id:" + id + "firstName:" + firstName + "lastName:" + lastName + "email =" + email
                + "password" + "}";
    }

    public void addAttribute(String string, String string2) {
    }

}
