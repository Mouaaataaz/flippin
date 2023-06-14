package be.thomasmore.flippin.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Ecommerce {
    @Id

    private Integer Id;

    private String ecommerceName;

    private String Type;

    private Integer Price;

    private Integer MonthlyProfit;

    private String Foundation;

    private String ProductsRatings;

    private String PaymentMethod;

    private String Location;

    @ManyToOne
    private Marketplace marketplace;

    public Ecommerce() {

    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getEcommerceName() {
        return ecommerceName;
    }

    public void setEcommerceName(String ecommerceName) {
        this.ecommerceName = ecommerceName;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public Integer getPrice() {
        return Price;
    }

    public void setPrice(Integer price) {
        Price = price;
    }

    public Integer getMonthlyProfit() {
        return MonthlyProfit;
    }

    public void setMonthlyProfit(Integer monthlyProfit) {
        MonthlyProfit = monthlyProfit;
    }

    public String getFoundation() {
        return Foundation;
    }

    public void setFoundation(String foundation) {
        Foundation = foundation;
    }

    public String getProductsRatings() {
        return ProductsRatings;
    }

    public void setProductsRatings(String productsRatings) {
        ProductsRatings = productsRatings;
    }

    public String getPaymentMethod() {
        return PaymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        PaymentMethod = paymentMethod;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public Marketplace getMarketplace() {
        return marketplace;
    }

    public void setMarketplace(Marketplace marketplace) {
        this.marketplace = marketplace;
    }
}
