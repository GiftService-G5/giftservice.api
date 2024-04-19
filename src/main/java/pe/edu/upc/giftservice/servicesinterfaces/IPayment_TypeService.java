package pe.edu.upc.giftservice.servicesinterfaces;

import pe.edu.upc.giftservice.entities.Payment_Type;

import java.util.List;

public interface IPayment_TypeService {
    public void insert(Payment_Type pt);

    public List<Payment_Type> list();

    public void delete(int id);

    public Payment_Type listId(int id);
}
