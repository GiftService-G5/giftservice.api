package pe.edu.upc.giftservice.dtos;

public class RankingPaymentTypesUsedDTO {
    String namePaymentType;
    int Total;

    public String getNamePaymentType() {
        return namePaymentType;
    }

    public void setNamePaymentType(String namePaymentType) {
        this.namePaymentType = namePaymentType;
    }

    public int getTotal() {
        return Total;
    }

    public void setTotal(int total) {
        Total = total;
    }

}
