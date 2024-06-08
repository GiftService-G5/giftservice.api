package pe.edu.upc.giftservice.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "PersonalizedDetail")
public class PersonalizedDetail {
    //PersonalizedDetail
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPersonalizedDetail;
    @Column(name = "namePersonalizedDetail", nullable = false)
    private String namePersonalizedDetail;
    @Column(name = "additionalPricePersonalizedDetail", nullable = false)
    private double additionalPricePersonalizedDetail;

    public PersonalizedDetail() {
    }

    public PersonalizedDetail(int idPersonalizedDetail, String namePersonalizedDetail, double additionalPricePersonalizedDetail) {
        this.idPersonalizedDetail = idPersonalizedDetail;
        this.namePersonalizedDetail = namePersonalizedDetail;
        this.additionalPricePersonalizedDetail = additionalPricePersonalizedDetail;
    }

    public int getIdPersonalizedDetail() {
        return idPersonalizedDetail;
    }

    public void setIdPersonalizedDetail(int idPersonalizedDetail) {
        this.idPersonalizedDetail = idPersonalizedDetail;
    }

    public String getNamePersonalizedDetail() {
        return namePersonalizedDetail;
    }

    public void setNamePersonalizedDetail(String namePersonalizedDetail) {
        this.namePersonalizedDetail = namePersonalizedDetail;
    }

    public double getAdditionalPricePersonalizedDetail() {
        return additionalPricePersonalizedDetail;
    }

    public void setAdditionalPricePersonalizedDetail(double additionalPricePersonalizedDetail) {
        this.additionalPricePersonalizedDetail = additionalPricePersonalizedDetail;
    }
}
