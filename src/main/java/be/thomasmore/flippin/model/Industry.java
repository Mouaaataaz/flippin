package be.thomasmore.flippin.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.Collection;


@Entity
public class Industry {

    @Id

    private Integer Id;

    private String industryName;

    private String industryImage;

    private String Description;

    private Integer MarketSize;

    private String Competition;

    private String industryPhoto;

    @ManyToMany
    private Collection<Ecommerce> ecommerces;

    @ManyToMany
    private Collection<Application> applications;

    public Industry(){

    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getIndustryName() {
        return industryName;
    }

    public void setIndustryName(String industryName) {
        this.industryName = industryName;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Integer getMarketSize() {
        return MarketSize;
    }

    public void setMarketSize(Integer marketSize) {
        MarketSize = marketSize;
    }

    public String getIndustryImage() {
        return industryImage;
    }

    public void setIndustryImage(String industryImage) {
        this.industryImage = industryImage;
    }

    public String getCompetition() {
        return Competition;
    }

    public void setCompetition(String competition) {
        Competition = competition;
    }

    public Collection<Ecommerce> getEcommerces() {
        return ecommerces;
    }

    public void setEcommerces(Collection<Ecommerce> ecommerces) {
        this.ecommerces = ecommerces;
    }

    public String getIndustryPhoto() {
        return industryPhoto;
    }

    public void setIndustryPhoto(String industryPhoto) {
        this.industryPhoto = industryPhoto;
    }

    public Collection<Application> getApplications() {
        return applications;
    }

    public void setApplications(Collection<Application> applications) {
        this.applications = applications;
    }
}
