package pe.edu.upc.giftservice.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.giftservice.entities.Reviews;
import pe.edu.upc.giftservice.repositories.IReviewsRepository;
import pe.edu.upc.giftservice.servicesinterfaces.IReviewsService;

import java.util.List;

@Service
public class ReviewsServiceImplement implements IReviewsService {
    @Autowired
    private IReviewsRepository rR;

    @Override
    public void insert(Reviews reviews) {
        rR.save(reviews);
    }

    @Override
    public List<Reviews> list() {
        return rR.findAll();
    }

    @Override
    public void delete(int id) {
        rR.deleteById(id);
    }

    @Override
    public int TotalScoreByProduct(int product_id, int entrepreneurship_id) {
        return rR.TotalScoreByProduct(product_id,entrepreneurship_id);
    }
}
