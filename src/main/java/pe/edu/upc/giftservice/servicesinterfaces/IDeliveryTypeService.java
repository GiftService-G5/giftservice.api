package pe.edu.upc.giftservice.servicesinterfaces;

import pe.edu.upc.giftservice.entities.DeliveryType;

import java.util.List;

public interface IDeliveryTypeService {
    public void insert(DeliveryType pt);

    public List<DeliveryType> list();

    public void delete(int id);

}
