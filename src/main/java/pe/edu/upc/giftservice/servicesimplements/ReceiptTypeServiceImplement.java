package pe.edu.upc.giftservice.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.giftservice.entities.ReceiptType;
import pe.edu.upc.giftservice.repositories.IReceiptTypeRepository;
import pe.edu.upc.giftservice.servicesinterfaces.IReceiptTypeService;

import java.util.List;

@Service
public class ReceiptTypeServiceImplement implements IReceiptTypeService {
    @Autowired
    private IReceiptTypeRepository rtR;
    @Override
    public void insert(ReceiptType pt) {
        rtR.save(pt);
    }

    @Override
    public List<ReceiptType> list() {
        return rtR.findAll();
    }

    @Override
    public void delete(int id) {
        rtR.deleteById(id);
    }

}
