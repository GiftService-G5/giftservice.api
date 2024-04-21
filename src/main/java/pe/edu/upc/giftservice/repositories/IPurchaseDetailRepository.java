package pe.edu.upc.giftservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.giftservice.entities.PaymentType;
import pe.edu.upc.giftservice.entities.PurchaseDetail;
@Repository
public interface IPurchaseDetailRepository extends JpaRepository<PurchaseDetail, Integer> {
}
