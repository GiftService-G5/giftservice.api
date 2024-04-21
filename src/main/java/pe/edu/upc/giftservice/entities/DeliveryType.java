package pe.edu.upc.giftservice.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "DeliveryType")
public class DeliveryType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDelivery_type;
    @Column(name = "nameDelivery_Type", nullable = false, length = 50)
    private String nameDelivery_Type;


    public DeliveryType() {
    }

    public DeliveryType(int idDelivery_type, String nameDelivery_Type) {
        this.idDelivery_type = idDelivery_type;
        this.nameDelivery_Type = nameDelivery_Type;
    }

    public int getIdDelivery_type() {
        return idDelivery_type;
    }

    public void setIdDelivery_type(int idDelivery_type) {
        this.idDelivery_type = idDelivery_type;
    }

    public String getNameDelivery_Type() {
        return nameDelivery_Type;
    }

    public void setNameDelivery_Type(String nameDelivery_Type) {
        this.nameDelivery_Type = nameDelivery_Type;
    }
}
