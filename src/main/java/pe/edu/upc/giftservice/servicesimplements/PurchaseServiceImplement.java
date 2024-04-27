package pe.edu.upc.giftservice.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.giftservice.entities.Purchase;
import pe.edu.upc.giftservice.repositories.IPurchaseRepository;
import pe.edu.upc.giftservice.servicesinterfaces.IPurchaseService;

import java.util.List;

@Service
class PurchaseServiceImplement implements IPurchaseService {
    @Autowired
    private IPurchaseRepository iP;

    @Override
    public void insert(Purchase pt) {
        iP.save(pt);
    }

    @Override
    public List<Purchase> list() {
        return iP.findAll();
    }

    @Override
    public void delete(int id) {
        iP.deleteById(id);
    }
    @Override
    public void update(Purchase purchase) {
        iP.save(purchase);
    }

    @Override
    public List<String[]> QuantityByTypeDelivery() {
        return iP.QuantityByTypeDelivery();
    }

    @Override
    public List<String[]> RankingPaymentTypesUsed(Long entrepreneurships_id) {
        return iP.RankingPaymentTypesUsed(entrepreneurships_id);
    }

}
