package com.wimoor.amazon.adv.report.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONReader;
import com.wimoor.amazon.adv.common.pojo.AmzAdvProfile;
import com.wimoor.amazon.adv.report.pojo.AmzAdvRequest;
import com.wimoor.amazon.adv.report.pojo.AmzAdvSumProductAds;
import com.wimoor.amazon.adv.report.service.IAmzAdvReportTreatService;
import com.wimoor.amazon.adv.sp.dao.AmzAdvReportCompaignsMapper;
import com.wimoor.amazon.adv.sp.pojo.AmzAdvReportCompaigns;
import com.wimoor.amazon.adv.sp.pojo.AmzAdvReportCompaignsAttributed;
import com.wimoor.amazon.adv.sp.pojo.AmzAdvReportCompaignsAttributedSame;
import com.wimoor.common.GeneralUtil;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;


@Service("amzAdvReportTreatCampaignsService")
public class AmzAdvReportTreatCampaignsServiceImpl extends AmzAdvReportTreatServiceImpl implements
        IAmzAdvReportTreatService {

    @Resource
    AmzAdvReportCompaignsMapper amzAdvReportCompaignsMapper;

    /*
     {"adProduct":"SPONSORED_PRODUCTS",
     "groupBy":["campaign"],
     "columns":["campaignId",
                "impressions","clicks", "cost", "spend","date",
                "purchases1d", "purchases7d", "purchases14d", "purchases30d",
                "purchasesSameSku1d", "purchasesSameSku7d", "purchasesSameSku14d", "purchasesSameSku30d",
                "unitsSoldClicks1d", "unitsSoldClicks7d", "unitsSoldClicks14d", "unitsSoldClicks30d",
                "sales1d", "sales7d", "sales14d", "sales30d",
                "attributedSalesSameSku1d", "attributedSalesSameSku7d", "attributedSalesSameSku14d", "attributedSalesSameSku30d",
                "unitsSoldSameSku1d", "unitsSoldSameSku7d", "unitsSoldSameSku14d", "unitsSoldSameSku30d",
                "kindleEditionNormalizedPagesRead14d", "kindleEditionNormalizedPagesRoyalties14d"],
     "reportTypeId":"spCampaigns",
     "timeUnit":"DAILY",
     "format":"GZIP_JSON"
     }
     */
    @Override
    public synchronized void treatReport(AmzAdvProfile profile, AmzAdvRequest request, JSONReader jsonReader) {
        // TODO Auto-generated method stub
        final List<AmzAdvReportCompaigns> list = new LinkedList<AmzAdvReportCompaigns>();
        final List<AmzAdvReportCompaignsAttributed> listAttributed = new LinkedList<AmzAdvReportCompaignsAttributed>();
        final List<AmzAdvReportCompaignsAttributedSame> listAttributedSame = new LinkedList<AmzAdvReportCompaignsAttributedSame>();
        String currency = profile.getCurrencycode();
        Map<String, AmzAdvSumProductAds> mapsum = new HashMap<String, AmzAdvSumProductAds>();
        try {
            jsonReader.startArray();
            while (jsonReader.hasNext()) {
                String elem = jsonReader.readString();
                JSONObject item = GeneralUtil.getJsonObject(elem);
                AmzAdvReportCompaigns amzAdvReportCompaigns = new AmzAdvReportCompaigns();
                AmzAdvReportCompaignsAttributed amzAdvReportCompaignsAttributed = new AmzAdvReportCompaignsAttributed();
                AmzAdvReportCompaignsAttributedSame amzAdvReportCompaignsAttributedSame = new AmzAdvReportCompaignsAttributedSame();
                amzAdvReportCompaigns.setProfileid(request.getProfileid());
                Date date = item.getDate("date");
                if (date == null) {
                    date = request.getStartDate();
                }
                amzAdvReportCompaigns.setBydate(date);
                amzAdvReportCompaigns.setCampaignid(item.getBigInteger("campaignId"));
                amzAdvReportCompaigns.setClicks(item.getInteger("clicks"));
                amzAdvReportCompaigns.setImpressions(item.getInteger("impressions"));
                amzAdvReportCompaigns.setCost(item.getBigDecimal("cost"));
                amzAdvReportCompaigns.setOpttime(new Date());
                amzAdvReportCompaignsAttributed.setBydate(amzAdvReportCompaigns.getBydate());
                amzAdvReportCompaignsAttributed.setCampaignid(amzAdvReportCompaigns.getCampaignid());
                amzAdvReportCompaignsAttributed.setAttributedsales1d(item.getBigDecimal("sales1d"));
                amzAdvReportCompaignsAttributed.setAttributedsales7d(item.getBigDecimal("sales7d"));
                amzAdvReportCompaignsAttributed.setAttributedsales14d(item.getBigDecimal("sales14d"));
                amzAdvReportCompaignsAttributed.setAttributedsales30d(item.getBigDecimal("sales30d"));

                amzAdvReportCompaignsAttributed.setAttributedunitsordered1d(item.getInteger("unitsSoldClicks1d"));
                amzAdvReportCompaignsAttributed.setAttributedunitsordered7d(item.getInteger("unitsSoldClicks7d"));
                amzAdvReportCompaignsAttributed.setAttributedunitsordered14d(item.getInteger("unitsSoldClicks14d"));
                amzAdvReportCompaignsAttributed.setAttributedunitsordered30d(item.getInteger("unitsSoldClicks30d"));

                amzAdvReportCompaignsAttributed.setAttributedconversions1d(item.getInteger("purchases1d"));
                amzAdvReportCompaignsAttributed.setAttributedconversions7d(item.getInteger("purchases7d"));
                amzAdvReportCompaignsAttributed.setAttributedconversions14d(item.getInteger("purchases14d"));
                amzAdvReportCompaignsAttributed.setAttributedconversions30d(item.getInteger("purchases30d"));

                amzAdvReportCompaignsAttributedSame.setBydate(amzAdvReportCompaigns.getBydate());
                amzAdvReportCompaignsAttributedSame.setCampaignid(amzAdvReportCompaigns.getCampaignid());
                amzAdvReportCompaignsAttributedSame.setAttributedsales1dsamesku(
                        item.getBigDecimal("attributedSalesSameSku1d"));
                amzAdvReportCompaignsAttributedSame.setAttributedsales7dsamesku(
                        item.getBigDecimal("attributedSalesSameSku7d"));
                amzAdvReportCompaignsAttributedSame.setAttributedsales14dsamesku(
                        item.getBigDecimal("attributedSalesSameSku14d"));
                amzAdvReportCompaignsAttributedSame.setAttributedsales30dsamesku(
                        item.getBigDecimal("attributedSalesSameSku30d"));

                amzAdvReportCompaignsAttributedSame.setAttributedconversions1dsamesku(
                        item.getInteger("purchasesSameSku1d"));
                amzAdvReportCompaignsAttributedSame.setAttributedconversions7dsamesku(
                        item.getInteger("purchasesSameSku7d"));
                amzAdvReportCompaignsAttributedSame.setAttributedconversions14dsamesku(
                        item.getInteger("purchasesSameSku14d"));
                amzAdvReportCompaignsAttributedSame.setAttributedconversions30dsamesku(
                        item.getInteger("purchasesSameSku30d"));

                amzAdvReportCompaignsAttributedSame.setAttributedUnitsOrdered1dSameSKU(
                        item.getInteger("unitsSoldSameSku1d"));
                amzAdvReportCompaignsAttributedSame.setAttributedUnitsOrdered7dSameSKU(
                        item.getInteger("unitsSoldSameSku7d"));
                amzAdvReportCompaignsAttributedSame.setAttributedUnitsOrdered14dSameSKU(
                        item.getInteger("unitsSoldSameSku14d"));
                amzAdvReportCompaignsAttributedSame.setAttributedUnitsOrdered30dSameSKU(
                        item.getInteger("unitsSoldSameSku30d"));

                addSummary(request, mapsum, date, "sp", amzAdvReportCompaigns.getClicks(),
                        currency, amzAdvReportCompaigns.getImpressions(), amzAdvReportCompaigns.getCost(),
                        amzAdvReportCompaignsAttributed.getAttributedsales7d(),
                        amzAdvReportCompaignsAttributed.getAttributedunitsordered7d(),
                        amzAdvReportCompaignsAttributed.getAttributedconversions7d());

                if ((amzAdvReportCompaigns.getClicks() == null || amzAdvReportCompaigns.getClicks() == 0)
                        && (amzAdvReportCompaigns.getImpressions() == null
                        || amzAdvReportCompaigns.getImpressions() == 0)
                        && (amzAdvReportCompaigns.getCost() == null
                        || amzAdvReportCompaigns.getCost().compareTo(new BigDecimal("0")) == 0)
                ) {
                    continue;
                }
                if (!amzAdvReportCompaignsAttributed.isZero()) {
                    listAttributed.add(amzAdvReportCompaignsAttributed);
                }
                if (!amzAdvReportCompaignsAttributedSame.isZero()) {
                    listAttributedSame.add(amzAdvReportCompaignsAttributedSame);
                }
                list.add(amzAdvReportCompaigns);
                if (list.size() >= 2000) {
                    amzAdvReportCompaignsMapper.insertBatch(list);
                    list.clear();
                }
                if (listAttributed.size() >= 2000) {
                    amzAdvReportCompaignsMapper.insertBatchAttributed(listAttributed);
                    listAttributed.clear();
                }
                if (listAttributedSame.size() >= 2000) {
                    amzAdvReportCompaignsMapper.insertBatchAttributedSame(listAttributedSame);
                    listAttributedSame.clear();
                }
            }
            if (list.size() > 0) {
                amzAdvReportCompaignsMapper.insertBatch(list);
            }
            if (listAttributed.size() > 0) {
                amzAdvReportCompaignsMapper.insertBatchAttributed(listAttributed);
            }
            if (listAttributedSame.size() > 0) {
                amzAdvReportCompaignsMapper.insertBatchAttributedSame(listAttributedSame);
            }

            for (Entry<String, AmzAdvSumProductAds> entry : mapsum.entrySet()) {
                AmzAdvSumProductAds record = entry.getValue();
                AmzAdvSumProductAds old = amzAdvSumProductAdsMapper.selectByKey(record);
                if (old != null) {
                    amzAdvSumProductAdsMapper.updateByKey(record);
                } else {
                    amzAdvSumProductAdsMapper.insert(record);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
