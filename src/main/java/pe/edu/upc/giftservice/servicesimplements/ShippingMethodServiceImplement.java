package pe.edu.upc.giftservice.servicesimplements;

import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.giftservice.entities.ShippingMethod;
import pe.edu.upc.giftservice.repositories.IShippingMethodRepository;
import pe.edu.upc.giftservice.servicesinterfaces.IShippingMethodService;

import java.util.List;

@Service
public class ShippingMethodServiceImplement implements IShippingMethodService {
    @Autowired
    private IShippingMethodRepository smR;

    @Override
    public void insert(ShippingMethod sm) {
        smR.save(sm);
    }
    @Override
    public List<ShippingMethod> list() {
        return smR.findAll();
    }
}
