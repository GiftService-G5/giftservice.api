package pe.edu.upc.giftservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.giftservice.entities.PaymentType;
import pe.edu.upc.giftservice.entities.PurchaseDetail;

import java.time.LocalDate;
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

    @Query(value = "SELECT SUM(pd.cantidad_purchase_detail) AS total_productos_comprados\n" +
            "FROM purchase_detail pd\n" +
            "JOIN purchase p ON pd.purchase_id = p.id_purchase\n" +
            "WHERE p.date_purchase = ?1", nativeQuery = true)
    public int sumTotalProductsByPurchaseDate(LocalDate fechaCompra);

    @Query(value = "SELECT pd.product_id, SUM(pd.cantidad_purchase_detail) AS total\n" +
            "FROM purchase_detail pd\n" +
            "GROUP BY pd.product_id\n" +
            "ORDER BY total DESC", nativeQuery = true)
    public List<Object[]> filterBestSellerProductDescent();
}
