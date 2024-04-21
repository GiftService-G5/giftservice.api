package pe.edu.upc.giftservice.dtos;

import pe.edu.upc.giftservice.entities.Users;

public class RoleDTO {
    private int idRole;
    private String RoleName;

    private Users usEr;

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

    public Users getUsEr() {
        return usEr;
    }

    public void setUsEr(Users usEr) {
        this.usEr = usEr;
    }
}
