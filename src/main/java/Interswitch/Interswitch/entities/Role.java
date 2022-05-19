package Interswitch.Interswitch.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.OneToMany;


@Entity
public class Role {
    @Id
    private String roleCode;

    private String roleName;

    private String roleDesc;

    @OneToMany(mappedBy = "role")
    private List<User> user;

    public Role(String roleCode, String roleName, String roleDesc) {
        this.roleCode = roleCode;
        this.roleName = roleName;
        this.roleDesc = roleDesc;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

}
