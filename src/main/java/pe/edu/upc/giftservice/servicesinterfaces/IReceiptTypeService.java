package pe.edu.upc.giftservice.servicesinterfaces;

import pe.edu.upc.giftservice.entities.ReceiptType;

import java.util.List;

public interface IReceiptTypeService {
    public void insert(ReceiptType pt);

    public List<ReceiptType> list();

    public void delete(int id);
}
