package pe.edu.upc.giftservice.servicesinterfaces;

import pe.edu.upc.giftservice.entities.Users;

import java.util.List;

public interface IUserService {
    public void insert(Users usr);
    public void delete(int id);

    public List<Users> list();
}
