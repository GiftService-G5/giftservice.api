package pe.edu.upc.giftservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.giftservice.entities.Payment_Type;

@Repository
public interface IPayment_TypeRepository extends JpaRepository<Payment_Type, Integer> {
}
