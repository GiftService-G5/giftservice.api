package pe.edu.upc.giftservice.dtos;

public class PurchaseByEntrepreneurshipDTO {
    private String nameEntrepreneurship;
    private int quantityPurchaseD;

    public String getNameEntrepreneurship() {
        return nameEntrepreneurship;
    }

    public void setNameEntrepreneurship(String nameEntrepreneurship) {
        this.nameEntrepreneurship = nameEntrepreneurship;
    }

    public int getQuantityPurchaseD() {
        return quantityPurchaseD;
    }

    public void setQuantityPurchaseD(int quantityPurchaseD) {
        this.quantityPurchaseD = quantityPurchaseD;
    }
}
