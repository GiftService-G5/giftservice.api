package pe.edu.upc.giftservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.giftservice.entities.Product;

import java.util.List;

@Repository
public interface IProductRepository extends JpaRepository<Product,Integer> {
    @Query("from Product p WHERE p.category.nameCategory =:nombreC")
    public List<Product> productByNameCategory(@Param("nombreC") String nombreC);
    @Query("from Product p WHERE p.entrepreneurship.nameEntrepreneurship =:nombreE")
    public List<Product> productByNameEntrepreneurship(@Param("nombreE") String nombreE);
    @Query("from Product p WHERE p.nameProduct LIKE %:nombreP%")
    public List<Product> productByName(String nombreP);
}
