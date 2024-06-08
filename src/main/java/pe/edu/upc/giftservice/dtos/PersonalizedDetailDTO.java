package pe.edu.upc.giftservice.dtos;

public class PersonalizedDetailDTO {
    private int idPersonalizedDetail;
    private String namePersonalizedDetail;
    private double additionalPricePersonalizedDetail;

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
