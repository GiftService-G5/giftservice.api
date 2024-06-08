package pe.edu.upc.giftservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.giftservice.entities.ReceiptType;

@Repository
public interface IReceiptTypeRepository extends JpaRepository<ReceiptType, Integer> {
}
