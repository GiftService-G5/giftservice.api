package pe.edu.upc.giftservice.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.giftservice.entities.PaymentType;
import pe.edu.upc.giftservice.repositories.IPaymentTypeRepository;
import pe.edu.upc.giftservice.servicesinterfaces.IPaymentTypeService;

import java.util.List;

@Service
public class PaymentTypeServiceImplement implements IPaymentTypeService {
    @Autowired
    private IPaymentTypeRepository ptR;

    @Override
    public void insert(PaymentType pt) {
        ptR.save(pt);
    }

    @Override
    public List<PaymentType> list() {
        return ptR.findAll();
    }

    @Override
    public void delete(int id) { ptR.deleteById(id);
    }
}
