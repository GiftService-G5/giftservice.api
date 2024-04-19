package pe.edu.upc.giftservice.serviceinterfaces;

import pe.edu.upc.giftservice.entities.TipoComprobantePago;

import java.util.List;

public interface ITipoComprobantePagoService {
    public void insert(TipoComprobantePago r);
    public List<TipoComprobantePago> list();
    public void delete(int id);
    public TipoComprobantePago listID(int id);
}
