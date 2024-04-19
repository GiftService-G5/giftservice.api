package pe.edu.upc.giftservice.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.giftservice.entities.Payment_Type;
import pe.edu.upc.giftservice.repositories.IPayment_TypeRepository;
import pe.edu.upc.giftservice.servicesinterfaces.IPayment_TypeService;

import java.util.List;

@Service
public class Payment_TypeServiceImplement implements IPayment_TypeService {
    @Autowired
    private IPayment_TypeRepository ptR;

    @Override
    public void insert(Payment_Type pt) {
        ptR.save(pt);
    }

    @Override
    public List<Payment_Type> list() {
        return ptR.findAll();
    }

    @Override
    public void delete(int id) { ptR.deleteById(id);

    }

    @Override
    public Payment_Type listId(int id) {
        return ptR.findById(id).orElse(new Payment_Type());
    }
}
