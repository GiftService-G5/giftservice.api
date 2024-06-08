package pe.edu.upc.giftservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.giftservice.entities.Entrepreneurship;

import java.util.List;

@Repository
public interface IEntrepreneurshipRepository extends JpaRepository<Entrepreneurship, Long> {
    @Query(value = "SELECT \n" +
            "    pd.name_personalized_detail AS Personalization,\n" +
            "    COUNT(p.id_product) AS UsageCount \n" +
            "FROM \n" +
            "    entrepreneurships e \n" +
            "INNER JOIN \n" +
            "    product p ON p.entrepreneurship_id = e.id \n" +
            "INNER JOIN \n" +
            "    personalized_detail pd ON p.personalized_detail_id = pd.id_personalized_detail \n" +
            "WHERE \n" +
            "    e.id = :entrepreneurshipId \n" +
            "GROUP BY \n" +
            "    pd.name_personalized_detail \n" +
            "ORDER BY \n" +
            "    UsageCount DESC \n" +
            "LIMIT 3", nativeQuery = true)
    List<String[]> findTop3PersonalizationsByEntrepreneurshipId(@Param("entrepreneurshipId") Long entrepreneurshipId);

    @Query(value ="SELECT\n" +
            "   p.name_product AS ProductName,\n" +
            "   COUNT(r.id_reviews) AS ReviewCount \n" +
            "FROM \n" +
            "   reviews r \n" +
            "INNER JOIN \n" +
            "   product p ON r.product_id = p.id_product \n" +
            "INNER JOIN \n" +
            "   entrepreneurships e ON p.entrepreneurship_id = e.id \n" +
            "WHERE \n" +
            "   e.id = 1 \n" +
            "GROUP BY \n" +
            "   p.name_product \n" +
            "ORDER BY \n" +
            "   ReviewCount DESC", nativeQuery = true)
    List<String[]> quantityReviewsByProduct(@Param("entrepreneurshipId") Long entrepreneurshipId);
}
