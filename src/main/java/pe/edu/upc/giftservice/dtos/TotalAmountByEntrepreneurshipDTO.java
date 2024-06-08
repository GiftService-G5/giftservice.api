package pe.edu.upc.giftservice.dtos;

public class TotalAmountByEntrepreneurshipDTO {
    private String nameEntrepreneurship;
    private double totalAmount;

    public String getNameEntrepreneurship() {
        return nameEntrepreneurship;
    }

    public void setNameEntrepreneurship(String nameEntrepreneurship) {
        this.nameEntrepreneurship = nameEntrepreneurship;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
