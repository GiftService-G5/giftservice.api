package pe.edu.upc.giftservice.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.giftservice.entities.Country;
import pe.edu.upc.giftservice.repositories.ICountryRepository;
import pe.edu.upc.giftservice.servicesinterfaces.ICountryService;
import java.util.List;

@Service
public class CountryServiceImplement implements ICountryService {
    @Autowired
    private ICountryRepository cntrY;
    @Override
    public void insert(Country cntry) { cntrY.save(cntry);}

    @Override
    public void delete(int id) { cntrY.deleteById(id);}

    @Override
    public List<Country> list() {
        return cntrY.findAll();
    }
}
