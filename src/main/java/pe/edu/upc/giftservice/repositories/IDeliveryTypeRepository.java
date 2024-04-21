package pe.edu.upc.giftservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.giftservice.entities.DeliveryType;

import java.util.List;

@Repository
public interface IDeliveryTypeRepository extends JpaRepository<DeliveryType, Integer> {
    public List<DeliveryType> findByNameDeliveryType(String nameDelivery);
}
