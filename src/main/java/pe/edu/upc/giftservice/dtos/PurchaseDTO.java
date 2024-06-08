package pe.edu.upc.giftservice.dtos;

import pe.edu.upc.giftservice.entities.DeliveryType;
import pe.edu.upc.giftservice.entities.PaymentType;
import pe.edu.upc.giftservice.entities.ReceiptType;

import java.time.LocalDate;

public class PurchaseDTO {
    private int idPurchase;
    private float pricePurchase;
    private LocalDate datePurchase;
    private boolean purchaseStatus;
    private String address;
    private DeliveryType deliveryTypes;
    private PaymentType paymentTypes;
    private ReceiptType receiptTypes;

    public int getIdPurchase() {
        return idPurchase;
    }

    public void setIdPurchase(int idPurchase) {
        this.idPurchase = idPurchase;
    }

    public float getPricePurchase() {
        return pricePurchase;
    }

    public void setPricePurchase(float pricePurchase) {
        this.pricePurchase = pricePurchase;
    }

    public LocalDate getDatePurchase() {
        return datePurchase;
    }

    public void setDatePurchase(LocalDate datePurchase) {
        this.datePurchase = datePurchase;
    }

    public boolean isPurchaseStatus() {
        return purchaseStatus;
    }

    public void setPurchaseStatus(boolean purchaseStatus) {
        this.purchaseStatus = purchaseStatus;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public DeliveryType getDeliveryTypes() {
        return deliveryTypes;
    }

    public void setDeliveryTypes(DeliveryType deliveryTypes) {
        this.deliveryTypes = deliveryTypes;
    }

    public PaymentType getPaymentTypes() {
        return paymentTypes;
    }

    public void setPaymentTypes(PaymentType paymentTypes) {
        this.paymentTypes = paymentTypes;
    }

    public ReceiptType getReceiptTypes() {
        return receiptTypes;
    }

    public void setReceiptTypes(ReceiptType receiptTypes) {
        this.receiptTypes = receiptTypes;
    }
}
