package pe.edu.upc.giftservice.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Shipping method")
public class ShippingMethod {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idShippingMethod;
    @Column(name = "nameShippingMethod", nullable = false, length = 40)
    private String nameShippingMethod;

    public ShippingMethod() {
    }

    public ShippingMethod(int idShippingMethod, String nameShippingMethod) {
        this.idShippingMethod = idShippingMethod;
        this.nameShippingMethod = nameShippingMethod;
    }

    public int getIdShippingMethod() {
        return idShippingMethod;
    }

    public void setIdShippingMethod(int idShippingMethod) {
        this.idShippingMethod = idShippingMethod;
    }

    public String getNameShippingMethod() {
        return nameShippingMethod;
    }

    public void setNameShippingMethod(String nameShippingMethod) {
        this.nameShippingMethod = nameShippingMethod;
    }
}
