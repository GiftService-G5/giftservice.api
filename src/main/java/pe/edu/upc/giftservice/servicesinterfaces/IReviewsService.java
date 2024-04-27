package pe.edu.upc.giftservice.servicesinterfaces;

import pe.edu.upc.giftservice.entities.PersonalizedDetail;
import pe.edu.upc.giftservice.entities.Reviews;

import java.util.List;

public interface IReviewsService {
    public void insert(Reviews reviews);

    public List<Reviews> list();

    public void delete(int id);
    public int TotalScoreByProduct(int product_id, int entrepreneurship_id);
    public List<String[]> LowScoreProduct();
}
