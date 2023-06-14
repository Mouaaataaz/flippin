package be.thomasmore.flippin.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Industry {

    @Id

    private Integer Id;

    private String industryName;

    private String industryImage;

    private String Description;

    private Integer MarketSize;

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
}
