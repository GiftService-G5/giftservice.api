package pe.edu.upc.giftservice.servicesinterfaces;

import pe.edu.upc.giftservice.entities.Category;

import java.util.List;

public interface ICategoryService {
    public void save(Category category);
    public List<Category> list();
    public Category getById(Long id);
    public void update(Category category);
    public void delete(Long id);
}
