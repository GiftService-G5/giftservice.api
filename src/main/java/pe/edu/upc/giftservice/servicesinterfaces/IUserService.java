package pe.edu.upc.giftservice.servicesinterfaces;

import pe.edu.upc.giftservice.entities.User;

import java.util.List;

public interface IUserService {
    public void insert(User usr);
    public void delete(int id);

    public List<User> list();
}
