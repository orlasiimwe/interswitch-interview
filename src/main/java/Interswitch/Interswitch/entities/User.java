package Interswitch.Interswitch.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

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

    @ManyToOne
    @JoinColumn(name = "roleCode", insertable = false, updatable = false)
    private Role role;

    private String roleCode;

    @ManyToOne
    @JoinColumn(name = "institutionCode", insertable = false, updatable = false)
    private Institution institution;

    private String institutionCode;

    @ManyToOne
    @JoinColumn(name = "departmentCode", insertable = false, updatable = false)
    private Department department;

    private String departmentCode;
    public String getDepartmentCode() {
        return departmentCode;
    }
    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    public String getInstitutionCode() {
        return institutionCode;
    }
    public void setInstitutionCode(String institutionCode) {
        this.institutionCode = institutionCode;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    // @ManyToOne
    // @JoinColumn(name = "userRole")
    // private Role role;

    // @OneToMany(targetEntity = Role.class, cascade = CascadeType.ALL)
    // @JoinColumn(name = "userRole", referencedColumnName = "roleCode")
    // private List<Role> role;

    // @ManyToOne(fetch = FetchType.LAZY)
    // @JoinColumn(name = "userRole",referencedColumnName = "roleCode")
    // private Role role;

    // @ManyToOne(fetch = FetchType.LAZY)
    // @JoinColumn(name = "institution",referencedColumnName = "institutionCode")
    // private Institution institution;

    // @ManyToOne(optional = true)
    // @JoinColumn(name = "bankBranch", nullable = true, referencedColumnName =
    // "bankCode")
    // private Bank bank;

    // @ManyToOne(optional = true)
    // @JoinColumn(name = "corporateType", nullable = true, referencedColumnName =
    // "corporateId")
    // private Corporate corporate;

    // @ManyToOne(optional = true)
    // @JoinColumn(name = "department", nullable = true, referencedColumnName =
    // "departmentCode")
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
