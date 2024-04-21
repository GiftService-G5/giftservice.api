package pe.edu.upc.giftservice.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.giftservice.entities.Category;
import pe.edu.upc.giftservice.entities.Product;
import pe.edu.upc.giftservice.repositories.IProductRepository;
import pe.edu.upc.giftservice.servicesinterfaces.IProductService;

import java.util.List;

@Service
public class ProductServiceImplement implements IProductService {
    @Autowired
    private IProductRepository pR;
    @Override
    public void insert(Product r) {
        pR.save(r);
    }

    @Override
    public List<Product> list() {
        return pR.findAll();
    }

    @Override
    public void delete(int id) {
        pR.deleteById(id);
    }

    @Override
    public Product listID(int id) {
        return pR.findById(id).orElseThrow();
    }

    @Override
    public void update(Integer id, Product product) {
        Product encontrado = pR.findById(id).orElseThrow();
        encontrado.setNameProduct(product.getNameProduct());
        encontrado.setPriceProduct(product.getPriceProduct());
        encontrado.setDescriptionProduct(product.getDescriptionProduct());
        encontrado.setStockProduct(product.getStockProduct());
        pR.save(encontrado);
    }
    public List<Product> productByNameCategory(String nombreC) {
        return pR.productByNameCategory(nombreC);
    }

    @Override
    public List<Product> productByNameEntrepreneurship(String nombreE) {
        return pR.productByNameEntrepreneurship(nombreE);
    }

    @Override
    public List<Product> productByName(String nombreP) {
        return pR.productByName(nombreP);
    }


}
