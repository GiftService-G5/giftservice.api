package pe.edu.upc.giftservice.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRole;

    @Column(name = "RoleName", nullable = false, length = 20)
    private String RoleName;

    @ManyToOne
    @JoinColumn(name = "userId")
    private Users usEr;

    public Role(){
    }

    public Role(int idRole, String roleName, Users usEr) {
        this.idRole = idRole;
        RoleName = roleName;
        this.usEr = usEr;
    }

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
