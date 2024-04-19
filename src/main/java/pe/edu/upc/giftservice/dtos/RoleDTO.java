package pe.edu.upc.giftservice.dtos;

import pe.edu.upc.giftservice.entities.User;

public class RoleDTO {
    private int idRole;
    private String RoleName;

    private User usEr;

    public int getIdRole() {
        return idRole;
    }

    public void setIdRole(int idRole) {
        this.idRole = idRole;
    }

    public String getRoleName() {
        return RoleName;
    }

    public void setRoleName(String roleName) {
        RoleName = roleName;
    }

    public User getUsEr() {
        return usEr;
    }

    public void setUsEr(User usEr) {
        this.usEr = usEr;
    }
}
