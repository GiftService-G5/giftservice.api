package pe.edu.upc.giftservice.dtos;

import jakarta.persistence.Column;

public class TipoComprobantePagoDTO {
    private int idTipoComprobantePago;
    private String nameTipoComprobantePago;

    public int getIdTipoComprobantePago() {
        return idTipoComprobantePago;
    }

    public void setIdTipoComprobantePago(int idTipoComprobantePago) {
        this.idTipoComprobantePago = idTipoComprobantePago;
    }

    public String getNameTipoComprobantePago() {
        return nameTipoComprobantePago;
    }

    public void setNameTipoComprobantePago(String nameTipoComprobantePago) {
        this.nameTipoComprobantePago = nameTipoComprobantePago;
    }
}
