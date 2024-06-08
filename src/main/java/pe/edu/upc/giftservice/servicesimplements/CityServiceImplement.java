package pe.edu.upc.giftservice.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.giftservice.entities.City;
import pe.edu.upc.giftservice.repositories.ICityRepository;
import pe.edu.upc.giftservice.servicesinterfaces.ICityService;

import java.util.List;

@Service
public class CityServiceImplement implements ICityService {
    @Autowired
    private ICityRepository cTRY;

    @Override
    public void insert(City cty) {
        cTRY.save(cty);
    }

    @Override
    public void delete(int id) {
        cTRY.deleteById(id);
    }

    @Override
    public List<City> list() {
        return cTRY.findAll();
    }
}
