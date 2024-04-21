package pe.edu.upc.giftservice.servicesinterfaces;

import pe.edu.upc.giftservice.entities.PersonalizedDetail;

import java.util.List;

public interface IPersonalizedDetailService {
    public void insert(PersonalizedDetail pd);

    public List<PersonalizedDetail> list();

    public void delete(int id);
    public PersonalizedDetail listId(int id);

}
