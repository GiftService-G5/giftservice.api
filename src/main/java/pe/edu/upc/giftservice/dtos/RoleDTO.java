package pe.edu.upc.giftservice.dtos;

import pe.edu.upc.giftservice.entities.Users;

public class RoleDTO {
    private int idRole;
    private String nameRole;

    private Users usEr;

    public int getIdRole() {
        return idRole;
    }

    public void setIdRole(int idRole) {
        this.idRole = idRole;
    }

    public String getNameRole() {
        return nameRole;
    }

    public void setNameRole(String nameRole) {
        this.nameRole = nameRole;
    }

    public Users getUsEr() {
        return usEr;
    }

    public void setUsEr(Users usEr) {
        this.usEr = usEr;
    }
}
