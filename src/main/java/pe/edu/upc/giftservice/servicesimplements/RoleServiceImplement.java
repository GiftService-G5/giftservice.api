package pe.edu.upc.giftservice.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.giftservice.entities.Role;
import pe.edu.upc.giftservice.repositories.IRoleRepository;
import pe.edu.upc.giftservice.servicesinterfaces.IRoleService;
import java.util.List;

@Service
public class RoleServiceImplement implements IRoleService{
    @Autowired
    private IRoleRepository rleR;
    @Override
    public void insert(Role rle) { rleR.save(rle);}
    @Override
    public List<Role> list() {return rleR.findAll();}

    @Override
    public void delete(int id) {
        rleR.deleteById(id);
    }

}

