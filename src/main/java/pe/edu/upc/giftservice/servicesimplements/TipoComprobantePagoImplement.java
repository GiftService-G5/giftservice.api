package pe.edu.upc.giftservice.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.giftservice.entities.TipoComprobantePago;
import pe.edu.upc.giftservice.repositories.ITipoComprobantePagoRepository;
import pe.edu.upc.giftservice.serviceinterfaces.ITipoComprobantePagoService;

import java.util.List;

@Service
public class TipoComprobantePagoImplement implements ITipoComprobantePagoService {
    @Autowired
    private ITipoComprobantePagoRepository tpcR;
    @Override
    public void insert(TipoComprobantePago r) {
        tpcR.save(r);
    }

    @Override
    public List<TipoComprobantePago> list() {
        return tpcR.findAll();
    }

    @Override
    public void delete(int id) {
        tpcR.deleteById(id);
    }

    @Override
    public TipoComprobantePago listID(int id) {
        return tpcR.findById(id).orElse(new TipoComprobantePago());
    }
}
