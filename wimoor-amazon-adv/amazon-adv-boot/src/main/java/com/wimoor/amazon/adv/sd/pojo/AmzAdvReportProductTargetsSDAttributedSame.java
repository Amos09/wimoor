package com.wimoor.amazon.adv.sd.pojo;

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
@Table(name = "t_amz_adv_rpt2_sd_product_targets_attributed_same")
public class AmzAdvReportProductTargetsSDAttributedSame {

    @Id
    @Column(name = "bydate")
    private Date bydate;

    @Id
    @Column(name = "targetId")
    @JsonSerialize(using = JsonBigIntergeSerializer.class)
    private BigInteger targetid;


    @Column(name = "attributedConversions1dSameSKU")
    private Integer attributedconversions1dsamesku;

    @Column(name = "attributedConversions7dSameSKU")
    private Integer attributedconversions7dsamesku;

    @Column(name = "attributedConversions14dSameSKU")
    private Integer attributedconversions14dsamesku;

    @Column(name = "attributedConversions30dSameSKU")
    private Integer attributedconversions30dsamesku;


    @Column(name = "attributedSales1dSameSKU")
    private BigDecimal attributedsales1dsamesku;

    @Column(name = "attributedSales7dSameSKU")
    private BigDecimal attributedsales7dsamesku;

    @Column(name = "attributedSales14dSameSKU")
    private BigDecimal attributedsales14dsamesku;

    @Column(name = "attributedSales30dSameSKU")
    private BigDecimal attributedsales30dsamesku;


    /**
     * @return the bydate
     */
    public Date getBydate() {
        return bydate;
    }

    /**
     * @param bydate the bydate to set
     */
    public void setBydate(Date bydate) {
        this.bydate = bydate;
    }

    /**
     * @return the targetid
     */
    public BigInteger getTargetid() {
        return targetid;
    }

    /**
     * @param targetid the targetid to set
     */
    public void setTargetid(BigInteger targetid) {
        this.targetid = targetid;
    }


    public Integer getAttributedconversions1dsamesku() {
        return attributedconversions1dsamesku;
    }

    public void setAttributedconversions1dsamesku(Integer attributedconversions1dsamesku) {
        this.attributedconversions1dsamesku = attributedconversions1dsamesku;
    }

    public Integer getAttributedconversions7dsamesku() {
        return attributedconversions7dsamesku;
    }

    public void setAttributedconversions7dsamesku(Integer attributedconversions7dsamesku) {
        this.attributedconversions7dsamesku = attributedconversions7dsamesku;
    }

    public Integer getAttributedconversions14dsamesku() {
        return attributedconversions14dsamesku;
    }

    public void setAttributedconversions14dsamesku(Integer attributedconversions14dsamesku) {
        this.attributedconversions14dsamesku = attributedconversions14dsamesku;
    }

    public Integer getAttributedconversions30dsamesku() {
        return attributedconversions30dsamesku;
    }

    public void setAttributedconversions30dsamesku(Integer attributedconversions30dsamesku) {
        this.attributedconversions30dsamesku = attributedconversions30dsamesku;
    }


    public BigDecimal getAttributedsales1dsamesku() {
        return attributedsales1dsamesku;
    }

    public void setAttributedsales1dsamesku(BigDecimal attributedsales1dsamesku) {
        this.attributedsales1dsamesku = attributedsales1dsamesku;
    }

    public BigDecimal getAttributedsales7dsamesku() {
        return attributedsales7dsamesku;
    }

    public void setAttributedsales7dsamesku(BigDecimal attributedsales7dsamesku) {
        this.attributedsales7dsamesku = attributedsales7dsamesku;
    }

    public BigDecimal getAttributedsales14dsamesku() {
        return attributedsales14dsamesku;
    }

    public void setAttributedsales14dsamesku(BigDecimal attributedsales14dsamesku) {
        this.attributedsales14dsamesku = attributedsales14dsamesku;
    }

    public BigDecimal getAttributedsales30dsamesku() {
        return attributedsales30dsamesku;
    }

    public void setAttributedsales30dsamesku(BigDecimal attributedsales30dsamesku) {
        this.attributedsales30dsamesku = attributedsales30dsamesku;
    }


    public boolean isZero() {

        if (attributedconversions1dsamesku != null && attributedconversions1dsamesku != 0) {
            return false;
        }
        if (attributedconversions7dsamesku != null && attributedconversions7dsamesku != 0) {
            return false;
        }
        if (attributedconversions14dsamesku != null && attributedconversions14dsamesku != 0) {
            return false;
        }
        if (attributedconversions30dsamesku != null && attributedconversions30dsamesku != 0) {
            return false;
        }

        if (attributedsales1dsamesku != null && attributedsales1dsamesku.floatValue() > 0.001) {
            return false;
        }
        if (attributedsales7dsamesku != null && attributedsales7dsamesku.floatValue() > 0.001) {
            return false;
        }
        if (attributedsales14dsamesku != null && attributedsales14dsamesku.floatValue() > 0.001) {
            return false;
        }
        if (attributedsales30dsamesku != null && attributedsales30dsamesku.floatValue() > 0.001) {
            return false;
        }

        return true;

    }
}