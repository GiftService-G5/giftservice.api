package pe.edu.upc.giftservice.servicesinterfaces;

import pe.edu.upc.giftservice.entities.Entrepreneurship;

import java.util.List;

public interface IEntrepreneurshipService {
    public void insert(Entrepreneurship entrepreneurship);
    public List<Entrepreneurship> list();
    public Entrepreneurship getById(Long id);
    public void update(Entrepreneurship entrepreneurship);
    public void delete(Long id);
}
