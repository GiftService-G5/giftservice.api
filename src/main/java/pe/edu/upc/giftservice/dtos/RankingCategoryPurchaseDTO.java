package pe.edu.upc.giftservice.dtos;

public class RankingCategoryPurchaseDTO {
    String nameCategory;
    int Total;

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public int getTotal() {
        return Total;
    }

    public void setTotal(int total) {
        Total = total;
    }
}
