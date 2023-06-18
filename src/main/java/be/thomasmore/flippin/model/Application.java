package be.thomasmore.flippin.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.ManyToMany;

import java.util.Collection;

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

    private String applicationImage;

    private String applicationDescription;
    @ManyToOne
    private Marketplace marketplace;

    @ManyToMany(mappedBy = "applications")
    private Collection<Industry> industries;

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

    public String getApplicationImage() {
        return applicationImage;
    }

    public void setApplicationImage(String applicationImage) {
        this.applicationImage = applicationImage;
    }

    public Collection<Industry> getIndustries() {
        return industries;
    }

    public void setIndustries(Collection<Industry> industries) {
        this.industries = industries;
    }

    public String getApplicationDescription() {
        return applicationDescription;
    }

    public void setApplicationDescription(String applicationDescription) {
        this.applicationDescription = applicationDescription;
    }
}
