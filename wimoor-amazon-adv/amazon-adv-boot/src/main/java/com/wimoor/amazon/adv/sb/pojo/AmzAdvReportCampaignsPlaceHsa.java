package com.wimoor.amazon.adv.sb.pojo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.wimoor.amazon.adv.common.pojo.JsonBigIntergeSerializer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "t_amz_adv_rpt2_hsa_campaigns_place")
public class AmzAdvReportCampaignsPlaceHsa {

    @Id
    @Column(name = "campaignId")
    @JsonSerialize(using = JsonBigIntergeSerializer.class)
    private BigInteger campaignid;

    @Id
    @Column(name = "bydate")
    private Date bydate;

    @Id
    @Column(name = "placementid")
    private Integer placementid;

    @Column(name = "campaignBudget")
    private BigDecimal campaignbudget;

    @Column(name = "impressions")
    private Integer impressions;

    @Column(name = "clicks")
    private Integer clicks;

    @Column(name = "cost")
    private BigDecimal cost;

    @Column(name = "profileid")
    @JsonSerialize(using = JsonBigIntergeSerializer.class)
    private BigInteger profileid;

    @Column(name = "opttime")
    private Date opttime;

    public BigInteger getCampaignid() {
        return campaignid;
    }

    public void setCampaignid(BigInteger campaignid) {
        this.campaignid = campaignid;
    }

    public Date getBydate() {
        return bydate;
    }

    public void setBydate(Date bydate) {
        this.bydate = bydate;
    }

    public BigDecimal getCampaignbudget() {
        return campaignbudget;
    }

    public void setCampaignbudget(BigDecimal campaignbudget) {
        this.campaignbudget = campaignbudget;
    }

    public Integer getImpressions() {
        return impressions;
    }

    public void setImpressions(Integer impressions) {
        this.impressions = impressions;
    }

    public Integer getClicks() {
        return clicks;
    }

    public void setClicks(Integer clicks) {
        this.clicks = clicks;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public BigInteger getProfileid() {
        return profileid;
    }

    public void setProfileid(BigInteger profileid) {
        this.profileid = profileid;
    }

    public Date getOpttime() {
        return opttime;
    }

    public void setOpttime(Date opttime) {
        this.opttime = opttime;
    }

    public Integer getPlacementid() {
        return placementid;
    }

    public void setPlacementid(Integer placementid) {
        this.placementid = placementid;
    }


}