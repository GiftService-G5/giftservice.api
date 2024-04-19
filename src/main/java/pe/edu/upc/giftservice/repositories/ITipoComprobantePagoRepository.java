package pe.edu.upc.giftservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.giftservice.entities.TipoComprobantePago;

public interface ITipoComprobantePagoRepository extends JpaRepository<TipoComprobantePago,Integer> {
}
