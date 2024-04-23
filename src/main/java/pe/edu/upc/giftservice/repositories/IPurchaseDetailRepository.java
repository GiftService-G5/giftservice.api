package pe.edu.upc.giftservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.giftservice.entities.PaymentType;
import pe.edu.upc.giftservice.entities.PurchaseDetail;

import java.util.List;

@Repository
public interface IPurchaseDetailRepository extends JpaRepository<PurchaseDetail, Integer> {

    @Query(value = "SELECT e.name_entrepreneurship AS EntrepreneurshipName, \n" +
            "       COUNT(pd.id_purchase_detail) AS PurchaseDetailCount \n" +
            "FROM entrepreneurships e \n" +
            "INNER JOIN Product p ON e.id = p.entrepreneurship_id \n" +
            "INNER JOIN purchase_detail pd ON e.id = pd.product_id \n" +
            "GROUP BY e.name_entrepreneurship;",nativeQuery = true)
    public List<String[]> quantityPurchaseByEntrepreneurship();

    @Query(value = "SELECT e.name_entrepreneurship AS EntrepreneurshipName,\tsum(pd.ctotal_purchase_detail) AS TotalSales \n" +
            "FROM entrepreneurships e \n" +
            "INNER JOIN Product p ON e.id = p.entrepreneurship_id \n" +
            "INNER JOIN purchase_detail pd ON e.id = pd.product_id \n" +
            "GROUP BY e.name_entrepreneurship", nativeQuery = true)
    public List<String[]> TotalAmountByEntrepreneurship();
}
