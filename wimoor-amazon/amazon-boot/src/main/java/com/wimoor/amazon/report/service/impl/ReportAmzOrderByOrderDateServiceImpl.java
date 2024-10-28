package com.wimoor.amazon.report.service.impl;

import cn.hutool.core.util.StrUtil;
import com.wimoor.amazon.auth.pojo.entity.AmazonAuthority;
import com.wimoor.amazon.auth.pojo.entity.Marketplace;
import com.wimoor.amazon.orders.mapper.OrdersReportMapper;
import com.wimoor.amazon.orders.pojo.entity.OrdersReport;
import com.wimoor.amazon.report.pojo.entity.ReportType;
import com.wimoor.amazon.util.EmojiFilterUtils;
import com.wimoor.common.GeneralUtil;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

@Service("reportAmzOrderByOrderDateService")
public class ReportAmzOrderByOrderDateServiceImpl extends ReportServiceImpl {

    @Resource
    OrdersReportMapper ordersReportMapper;

    public String treatResponse(AmazonAuthority amazonAuthority, BufferedReader br) {
        int lineNumber = 0;
        OrdersReport record = null;
        String line;
        Date begin = null;
        Date end = null;
        String mlog = "";
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("amazonAuthId", amazonAuthority.getId());
        Map<String, Integer> titleList = new HashMap<String, Integer>();
        try {
            try {
                while ((line = br.readLine()) != null) {
                    String[] info = line.split("\t");
                    int length = info.length;
                    if (lineNumber == 0) {
                        for (int i = 0; i < length; i++) {
                            titleList.put(info[i], i);
                        }
                    } else {
                        record = new OrdersReport();
                        String amazon_order_id = GeneralUtil.getStrValue(info, titleList, "amazon-order-id");
                        String merchant_order_id = GeneralUtil.getStrValue(info, titleList, "merchant-order-id");
                        String purchase_date = GeneralUtil.getStrValue(info, titleList, "purchase-date");
                        String last_updated_date = GeneralUtil.getStrValue(info, titleList, "last-updated-date");
                        String order_status = GeneralUtil.getStrValue(info, titleList, "order-status");
                        String fulfillment_channel = GeneralUtil.getStrValue(info, titleList, "fulfillment-channel");
                        String sales_channel = GeneralUtil.getStrValue(info, titleList, "sales-channel");
                        String order_channel = GeneralUtil.getStrValue(info, titleList, "order-channel");
                        String url = GeneralUtil.getStrValue(info, titleList, "url");
                        String ship_service_level = GeneralUtil.getStrValue(info, titleList, "ship-service-level");
                        String sku = GeneralUtil.getStrValue(info, titleList, "sku");
                        if (sku == null) {
                            System.out.println(amazon_order_id + ",sku is null");
                            continue;
                        }
                        String asin = GeneralUtil.getStrValue(info, titleList, "asin");
//					    number-of-items
                        String item_status = GeneralUtil.getStrValue(info, titleList, "item-status");
                        String quantity = GeneralUtil.getStrValue(info, titleList, "quantity");
                        String currency = GeneralUtil.getStrValue(info, titleList, "currency");
                        String item_price = GeneralUtil.getStrValue(info, titleList, "item-price");
                        String item_tax = GeneralUtil.getStrValue(info, titleList, "item-tax");
                        String shipping_price = GeneralUtil.getStrValue(info, titleList, "shipping-price");
                        String shipping_tax = GeneralUtil.getStrValue(info, titleList, "shipping-tax");
                        String gift_wrap_price = GeneralUtil.getStrValue(info, titleList, "gift-wrap-price");
                        String gift_wrap_tax = GeneralUtil.getStrValue(info, titleList, "gift-wrap-tax");
                        String item_promotion_discount = GeneralUtil.getStrValue(info, titleList,
                                "item-promotion-discount");
                        String ship_promotion_discount = GeneralUtil.getStrValue(info, titleList,
                                "ship-promotion-discount");
//					    address-type
                        String ship_city = GeneralUtil.getStrValue(info, titleList, "ship-city");
                        String ship_state = EmojiFilterUtils.filterEmoji(
                                GeneralUtil.getStrValue(info, titleList, "ship-state"));
                        String ship_postal_code = GeneralUtil.getStrValue(info, titleList, "ship-postal-code");
                        String ship_country = GeneralUtil.getStrValue(info, titleList, "ship-country");
                        String promotion_ids = GeneralUtil.getStrValue(info, titleList, "promotion-ids");
//					    payment-method-details
//					    item-extensions-data
                        String is_business_order = GeneralUtil.getStrValue(info, titleList, "is-business-order");
                        String purchase_order_number = GeneralUtil.getStrValue(info, titleList,
                                "purchase-order-number");
                        String price_designation = GeneralUtil.getStrValue(info, titleList, "price-designation");
                        // ============================================================
                        Marketplace marketPlace = marketplaceService.selectBySalesChannel(sales_channel);
                        if (marketPlace == null) {
                            if (StrUtil.isNotEmpty(currency) && !"EUR".equals(currency)) {
                                String marketplaceid = GeneralUtil.getMarketPlaceId(currency);
                                marketPlace = marketplaceService.selectByPKey(marketplaceid);
                            } else if (StrUtil.isNotEmpty(ship_country)) {
                                marketPlace = marketplaceService.findMarketplaceByCountry(ship_country);
                            }
                            if (marketPlace == null) {
                                marketPlace = amazonAuthority.getMarketPlace();
                            }
                        }
                        try {
                            record.setQuantity(quantity == null ? null : Integer.parseInt(quantity));
                        } catch (Exception e) {
                            mlog += ("SKU:" + sku + "的订单（" + amazon_order_id + "）的数据没能一一对应！");
                        }
                        record.setAmazonOrderId(amazon_order_id);
                        record.setMerchantOrderId(merchant_order_id);
                        if (StrUtil.isEmpty(purchase_date) || StrUtil.isEmpty(last_updated_date)) {
                            continue;
                        }
                        record.setPurchaseDate(GeneralUtil.getDatePlus(purchase_date, marketPlace.getMarket()));
                        record.setLastUpdatedDate(GeneralUtil.getDatePlus(last_updated_date, marketPlace.getMarket()));
                        if (begin == null || begin.after(record.getPurchaseDate())) {
                            begin = record.getPurchaseDate();
                        }
                        if (end == null || end.before(record.getPurchaseDate())) {
                            end = record.getPurchaseDate();
                        }
                        if (order_status != null && order_status.length() > 30) {
                            order_status = order_status.substring(0, 30);
                        }
                        record.setOrderStatus(order_status);
                        record.setFulfillmentChannel(fulfillment_channel);
                        record.setSalesChannel(sales_channel);
                        record.setUrl(url);
                        record.setShipServiceLevel(ship_service_level);
                        record.setSku(sku);
                        record.setAsin(asin);
                        record.setItemStatus(item_status);
                        record.setCurrency(currency);
                        record.setItemPrice(GeneralUtil.getBigDecimal(item_price));
                        record.setItemTax(GeneralUtil.getBigDecimal(item_tax));
                        record.setShippingPrice(GeneralUtil.getBigDecimal(shipping_price));
                        record.setShippingTax(GeneralUtil.getBigDecimal(shipping_tax));
                        record.setGiftWrapPrice(GeneralUtil.getBigDecimal(gift_wrap_price));
                        record.setGiftWrapTax(GeneralUtil.getBigDecimal(gift_wrap_tax));
                        record.setItemPromotionDiscount(GeneralUtil.getBigDecimal(item_promotion_discount));
                        record.setShipPromotionDiscount(GeneralUtil.getBigDecimal(ship_promotion_discount));
                        record.setShipCity(ship_city);
                        record.setOrderChannel(order_channel);
                        record.setShipState(ship_state);
                        record.setShipPostalCode(ship_postal_code);
                        record.setShipCountry(ship_country);
                        record.setPromotionIds(promotion_ids);
                        record.setIsBusinessOrder(is_business_order);
                        record.setPurchaseOrderNumber(purchase_order_number);
                        record.setPriceDesignation(price_designation);
                        record.setAmazonauthid(amazonAuthority.getId());
                        record.setMarketplaceId(marketPlace.getMarketplaceid());
                        record.getId();
                        param.put("amazonOrderId", amazon_order_id);
                        param.put("purchaseDate", record.getPurchaseDate());
                        param.put("sku", record.getSku());
                        //都是操作t_orders_report_download表
                        try {
                            ordersReportMapper.insertIntoDownload(record);
                        } catch (Exception e) {
                            e.printStackTrace();
                            mlog += ("SKU:" + sku + "的订单（" + amazon_order_id + "）插入报错！" + e.getMessage());
                        } finally {
                            record = null;
                        }
                    }
                    lineNumber++;
                }
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                mlog += e.getMessage();
            }

        } finally {
            titleList.clear();
            titleList = null;
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            System.gc();
        }
        return mlog.toString();
    }


    @Override
    public String myReportType() {
        // TODO Auto-generated method stub
        return ReportType.OrdersByOrderDateReport;
    }


}
