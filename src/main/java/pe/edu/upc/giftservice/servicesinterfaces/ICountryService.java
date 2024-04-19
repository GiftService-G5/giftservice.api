package pe.edu.upc.giftservice.servicesinterfaces;

import pe.edu.upc.giftservice.entities.Country;

import java.util.List;

public interface ICountryService {
    public void insert(Country cntry);
    public void delete(int id);

    public List<Country> list();
}
