package pe.edu.upc.giftservice.dtos;

import pe.edu.upc.giftservice.entities.Category;
import pe.edu.upc.giftservice.entities.Entrepreneurship;
import pe.edu.upc.giftservice.entities.PersonalizedDetail;

public class ProductDTO {
    private int idProduct;
    private String nameProduct;
    private double priceProduct;
    private String descriptionProduct;
    private int stockProduct;
    private Category category;
    private Entrepreneurship entrepreneurship;
    private PersonalizedDetail personalizedDetail;

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(double priceProduct) {
        this.priceProduct = priceProduct;
    }

    public String getDescriptionProduct() {
        return descriptionProduct;
    }

    public void setDescriptionProduct(String descriptionProduct) {
        this.descriptionProduct = descriptionProduct;
    }

    public int getStockProduct() {
        return stockProduct;
    }

    public void setStockProduct(int stockProduct) {
        this.stockProduct = stockProduct;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Entrepreneurship getEntrepreneurship() {
        return entrepreneurship;
    }

    public void setEntrepreneurship(Entrepreneurship entrepreneurship) {
        this.entrepreneurship = entrepreneurship;
    }

    public PersonalizedDetail getPersonalizedDetail() {
        return personalizedDetail;
    }

    public void setPersonalizedDetail(PersonalizedDetail personalizedDetail) {
        this.personalizedDetail = personalizedDetail;
    }
}
