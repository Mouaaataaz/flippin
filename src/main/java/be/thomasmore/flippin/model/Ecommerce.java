package be.thomasmore.flippin.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

import java.util.Collection;

@Entity
public class Ecommerce {
    @Id

    private Integer Id;

    private String ecommerceName;

    private String ecommerceType;

    private Integer ecommercePrice;

    private Integer monthlyProfit;

    private String foundation;

    private String ProductsRatings;

    private String PaymentMethod;

    private String Location;

    private String ecommerceImage;

    private String ecommerceDescription;


    @ManyToOne
    private Marketplace marketplace;

    @ManyToMany(mappedBy = "ecommerces")
    private Collection<Industry> industries;

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

    public String getEcommerceType() {
        return ecommerceType;
    }

    public void setEcommerceType(String ecommerceType) {
        this.ecommerceType = ecommerceType;
    }

    public Integer getEcommercePrice() {
        return ecommercePrice;
    }

    public void setEcommercePrice(Integer ecommercePrice) {
        this.ecommercePrice = ecommercePrice;
    }

    public Integer getMonthlyProfit() {
        return monthlyProfit;
    }

    public void setMonthlyProfit(Integer monthlyProfit) {
        this.monthlyProfit = monthlyProfit;
    }

    public String getFoundation() {
        return foundation;
    }

    public void setFoundation(String foundation) {
        this.foundation = foundation;
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

    public Collection<Industry> getIndustries() {
        return industries;
    }

    public void setIndustries(Collection<Industry> industries) {
        this.industries = industries;
    }

    public String getEcommerceImage() {
        return ecommerceImage;
    }

    public void setEcommerceImage(String ecommerceImage) {
        this.ecommerceImage = ecommerceImage;
    }

    public String getEcommerceDescription() {
        return ecommerceDescription;
    }

    public void setEcommerceDescription(String ecommerceDescription) {
        this.ecommerceDescription = ecommerceDescription;
    }
}
