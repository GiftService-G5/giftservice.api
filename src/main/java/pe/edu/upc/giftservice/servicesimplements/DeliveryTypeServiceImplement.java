package pe.edu.upc.giftservice.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.giftservice.entities.DeliveryType;
import pe.edu.upc.giftservice.repositories.IDeliveryTypeRepository;
import pe.edu.upc.giftservice.servicesinterfaces.IDeliveryTypeService;

import java.util.List;

@Service
public class DeliveryTypeServiceImplement implements IDeliveryTypeService {
    @Autowired
    private IDeliveryTypeRepository dtR;


    @Override
    public void insert(DeliveryType dt) {
        dtR.save(dt);
    }

    @Override
    public List<DeliveryType> list() {
        return dtR.findAll();
    }

    @Override
    public void delete(int id) {
        dtR.deleteById(id);
    }

    @Override
    public List<DeliveryType> findByNameDeliveryType(String nameDelivery) {
        return dtR.findByNameDeliveryType(nameDelivery);
    }

    @Override
    public void update(Integer id, DeliveryType deliveryType) {
        DeliveryType change = dtR.findById(id).orElseThrow();
        change.setNameDeliveryType(deliveryType.getNameDeliveryType());
        dtR.save(change);
    }
}