package pe.edu.upc.giftservice.servicesinterfaces;

import pe.edu.upc.giftservice.entities.PaymentType;

import java.util.List;

public interface IPaymentTypeService {
    public void insert(PaymentType pt);

    public List<PaymentType> list();

    public void delete(int id);

}
