package pe.edu.upc.giftservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.giftservice.entities.Notification;

@Repository
public interface INotificationRepository extends JpaRepository<Notification, Integer> {
}
