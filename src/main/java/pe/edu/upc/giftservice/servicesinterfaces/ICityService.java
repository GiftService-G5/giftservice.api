package pe.edu.upc.giftservice.servicesinterfaces;

import pe.edu.upc.giftservice.entities.City;

import java.util.List;

public interface ICityService {
    public void insert(City cty);
    public void delete(int id);

    public List<City> list();
}
