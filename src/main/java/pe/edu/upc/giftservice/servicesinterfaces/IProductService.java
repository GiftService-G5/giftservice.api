package pe.edu.upc.giftservice.servicesinterfaces;

import org.springframework.data.repository.query.Param;
import pe.edu.upc.giftservice.entities.Entrepreneurship;
import pe.edu.upc.giftservice.entities.Product;

import java.util.List;

public interface IProductService {
    public void insert(Product r);
    public List<Product> list();
    public void delete(int id);
    public Product listID(int id);
    public void update(Integer id, Product product);
    public List<Product> productByNameCategory( String nombreC);
    public List<Product> productByNameEntrepreneurship(String nombreE);
    public List<Product> productByName(String nombreP);
}

