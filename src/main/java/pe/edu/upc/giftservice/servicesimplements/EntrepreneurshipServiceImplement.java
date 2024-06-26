package pe.edu.upc.giftservice.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.giftservice.entities.Entrepreneurship;
import pe.edu.upc.giftservice.repositories.IEntrepreneurshipRepository;
import pe.edu.upc.giftservice.servicesinterfaces.IEntrepreneurshipService;

import java.util.List;

@Service
public class EntrepreneurshipServiceImplement implements IEntrepreneurshipService {
    @Autowired
    private IEntrepreneurshipRepository eR;

    @Override
    public void insert(Entrepreneurship entrepreneurship) {
        eR.save(entrepreneurship);
    }

    @Override
    public List<Entrepreneurship> list() {
        return eR.findAll();
    }

    @Override
    public Entrepreneurship getById(Long id) {
        return eR.findById(id).get();
    }

    @Override
    public void update(Entrepreneurship entrepreneurship) {
        eR.save(entrepreneurship);
    }

    @Override
    public void delete(Long id) {
        eR.deleteById(id);
    }

    @Override
    public List<String[]> quantityReviewsByProduct(Long id) {
        return eR.quantityReviewsByProduct(id);
    }

    @Override
    public List<String[]> findTop3PersonalizationsByEntrepreneurshipId(Long id) {
        return eR.findTop3PersonalizationsByEntrepreneurshipId(id);
    }
}
