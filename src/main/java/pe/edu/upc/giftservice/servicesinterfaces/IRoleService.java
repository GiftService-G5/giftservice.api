package pe.edu.upc.giftservice.servicesinterfaces;

import pe.edu.upc.giftservice.entities.Role;

import java.util.List;

public interface IRoleService {

    public void insert(Role rle);
    public List<Role> list();
}
