package pe.edu.upc.giftservice.servicesinterfaces;

import pe.edu.upc.giftservice.entities.ShippingMethod;

import java.util.List;

public interface IShippingMethodService {
    public void insert(ShippingMethod sm);
    public List<ShippingMethod> list();
}
