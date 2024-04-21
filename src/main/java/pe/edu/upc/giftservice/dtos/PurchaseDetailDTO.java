package pe.edu.upc.giftservice.dtos;


import pe.edu.upc.giftservice.entities.Product;
import pe.edu.upc.giftservice.entities.Purchase;

public class PurchaseDetailDTO {
    private int idPurchaseDetail;
    private Double CTotalPurchaseDetail;
    private int cantidadPurchaseDetail;
    private Purchase purchase;

    private Product product;

    public int getIdPurchaseDetail() {
        return idPurchaseDetail;
    }

    public void setIdPurchaseDetail(int idPurchaseDetail) {
        this.idPurchaseDetail = idPurchaseDetail;
    }

    public Double getCTotalPurchaseDetail() {
        return CTotalPurchaseDetail;
    }

    public void setCTotalPurchaseDetail(Double CTotalPurchaseDetail) {
        this.CTotalPurchaseDetail = CTotalPurchaseDetail;
    }

    public int getCantidadPurchaseDetail() {
        return cantidadPurchaseDetail;
    }

    public void setCantidadPurchaseDetail(int cantidadPurchaseDetail) {
        this.cantidadPurchaseDetail = cantidadPurchaseDetail;
    }

    public Purchase getPurchase() {
        return purchase;
    }

    public void setPurchase(Purchase purchase) {
        this.purchase = purchase;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
