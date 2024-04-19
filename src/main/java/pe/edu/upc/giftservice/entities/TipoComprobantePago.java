package pe.edu.upc.giftservice.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "TipoComprobantePago")
public class TipoComprobantePago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipoComprobantePago;
    @Column(name = "nameRol",nullable = false,length = 30)
    private String nameTipoComprobantePago;

    public TipoComprobantePago() {
    }

    public TipoComprobantePago(int idTipoComprobantePago, String nameTipoComprobantePago) {
        this.idTipoComprobantePago = idTipoComprobantePago;
        this.nameTipoComprobantePago = nameTipoComprobantePago;
    }

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
