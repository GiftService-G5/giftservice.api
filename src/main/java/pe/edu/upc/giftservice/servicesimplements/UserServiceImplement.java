package pe.edu.upc.giftservice.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.giftservice.entities.Users;
import pe.edu.upc.giftservice.repositories.IUserRepository;
import pe.edu.upc.giftservice.servicesinterfaces.IUserService;

import java.util.List;

@Service
public class UserServiceImplement implements IUserService {
    @Autowired
    private IUserRepository usR;

    @Override
    public void insert(Users usr) {
        usR.save(usr);
    }

    @Override
    public void delete(int id) {
        usR.deleteById(id);
    }

    @Override
    public List<Users> list() {
        return usR.findAll();
    }

    @Override
    public Users listId(Integer idUsuario){
        return usR.findById(idUsuario).orElse(new Users());
    }
}
