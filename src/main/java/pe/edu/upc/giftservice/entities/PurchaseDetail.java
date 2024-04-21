package pe.edu.upc.giftservice.entities;

import jakarta.persistence.*;

@Table(name = "PurchaseDetail")
@Entity
public class PurchaseDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPurchaseDetail;
    @Column(name = "CTotalPurchaseDetail", nullable = false)
    private Double CTotalPurchaseDetail;
    @Column(name = "cantidadPurchaseDetail", nullable = false)
    private int cantidadPurchaseDetail;

    @ManyToOne
    @JoinColumn(name = "Purchase_id")
    private Purchase purchase;

    @ManyToOne
    @JoinColumn(name = "Product_id")
    private Product product;

    public PurchaseDetail() {
    }

    public PurchaseDetail(int idPurchaseDetail, Double CTotalPurchaseDetail, int cantidadPurchaseDetail, Purchase purchase, Product product) {
        this.idPurchaseDetail = idPurchaseDetail;
        this.CTotalPurchaseDetail = CTotalPurchaseDetail;
        this.cantidadPurchaseDetail = cantidadPurchaseDetail;
        this.purchase = purchase;
        this.product = product;
    }

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
