package be.thomasmore.flippin.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Application {

    @Id
    private Integer Id;

    private String applicationName;

    private String Type;

    private Integer Price;

    private Integer MonthlyProfit;

    private String foundation;

    private Integer TotalDownloaded;

    private String PaymentMethod;

    private String Location;

    @ManyToOne
    private Marketplace marketplace;

    public Application(){

    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
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
        return foundation;
    }

    public void setFoundation(String foundation) {
        this.foundation = foundation;
    }

    public Integer getTotalDownloaded() {
        return TotalDownloaded;
    }

    public void setTotalDownloaded(Integer totalDownloaded) {
        TotalDownloaded = totalDownloaded;
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
