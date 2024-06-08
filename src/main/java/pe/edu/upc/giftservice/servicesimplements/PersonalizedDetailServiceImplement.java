package pe.edu.upc.giftservice.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.giftservice.entities.PersonalizedDetail;
import pe.edu.upc.giftservice.repositories.IPersonalizedDetailRepository;
import pe.edu.upc.giftservice.servicesinterfaces.IPersonalizedDetailService;

import java.util.List;

@Service
public class PersonalizedDetailServiceImplement implements IPersonalizedDetailService {
    @Autowired
    private IPersonalizedDetailRepository iR;
    @Override
    public void insert(PersonalizedDetail pd) {
        iR.save(pd);
    }

    @Override
    public List<PersonalizedDetail> list() {
        return iR.findAll();
    }

    @Override
    public void delete(int id) {
        iR.deleteById(id);
    }

    @Override
    public PersonalizedDetail listId(int id) {
        return iR.findById(id).orElseThrow();
    }
}
