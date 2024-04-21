package pe.edu.upc.giftservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.giftservice.entities.Reviews;

@Repository
public interface IReviewsRepository extends JpaRepository<Reviews,Integer> {

    @Query(value = "SELECT SUM(r.score_reviews)AS totalScore FROM public.reviews r INNER JOIN public.product p ON r.product_id = p.id_product \n" +
            "WHERE  r.product_id= ?1 AND p.entrepreneurship_id = ?2",nativeQuery = true)
    public int TotalScoreByProduct(int product_id, int entrepreneurship_id);
}
