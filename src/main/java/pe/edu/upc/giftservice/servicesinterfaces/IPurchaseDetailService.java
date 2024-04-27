package pe.edu.upc.giftservice.servicesinterfaces;

import pe.edu.upc.giftservice.entities.PurchaseDetail;

import java.time.LocalDate;
import java.util.List;

public interface IPurchaseDetailService {
    public void insert(PurchaseDetail purchaseDetail);
    public List<PurchaseDetail> list();
    public PurchaseDetail getById(int id);
    public void update(PurchaseDetail purchaseDetail);
    public void delete(int id);
    public List<String[]> quantityPurchaseByEntrepreneurship();
    public List<String[]> TotalAmountByEntrepreneurship();
    public int sumTotalProductsByPurchaseDate(LocalDate fechaCompra);
    public List<Object[]> filterBestSellerProductDescent();
    public List<String[]> RankingCategoryPurchase(Long entrepreneurships_id);
}
