package com.wimoor.amazon.adv.sp.pojo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.wimoor.amazon.adv.common.pojo.JsonBigIntergeSerializer;
import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.Id;


public class AmzAdvCampKeywordsNegativaKey {

    @Column(name = "campaignId")
    @JsonSerialize(using = JsonBigIntergeSerializer.class)
    private BigInteger campaignid;

    @Id
    @Column(name = "keywordId")
    @JsonSerialize(using = JsonBigIntergeSerializer.class)
    private BigInteger keywordid;

    @Column(name = "profileid")
    @JsonSerialize(using = JsonBigIntergeSerializer.class)
    private BigInteger profileid;

    public BigInteger getProfileid() {
        return profileid;
    }

    public void setProfileid(BigInteger profileid) {
        this.profileid = profileid;
    }

    public BigInteger getCampaignid() {
        return campaignid;
    }

    public void setCampaignid(BigInteger campaignid) {
        this.campaignid = campaignid;
    }

    public BigInteger getKeywordid() {
        return keywordid;
    }

    public void setKeywordid(BigInteger keywordid) {
        this.keywordid = keywordid;
    }


}