package pe.edu.upc.giftservice.servicesinterfaces;

import pe.edu.upc.giftservice.entities.Purchase;

import java.util.List;

public interface IPurchaseService {
    public void insert(Purchase pt);

    public List<Purchase> list();

    public void delete(int id);
    public void update(Purchase purchase);


    public List<String[]> QuantityByTypeDelivery ();

    public List<String[]> RankingPaymentTypesUsed(Long entrepreneurships_id);
}
