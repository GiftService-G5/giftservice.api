package pe.edu.upc.giftservice.servicesinterfaces;

import pe.edu.upc.giftservice.entities.Notification;

import java.util.List;

public interface INotificationService {
    public void insert(Notification ntf);
    public List<Notification> list();
    public void delete(int id);
}
