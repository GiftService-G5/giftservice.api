package pe.edu.upc.giftservice.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.giftservice.entities.Notification;
import pe.edu.upc.giftservice.repositories.INotificationRepository;
import pe.edu.upc.giftservice.servicesinterfaces.INotificationService;

import java.util.List;

@Service
public class NotificationServiceImplement implements INotificationService {
    @Autowired
    private INotificationRepository nTR;

    @Override
    public void insert(Notification ntf) {
        nTR.save(ntf);
    }

    @Override
    public List<Notification> list() {
        return nTR.findAll();
    }

    @Override
    public void delete(int id) {
        nTR.deleteById(id);
    }
}
