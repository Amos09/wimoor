REPLACE INTO `t_amz_adv_report_request_type` (`id`, `campaigntype`, `reporttype`, `segment`, `activeType`, `metrics`, `bean`, `reponsetype`, `nomarket`, `disablevendor`) VALUES (101, 'sp', 'campaigns', NULL, NULL, '{"adProduct":"SPONSORED_PRODUCTS",\r\n "groupBy":["campaign"],\r\n "columns":["campaignId",\r\n    	    "impressions","clicks", "cost","date",\r\n    	    "purchases1d", "purchases7d", "purchases14d", "purchases30d", \r\n    	    "purchasesSameSku1d", "purchasesSameSku7d", "purchasesSameSku14d", "purchasesSameSku30d", \r\n    	    "unitsSoldClicks1d", "unitsSoldClicks7d", "unitsSoldClicks14d", "unitsSoldClicks30d", \r\n    	    "sales1d", "sales7d", "sales14d", "sales30d", \r\n    	    "attributedSalesSameSku1d", "attributedSalesSameSku7d", "attributedSalesSameSku14d", "attributedSalesSameSku30d", \r\n    	    "unitsSoldSameSku1d", "unitsSoldSameSku7d", "unitsSoldSameSku14d", "unitsSoldSameSku30d", \r\n    	    "kindleEditionNormalizedPagesRead14d", "kindleEditionNormalizedPagesRoyalties14d"],\r\n "reportTypeId":"spCampaigns",\r\n "timeUnit":"DAILY",\r\n "format":"GZIP_JSON"\r\n }\r\n					 \r\n ', 'amzAdvReportTreatCampaignsService', 'campaign', NULL, b'0');
REPLACE INTO `t_amz_adv_report_request_type` (`id`, `campaigntype`, `reporttype`, `segment`, `activeType`, `metrics`, `bean`, `reponsetype`, `nomarket`, `disablevendor`) VALUES (102, 'sp', 'campaigns', 'placement', NULL, '{"adProduct":"SPONSORED_PRODUCTS",\r\n "groupBy":["campaign","campaignPlacement"],\r\n "columns":["campaignId","placementClassification",\r\n    	    "impressions","clicks", "cost","date",\r\n    	    "purchases1d", "purchases7d", "purchases14d", "purchases30d", \r\n    	    "purchasesSameSku1d", "purchasesSameSku7d", "purchasesSameSku14d", "purchasesSameSku30d", \r\n    	    "unitsSoldClicks1d", "unitsSoldClicks7d", "unitsSoldClicks14d", "unitsSoldClicks30d", \r\n    	    "sales1d", "sales7d", "sales14d", "sales30d", \r\n    	    "attributedSalesSameSku1d", "attributedSalesSameSku7d", "attributedSalesSameSku14d", "attributedSalesSameSku30d", \r\n    	    "unitsSoldSameSku1d", "unitsSoldSameSku7d", "unitsSoldSameSku14d", "unitsSoldSameSku30d", \r\n    	    "kindleEditionNormalizedPagesRead14d", "kindleEditionNormalizedPagesRoyalties14d"],\r\n "reportTypeId":"spCampaigns",\r\n "timeUnit":"DAILY",\r\n "format":"GZIP_JSON"\r\n }\r\n					 \r\n ', 'amzAdvReportTreatCampaignsPlaceService', 'campaign', NULL, b'0');
REPLACE INTO `t_amz_adv_report_request_type` (`id`, `campaigntype`, `reporttype`, `segment`, `activeType`, `metrics`, `bean`, `reponsetype`, `nomarket`, `disablevendor`) VALUES (103, 'sp', 'adGroups', NULL, NULL, '{"adProduct":"SPONSORED_PRODUCTS",\r\n "groupBy":["campaign","adGroup"],\r\n "columns":["campaignId","adGroupId",\r\n    	    "impressions","clicks", "cost","date",\r\n    	    "purchases1d", "purchases7d", "purchases14d", "purchases30d", \r\n    	    "purchasesSameSku1d", "purchasesSameSku7d", "purchasesSameSku14d", "purchasesSameSku30d", \r\n    	    "unitsSoldClicks1d", "unitsSoldClicks7d", "unitsSoldClicks14d", "unitsSoldClicks30d", \r\n    	    "sales1d", "sales7d", "sales14d", "sales30d", \r\n    	    "attributedSalesSameSku1d", "attributedSalesSameSku7d", "attributedSalesSameSku14d", "attributedSalesSameSku30d", \r\n    	    "unitsSoldSameSku1d", "unitsSoldSameSku7d", "unitsSoldSameSku14d", "unitsSoldSameSku30d", \r\n    	    "kindleEditionNormalizedPagesRead14d", "kindleEditionNormalizedPagesRoyalties14d"],\r\n "reportTypeId":"spCampaigns",\r\n "timeUnit":"DAILY",\r\n "format":"GZIP_JSON"\r\n }\r\n					 \r\n ', 'amzAdvReportTreatAdgroupsService', 'adGroup', NULL, b'0');
REPLACE INTO `t_amz_adv_report_request_type` (`id`, `campaigntype`, `reporttype`, `segment`, `activeType`, `metrics`, `bean`, `reponsetype`, `nomarket`, `disablevendor`) VALUES (104, 'sp', 'productAds', NULL, NULL, '{"adProduct":"SPONSORED_PRODUCTS",\r\n "groupBy":["advertiser"],\r\n "columns":["date","campaignId", "adGroupId", "adId", \r\n            "impressions", "clicks", "cost", \r\n            "purchases1d", "purchases7d", "purchases14d", "purchases30d", \r\n            "purchasesSameSku1d", "purchasesSameSku7d", "purchasesSameSku14d", "purchasesSameSku30d", \r\n            "unitsSoldClicks1d", "unitsSoldClicks7d", "unitsSoldClicks14d", "unitsSoldClicks30d", \r\n            "sales1d", "sales7d", "sales14d", "sales30d", \r\n            "attributedSalesSameSku1d", "attributedSalesSameSku7d", "attributedSalesSameSku14d", "attributedSalesSameSku30d", \r\n            "salesOtherSku7d", \r\n            "unitsSoldSameSku1d", "unitsSoldSameSku7d", "unitsSoldSameSku14d", "unitsSoldSameSku30d", "unitsSoldOtherSku7d", \r\n            "kindleEditionNormalizedPagesRead14d", "kindleEditionNormalizedPagesRoyalties14d", \r\n            "acosClicks7d", "acosClicks14d", "roasClicks7d", "roasClicks14d"],\r\n "reportTypeId":"spAdvertisedProduct",\r\n "timeUnit":"DAILY",\r\n "format":"GZIP_JSON"\r\n }\r\n					 \r\n ', 'amzAdvReportTreatProductService', 'productAd', NULL, b'0');
REPLACE INTO `t_amz_adv_report_request_type` (`id`, `campaigntype`, `reporttype`, `segment`, `activeType`, `metrics`, `bean`, `reponsetype`, `nomarket`, `disablevendor`) VALUES (105, 'sp', 'targets', NULL, NULL, '{"adProduct":"SPONSORED_PRODUCTS",\r\n "groupBy":["targeting"],\r\n "columns":["date","campaignId", "adGroupId", "keywordId", \r\n            "impressions", "clicks", "cost", \r\n            "purchases1d", "purchases7d", "purchases14d", "purchases30d", \r\n            "purchasesSameSku1d", "purchasesSameSku7d", "purchasesSameSku14d", "purchasesSameSku30d", \r\n            "unitsSoldClicks1d", "unitsSoldClicks7d", "unitsSoldClicks14d", "unitsSoldClicks30d", \r\n            "sales1d", "sales7d", "sales14d", "sales30d", \r\n            "attributedSalesSameSku1d", "attributedSalesSameSku7d", "attributedSalesSameSku14d", "attributedSalesSameSku30d", \r\n            "salesOtherSku7d", \r\n            "unitsSoldSameSku1d", "unitsSoldSameSku7d", "unitsSoldSameSku14d", "unitsSoldSameSku30d", "unitsSoldOtherSku7d", \r\n            "kindleEditionNormalizedPagesRead14d", "kindleEditionNormalizedPagesRoyalties14d", \r\n            "acosClicks7d", "acosClicks14d", "roasClicks7d", "roasClicks14d"],\r\n "filters":[\r\n                {\r\n                    "field": "keywordType",\r\n                    "values": [\r\n                    "TARGETING_EXPRESSION",\r\n                    "TARGETING_EXPRESSION_PREDEFINED"\r\n                    ]\r\n                }\r\n            ],\r\n "reportTypeId":"spTargeting",\r\n "timeUnit":"DAILY",\r\n "format":"GZIP_JSON"\r\n }\r\n					 \r\n ', 'amzAdvReportTreatProductTargetService', 'targets', NULL, b'0');
REPLACE INTO `t_amz_adv_report_request_type` (`id`, `campaigntype`, `reporttype`, `segment`, `activeType`, `metrics`, `bean`, `reponsetype`, `nomarket`, `disablevendor`) VALUES (106, 'sp', 'keywords', NULL, NULL, '{"adProduct":"SPONSORED_PRODUCTS",\r\n "groupBy":["targeting"],\r\n "columns":["date","campaignId", "adGroupId", "keywordId", \r\n            "impressions", "clicks", "cost", \r\n            "purchases1d", "purchases7d", "purchases14d", "purchases30d", \r\n            "purchasesSameSku1d", "purchasesSameSku7d", "purchasesSameSku14d", "purchasesSameSku30d", \r\n            "unitsSoldClicks1d", "unitsSoldClicks7d", "unitsSoldClicks14d", "unitsSoldClicks30d", \r\n            "sales1d", "sales7d", "sales14d", "sales30d",  "salesOtherSku7d", \r\n            "attributedSalesSameSku1d", "attributedSalesSameSku7d", "attributedSalesSameSku14d", "attributedSalesSameSku30d", \r\n            "unitsSoldSameSku1d", "unitsSoldSameSku7d", "unitsSoldSameSku14d", "unitsSoldSameSku30d", "unitsSoldOtherSku7d", \r\n            "kindleEditionNormalizedPagesRead14d", "kindleEditionNormalizedPagesRoyalties14d", \r\n            "acosClicks7d", "acosClicks14d", "roasClicks7d", "roasClicks14d"],\r\n "filters":[\r\n                {\r\n                    "field": "keywordType",\r\n                    "values": [\r\n                    "BROAD",\r\n                    "PHRASE",\r\n                    "EXACT"\r\n                    ]\r\n                }\r\n            ],\r\n "reportTypeId":"spTargeting",\r\n "timeUnit":"DAILY",\r\n "format":"GZIP_JSON"\r\n }\r\n					 \r\n ', 'amzAdvReportTreatKeywordsService', 'keyword', NULL, b'0');
REPLACE INTO `t_amz_adv_report_request_type` (`id`, `campaigntype`, `reporttype`, `segment`, `activeType`, `metrics`, `bean`, `reponsetype`, `nomarket`, `disablevendor`) VALUES (107, 'sp', 'keywords', 'query', NULL, '{"adProduct":"SPONSORED_PRODUCTS",\r\n "groupBy":["searchTerm"],\r\n "columns":["date","campaignId", "adGroupId", "keywordId", "searchTerm",\r\n            "impressions", "clicks", "cost", \r\n            "purchases1d", "purchases7d", "purchases14d", "purchases30d", \r\n            "purchasesSameSku1d", "purchasesSameSku7d", "purchasesSameSku14d", "purchasesSameSku30d", \r\n            "unitsSoldClicks1d", "unitsSoldClicks7d", "unitsSoldClicks14d", "unitsSoldClicks30d", \r\n            "sales1d", "sales7d", "sales14d", "sales30d", \r\n            "attributedSalesSameSku1d", "attributedSalesSameSku7d", "attributedSalesSameSku14d", "attributedSalesSameSku30d", \r\n            "unitsSoldSameSku1d", "unitsSoldSameSku7d", "unitsSoldSameSku14d", "unitsSoldSameSku30d", "unitsSoldOtherSku7d", \r\n            "kindleEditionNormalizedPagesRead14d", "kindleEditionNormalizedPagesRoyalties14d", \r\n            "acosClicks7d", "acosClicks14d", "roasClicks7d", "roasClicks14d"],\r\n "filters":[\r\n            {\r\n                "field": "keywordType",\r\n                "values": [\r\n                    "BROAD",\r\n                    "PHRASE",\r\n                    "EXACT"\r\n                ]\r\n            }\r\n        ],\r\n "reportTypeId":"spSearchTerm",\r\n "timeUnit":"DAILY",\r\n "format":"GZIP_JSON"\r\n }\r\n					 \r\n ', 'amzAdvReportTreatKeywordsQuryService', 'keyword', NULL, b'0');
REPLACE INTO `t_amz_adv_report_request_type` (`id`, `campaigntype`, `reporttype`, `segment`, `activeType`, `metrics`, `bean`, `reponsetype`, `nomarket`, `disablevendor`) VALUES (108, 'sp', 'asins', NULL, NULL, '{"adProduct":"SPONSORED_PRODUCTS",\r\n "groupBy":["asin"],\r\n "columns":["date", "campaignId", "adGroupId", "keywordId", "advertisedAsin", "purchasedAsin", "advertisedSku", \r\n            "unitsSoldClicks1d", "unitsSoldClicks7d", "unitsSoldClicks14d", "unitsSoldClicks30d", \r\n            "sales1d", "sales7d", "sales14d", "sales30d", \r\n            "purchases1d", "purchases7d", "purchases14d", "purchases30d", \r\n            "unitsSoldOtherSku1d", "unitsSoldOtherSku7d", "unitsSoldOtherSku14d", "unitsSoldOtherSku30d", \r\n            "salesOtherSku1d", "salesOtherSku7d", "salesOtherSku14d", "salesOtherSku30d", \r\n            "purchasesOtherSku1d", "purchasesOtherSku7d", "purchasesOtherSku14d", "purchasesOtherSku30d", \r\n            "kindleEditionNormalizedPagesRead14d", "kindleEditionNormalizedPagesRoyalties14d"],\r\n "reportTypeId":"spPurchasedProduct",\r\n "timeUnit":"DAILY",\r\n "format":"GZIP_JSON"\r\n }', 'amzAdvReportTreatAsinsService', 'otherAsin', NULL, b'0');
REPLACE INTO `t_amz_adv_report_request_type` (`id`, `campaigntype`, `reporttype`, `segment`, `activeType`, `metrics`, `bean`, `reponsetype`, `nomarket`, `disablevendor`) VALUES (109, 'sp', 'targets', 'query', NULL, '{"adProduct":"SPONSORED_PRODUCTS",\r\n "groupBy":["searchTerm"],\r\n "columns":["date","campaignId", "adGroupId", "keywordId", "searchTerm",\r\n            "impressions", "clicks", "cost", \r\n            "purchases1d", "purchases7d", "purchases14d", "purchases30d", \r\n            "purchasesSameSku1d", "purchasesSameSku7d", "purchasesSameSku14d", "purchasesSameSku30d", \r\n            "unitsSoldClicks1d", "unitsSoldClicks7d", "unitsSoldClicks14d", "unitsSoldClicks30d", \r\n            "sales1d", "sales7d", "sales14d", "sales30d", \r\n            "attributedSalesSameSku1d", "attributedSalesSameSku7d", "attributedSalesSameSku14d", "attributedSalesSameSku30d", \r\n            "unitsSoldSameSku1d", "unitsSoldSameSku7d", "unitsSoldSameSku14d", "unitsSoldSameSku30d", "unitsSoldOtherSku7d", \r\n            "kindleEditionNormalizedPagesRead14d", "kindleEditionNormalizedPagesRoyalties14d", \r\n            "acosClicks7d", "acosClicks14d", "roasClicks7d", "roasClicks14d"],\r\n "filters": [\r\n            {\r\n                "field": "keywordType",\r\n                "values": [\r\n                    "TARGETING_EXPRESSION",\r\n                    "TARGETING_EXPRESSION_PREDEFINED"\r\n                ]\r\n            }\r\n        ],\r\n "reportTypeId":"spSearchTerm",\r\n "timeUnit":"DAILY",\r\n "format":"GZIP_JSON"\r\n }\r\n					 \r\n ', 'amzAdvReportTreatTargetQueryService', 'targets', NULL, b'0');
REPLACE INTO `t_amz_adv_report_request_type` (`id`, `campaigntype`, `reporttype`, `segment`, `activeType`, `metrics`, `bean`, `reponsetype`, `nomarket`, `disablevendor`) VALUES (221, 'hsa', 'campaigns', NULL, NULL, 'campaignBudget,\r\nimpressions,clicks,cost,\r\nattributedSales14d,attributedSales14dSameSKU,attributedConversions14d,attributedConversions14dSameSKU,\r\nattributedDetailPageViewsClicks14d,attributedOrdersNewToBrand14d,attributedOrdersNewToBrandPercentage14d,attributedOrderRateNewToBrand14d,\r\nattributedSalesNewToBrand14d,attributedSalesNewToBrandPercentage14d,attributedUnitsOrderedNewToBrand14d,attributedUnitsOrderedNewToBrandPercentage14d,\r\nunitsSold14d,dpv14d,attributedBrandedSearches14d,topOfSearchImpressionShare', 'amzAdvReportTreatCampaignsHsaService', 'campaign', NULL, b'0');
REPLACE INTO `t_amz_adv_report_request_type` (`id`, `campaigntype`, `reporttype`, `segment`, `activeType`, `metrics`, `bean`, `reponsetype`, `nomarket`, `disablevendor`) VALUES (222, 'hsa', 'campaigns', NULL, 'video', 'campaignBudget,\r\nimpressions,clicks,cost,\r\nattributedSales14d,attributedSales14dSameSKU,attributedConversions14d,attributedConversions14dSameSKU,\r\nviewableImpressions,videoFirstQuartileViews,videoMidpointViews,videoThirdQuartileViews,	\r\nvideoCompleteViews,video5SecondViews,video5SecondViewRate,videoUnmutes,vtr,vctr,attributedBrandedSearches14d', 'amzAdvReportTreatCampaignsHsaService', 'campaign', NULL, b'0');
REPLACE INTO `t_amz_adv_report_request_type` (`id`, `campaigntype`, `reporttype`, `segment`, `activeType`, `metrics`, `bean`, `reponsetype`, `nomarket`, `disablevendor`) VALUES (223, 'hsa', 'campaigns', 'placement', NULL, 'campaignId,campaignBudget,\r\nimpressions,clicks,cost,\r\nattributedSales14d,attributedSales14dSameSKU,attributedConversions14d,attributedConversions14dSameSKU,\r\nattributedDetailPageViewsClicks14d,attributedOrdersNewToBrand14d,attributedOrdersNewToBrandPercentage14d,attributedOrderRateNewToBrand14d,\r\nattributedSalesNewToBrand14d,attributedSalesNewToBrandPercentage14d,attributedUnitsOrderedNewToBrand14d,attributedUnitsOrderedNewToBrandPercentage14d,\r\nunitsSold14d,dpv14d,attributedBrandedSearches14d', 'amzAdvReportTreatCampaignsPlaceHsaService', 'campaign', NULL, b'0');
REPLACE INTO `t_amz_adv_report_request_type` (`id`, `campaigntype`, `reporttype`, `segment`, `activeType`, `metrics`, `bean`, `reponsetype`, `nomarket`, `disablevendor`) VALUES (224, 'hsa', 'campaigns', 'placement', 'video', 'campaignId,campaignBudget,\r\nimpressions,clicks,cost,\r\nattributedSales14d,attributedSales14dSameSKU,attributedConversions14d,attributedConversions14dSameSKU,\r\nviewableImpressions,videoFirstQuartileViews,videoMidpointViews,videoThirdQuartileViews,	\r\nvideoCompleteViews,video5SecondViews,video5SecondViewRate,videoUnmutes,vtr,vctr', 'amzAdvReportTreatCampaignsPlaceHsaService', 'campaign', NULL, b'0');
REPLACE INTO `t_amz_adv_report_request_type` (`id`, `campaigntype`, `reporttype`, `segment`, `activeType`, `metrics`, `bean`, `reponsetype`, `nomarket`, `disablevendor`) VALUES (225, 'hsa', 'targets', NULL, 'all', 'campaignId,adGroupId,targetId,\r\nimpressions,clicks,cost,\r\nattributedSales14d,attributedSales14dSameSKU,attributedConversions14d,attributedConversions14dSameSKU,\r\nattributedDetailPageViewsClicks14d,attributedOrdersNewToBrand14d,attributedOrdersNewToBrandPercentage14d,attributedOrderRateNewToBrand14d,\r\nattributedSalesNewToBrand14d,attributedSalesNewToBrandPercentage14d,attributedUnitsOrderedNewToBrand14d,attributedUnitsOrderedNewToBrandPercentage14d,\r\nunitsSold14d,dpv14d', 'amzAdvReportTreatProductTargetHsaService', 'targets', NULL, b'0');
REPLACE INTO `t_amz_adv_report_request_type` (`id`, `campaigntype`, `reporttype`, `segment`, `activeType`, `metrics`, `bean`, `reponsetype`, `nomarket`, `disablevendor`) VALUES (226, 'hsa', 'keywords', NULL, NULL, 'campaignId,adGroupId,keywordId,keywordBid,\r\nimpressions,clicks,cost,\r\nattributedSales14d,attributedSales14dSameSKU,attributedConversions14d,attributedConversions14dSameSKU,\r\nattributedDetailPageViewsClicks14d,attributedOrdersNewToBrand14d,attributedOrdersNewToBrandPercentage14d,attributedOrderRateNewToBrand14d,\r\nattributedSalesNewToBrand14d,attributedSalesNewToBrandPercentage14d,attributedUnitsOrderedNewToBrand14d,attributedUnitsOrderedNewToBrandPercentage14d,\r\nunitsSold14d,dpv14d', 'amzAdvReportTreatKeywordsHsaService', 'keyword', NULL, b'0');
REPLACE INTO `t_amz_adv_report_request_type` (`id`, `campaigntype`, `reporttype`, `segment`, `activeType`, `metrics`, `bean`, `reponsetype`, `nomarket`, `disablevendor`) VALUES (227, 'hsa', 'keywords', NULL, 'video', 'campaignId,adGroupId,keywordId,keywordBid,\r\nimpressions,clicks,cost,\r\nattributedSales14d,attributedSales14dSameSKU,attributedConversions14d,attributedConversions14dSameSKU,\r\nviewableImpressions,videoFirstQuartileViews,videoMidpointViews,videoThirdQuartileViews,	\r\nvideoCompleteViews,video5SecondViews,video5SecondViewRate,videoUnmutes,vtr,vctr', 'amzAdvReportTreatKeywordsHsaService', 'keyword', NULL, b'0');
REPLACE INTO `t_amz_adv_report_request_type` (`id`, `campaigntype`, `reporttype`, `segment`, `activeType`, `metrics`, `bean`, `reponsetype`, `nomarket`, `disablevendor`) VALUES (228, 'hsa', 'keywords', 'query', NULL, 'keywordId,campaignId,adGroupId,impressions,clicks,cost,attributedSales14d,attributedConversions14d\r\n', 'amzAdvReportTreatKeywordsHsaQuryService', 'keyword', NULL, b'0');
REPLACE INTO `t_amz_adv_report_request_type` (`id`, `campaigntype`, `reporttype`, `segment`, `activeType`, `metrics`, `bean`, `reponsetype`, `nomarket`, `disablevendor`) VALUES (229, 'hsa', 'keywords', 'query', 'video', 'keywordId,campaignId,adGroupId,impressions,clicks,cost,attributedSales14d,attributedConversions14d\r\n', 'amzAdvReportTreatKeywordsHsaQuryService', 'keyword', NULL, b'0');
REPLACE INTO `t_amz_adv_report_request_type` (`id`, `campaigntype`, `reporttype`, `segment`, `activeType`, `metrics`, `bean`, `reponsetype`, `nomarket`, `disablevendor`) VALUES (321, 'sd', 'campaigns', 'T00001', NULL, 'campaignId,clicks,cost,impressions,attributedDPV14d,attributedUnitsSold14d,attributedSales14d', 'amzAdvReportTreatCampaignsT00001SDService', 'campaigns', 'A1AM78C64UM0Y8,ATVPDKIKX0DER,A2EUQ1WTGCTBG2', b'1');
REPLACE INTO `t_amz_adv_report_request_type` (`id`, `campaigntype`, `reporttype`, `segment`, `activeType`, `metrics`, `bean`, `reponsetype`, `nomarket`, `disablevendor`) VALUES (322, 'sd', 'campaigns', 'T00020', NULL, 'campaignId,impressions,clicks,cost,\r\nattributedConversions1d,attributedConversions7d,attributedConversions14d,attributedConversions30d,\r\nattributedUnitsOrdered1d,attributedUnitsOrdered7d,attributedUnitsOrdered14d,attributedUnitsOrdered30d,\r\nattributedSales1d,attributedSales7d,attributedSales14d,attributedSales30d,\r\nattributedConversions1dSameSKU,attributedConversions7dSameSKU,attributedConversions14dSameSKU,attributedConversions30dSameSKU,\r\nattributedSales1dSameSKU,attributedSales7dSameSKU,attributedSales14dSameSKU,attributedSales30dSameSKU,\r\nattributedOrdersNewToBrand14d,attributedSalesNewToBrand14d,attributedUnitsOrderedNewToBrand14d,\r\nviewImpressions,viewAttributedConversions14d,viewAttributedSales14d,viewAttributedUnitsOrdered14d', 'amzAdvReportTreatCampaignsSDService', 'campaigns', 'A1C3SOZRARQ6R3', b'0');
REPLACE INTO `t_amz_adv_report_request_type` (`id`, `campaigntype`, `reporttype`, `segment`, `activeType`, `metrics`, `bean`, `reponsetype`, `nomarket`, `disablevendor`) VALUES (323, 'sd', 'campaigns', 'T00030', NULL, 'campaignId,impressions,clicks,cost,\r\nattributedConversions1d,attributedConversions7d,attributedConversions14d,attributedConversions30d,\r\nattributedUnitsOrdered1d,attributedUnitsOrdered7d,attributedUnitsOrdered14d,attributedUnitsOrdered30d,\r\nattributedSales1d,attributedSales7d,attributedSales14d,attributedSales30d,\r\nattributedConversions1dSameSKU,attributedConversions7dSameSKU,attributedConversions14dSameSKU,attributedConversions30dSameSKU,\r\nattributedSales1dSameSKU,attributedSales7dSameSKU,attributedSales14dSameSKU,attributedSales30dSameSKU,\r\nattributedOrdersNewToBrand14d,attributedSalesNewToBrand14d,attributedUnitsOrderedNewToBrand14d,\r\nviewImpressions,viewAttributedConversions14d,viewAttributedSales14d,viewAttributedUnitsOrdered14d', 'amzAdvReportTreatCampaignsSDService', 'campaigns', NULL, b'0');
REPLACE INTO `t_amz_adv_report_request_type` (`id`, `campaigntype`, `reporttype`, `segment`, `activeType`, `metrics`, `bean`, `reponsetype`, `nomarket`, `disablevendor`) VALUES (324, 'sd', 'campaigns', 'remarketing', NULL, 'campaignId,impressions,clicks,cost,\r\nattributedConversions1d,attributedConversions7d,attributedConversions14d,attributedConversions30d,\r\nattributedUnitsOrdered1d,attributedUnitsOrdered7d,attributedUnitsOrdered14d,attributedUnitsOrdered30d,\r\nattributedSales1d,attributedSales7d,attributedSales14d,attributedSales30d,\r\nattributedConversions1dSameSKU,attributedConversions7dSameSKU,attributedConversions14dSameSKU,attributedConversions30dSameSKU,\r\nattributedSales1dSameSKU,attributedSales7dSameSKU,attributedSales14dSameSKU,attributedSales30dSameSKU,\r\nattributedOrdersNewToBrand14d,attributedSalesNewToBrand14d,attributedUnitsOrderedNewToBrand14d,\r\nviewImpressions,viewAttributedConversions14d,viewAttributedSales14d,viewAttributedUnitsOrdered14d', 'amzAdvReportTreatCampaignsSDService', 'campaigns', 'ATVPDKIKX0DER', b'0');
REPLACE INTO `t_amz_adv_report_request_type` (`id`, `campaigntype`, `reporttype`, `segment`, `activeType`, `metrics`, `bean`, `reponsetype`, `nomarket`, `disablevendor`) VALUES (325, 'sd', 'adGroups', 'T00020', NULL, 'adGroupId,campaignId,impressions,clicks,cost,\r\nattributedConversions1d,attributedConversions7d,attributedConversions14d,attributedConversions30d,\r\nattributedUnitsOrdered1d,attributedUnitsOrdered7d,attributedUnitsOrdered14d,attributedUnitsOrdered30d,\r\nattributedSales1d,attributedSales7d,attributedSales14d,attributedSales30d,\r\nattributedConversions1dSameSKU,attributedConversions7dSameSKU,attributedConversions14dSameSKU,attributedConversions30dSameSKU,\r\nattributedSales1dSameSKU,attributedSales7dSameSKU,attributedSales14dSameSKU,attributedSales30dSameSKU,\r\nattributedOrdersNewToBrand14d,attributedSalesNewToBrand14d,attributedUnitsOrderedNewToBrand14d,\r\nviewImpressions,viewAttributedConversions14d,viewAttributedSales14d,viewAttributedUnitsOrdered14d', 'amzAdvReportTreatAdgroupsSDService', 'adGroups', NULL, b'0');
REPLACE INTO `t_amz_adv_report_request_type` (`id`, `campaigntype`, `reporttype`, `segment`, `activeType`, `metrics`, `bean`, `reponsetype`, `nomarket`, `disablevendor`) VALUES (326, 'sd', 'adGroups', 'T00030', NULL, 'adGroupId,campaignId,impressions,clicks,cost,\r\nattributedConversions1d,attributedConversions7d,attributedConversions14d,attributedConversions30d,\r\nattributedUnitsOrdered1d,attributedUnitsOrdered7d,attributedUnitsOrdered14d,attributedUnitsOrdered30d,\r\nattributedSales1d,attributedSales7d,attributedSales14d,attributedSales30d,\r\nattributedConversions1dSameSKU,attributedConversions7dSameSKU,attributedConversions14dSameSKU,attributedConversions30dSameSKU,\r\nattributedSales1dSameSKU,attributedSales7dSameSKU,attributedSales14dSameSKU,attributedSales30dSameSKU,\r\nattributedOrdersNewToBrand14d,attributedSalesNewToBrand14d,attributedUnitsOrderedNewToBrand14d,\r\nviewImpressions,viewAttributedConversions14d,viewAttributedSales14d,viewAttributedUnitsOrdered14d', 'amzAdvReportTreatAdgroupsSDService', 'adGroups', NULL, b'0');
REPLACE INTO `t_amz_adv_report_request_type` (`id`, `campaigntype`, `reporttype`, `segment`, `activeType`, `metrics`, `bean`, `reponsetype`, `nomarket`, `disablevendor`) VALUES (327, 'sd', 'adGroups', 'remarketing', NULL, 'adGroupId,campaignId,impressions,clicks,cost,\r\nattributedConversions1d,attributedConversions7d,attributedConversions14d,attributedConversions30d,\r\nattributedUnitsOrdered1d,attributedUnitsOrdered7d,attributedUnitsOrdered14d,attributedUnitsOrdered30d,\r\nattributedSales1d,attributedSales7d,attributedSales14d,attributedSales30d,\r\nattributedConversions1dSameSKU,attributedConversions7dSameSKU,attributedConversions14dSameSKU,attributedConversions30dSameSKU,\r\nattributedSales1dSameSKU,attributedSales7dSameSKU,attributedSales14dSameSKU,attributedSales30dSameSKU,\r\nattributedOrdersNewToBrand14d,attributedSalesNewToBrand14d,attributedUnitsOrderedNewToBrand14d,\r\nviewImpressions,viewAttributedConversions14d,viewAttributedSales14d,viewAttributedUnitsOrdered14d', 'amzAdvReportTreatAdgroupsSDService', 'adGroups', 'ATVPDKIKX0DER', b'0');
REPLACE INTO `t_amz_adv_report_request_type` (`id`, `campaigntype`, `reporttype`, `segment`, `activeType`, `metrics`, `bean`, `reponsetype`, `nomarket`, `disablevendor`) VALUES (328, 'sd', 'productAds', 'T00020', NULL, 'campaignId,adGroupId,adId,impressions,clicks,cost,\r\nattributedConversions1d,attributedConversions7d,attributedConversions14d,attributedConversions30d,\r\nattributedUnitsOrdered1d,attributedUnitsOrdered7d,attributedUnitsOrdered14d,attributedUnitsOrdered30d,\r\nattributedSales1d,attributedSales7d,attributedSales14d,attributedSales30d,\r\nattributedConversions1dSameSKU,attributedConversions7dSameSKU,attributedConversions14dSameSKU,attributedConversions30dSameSKU,\r\nattributedSales1dSameSKU,attributedSales7dSameSKU,attributedSales14dSameSKU,attributedSales30dSameSKU,\r\nattributedOrdersNewToBrand14d,attributedSalesNewToBrand14d,attributedUnitsOrderedNewToBrand14d,\r\nviewImpressions,viewAttributedConversions14d,viewAttributedSales14d,viewAttributedUnitsOrdered14d', 'amzAdvReportTreatProductSDService', 'productAds', 'A1C3SOZRARQ6R3', b'0');
REPLACE INTO `t_amz_adv_report_request_type` (`id`, `campaigntype`, `reporttype`, `segment`, `activeType`, `metrics`, `bean`, `reponsetype`, `nomarket`, `disablevendor`) VALUES (329, 'sd', 'productAds', 'T00030', NULL, 'campaignId,adGroupId,adId,impressions,clicks,cost,\r\nattributedConversions1d,attributedConversions7d,attributedConversions14d,attributedConversions30d,\r\nattributedUnitsOrdered1d,attributedUnitsOrdered7d,attributedUnitsOrdered14d,attributedUnitsOrdered30d,\r\nattributedSales1d,attributedSales7d,attributedSales14d,attributedSales30d,\r\nattributedConversions1dSameSKU,attributedConversions7dSameSKU,attributedConversions14dSameSKU,attributedConversions30dSameSKU,\r\nattributedSales1dSameSKU,attributedSales7dSameSKU,attributedSales14dSameSKU,attributedSales30dSameSKU,\r\nattributedOrdersNewToBrand14d,attributedSalesNewToBrand14d,attributedUnitsOrderedNewToBrand14d,\r\nviewImpressions,viewAttributedConversions14d,viewAttributedSales14d,viewAttributedUnitsOrdered14d', 'amzAdvReportTreatProductSDService', 'productAds', NULL, b'0');
REPLACE INTO `t_amz_adv_report_request_type` (`id`, `campaigntype`, `reporttype`, `segment`, `activeType`, `metrics`, `bean`, `reponsetype`, `nomarket`, `disablevendor`) VALUES (330, 'sd', 'productAds', 'remarketing', NULL, 'campaignId,adGroupId,adId,impressions,clicks,cost,\r\nattributedConversions1d,attributedConversions7d,attributedConversions14d,attributedConversions30d,\r\nattributedUnitsOrdered1d,attributedUnitsOrdered7d,attributedUnitsOrdered14d,attributedUnitsOrdered30d,\r\nattributedSales1d,attributedSales7d,attributedSales14d,attributedSales30d,\r\nattributedConversions1dSameSKU,attributedConversions7dSameSKU,attributedConversions14dSameSKU,attributedConversions30dSameSKU,\r\nattributedSales1dSameSKU,attributedSales7dSameSKU,attributedSales14dSameSKU,attributedSales30dSameSKU,\r\nattributedOrdersNewToBrand14d,attributedSalesNewToBrand14d,attributedUnitsOrderedNewToBrand14d,\r\nviewImpressions,viewAttributedConversions14d,viewAttributedSales14d,viewAttributedUnitsOrdered14d', 'amzAdvReportTreatProductSDService', 'productAds', 'ATVPDKIKX0DER', b'0');
REPLACE INTO `t_amz_adv_report_request_type` (`id`, `campaigntype`, `reporttype`, `segment`, `activeType`, `metrics`, `bean`, `reponsetype`, `nomarket`, `disablevendor`) VALUES (331, 'sd', 'targets', 'T00020', NULL, 'targetId,adGroupId,campaignId,impressions,clicks,cost,\r\nattributedConversions1d,attributedConversions7d,attributedConversions14d,attributedConversions30d,\r\nattributedUnitsOrdered1d,attributedUnitsOrdered7d,attributedUnitsOrdered14d,attributedUnitsOrdered30d,\r\nattributedSales1d,attributedSales7d,attributedSales14d,attributedSales30d,\r\nattributedConversions1dSameSKU,attributedConversions7dSameSKU,attributedConversions14dSameSKU,attributedConversions30dSameSKU,\r\nattributedSales1dSameSKU,attributedSales7dSameSKU,attributedSales14dSameSKU,attributedSales30dSameSKU,\r\nattributedOrdersNewToBrand14d,attributedSalesNewToBrand14d,attributedUnitsOrderedNewToBrand14d,\r\nviewImpressions,viewAttributedConversions14d,viewAttributedSales14d,viewAttributedUnitsOrdered14d', 'amzAdvReportTreatProductTargetSDService', 'targets', 'A1C3SOZRARQ6R3', b'0');
REPLACE INTO `t_amz_adv_report_request_type` (`id`, `campaigntype`, `reporttype`, `segment`, `activeType`, `metrics`, `bean`, `reponsetype`, `nomarket`, `disablevendor`) VALUES (332, 'sd', 'targets', 'T00030', NULL, 'targetId,adGroupId,campaignId,impressions,clicks,cost,\r\nattributedConversions1d,attributedConversions7d,attributedConversions14d,attributedConversions30d,\r\nattributedUnitsOrdered1d,attributedUnitsOrdered7d,attributedUnitsOrdered14d,attributedUnitsOrdered30d,\r\nattributedSales1d,attributedSales7d,attributedSales14d,attributedSales30d,\r\nattributedConversions1dSameSKU,attributedConversions7dSameSKU,attributedConversions14dSameSKU,attributedConversions30dSameSKU,\r\nattributedSales1dSameSKU,attributedSales7dSameSKU,attributedSales14dSameSKU,attributedSales30dSameSKU,\r\nattributedOrdersNewToBrand14d,attributedSalesNewToBrand14d,attributedUnitsOrderedNewToBrand14d,\r\nviewImpressions,viewAttributedConversions14d,viewAttributedSales14d,viewAttributedUnitsOrdered14d', 'amzAdvReportTreatProductTargetSDService', 'targets', NULL, b'0');
REPLACE INTO `t_amz_adv_report_request_type` (`id`, `campaigntype`, `reporttype`, `segment`, `activeType`, `metrics`, `bean`, `reponsetype`, `nomarket`, `disablevendor`) VALUES (336, 'hsa', 'ads', NULL, 'all', 'adGroupId,  applicableBudgetRuleId, attributedConversions14d, \r\nattributedConversions14dSameSKU, attributedDetailPageViewsClicks14d,\r\n attributedOrderRateNewToBrand14d, attributedOrdersNewToBrand14d, \r\n attributedOrdersNewToBrandPercentage14d, attributedSales14d, \r\n attributedSales14dSameSKU, attributedSalesNewToBrand14d, \r\n attributedSalesNewToBrandPercentage14d,\r\n  attributedUnitsOrderedNewToBrand14d, attributedUnitsOrderedNewToBrandPercentage14d,\r\n   campaignBudgetType, campaignId,\r\n   clicks, cost, dpv14d, impressions, unitsSold14d, vctr, attributedBrandedSearches14d', 'amzAdvReportTreatAdHsaService', 'ads', NULL, b'0');
REPLACE INTO `t_amz_adv_report_request_type` (`id`, `campaigntype`, `reporttype`, `segment`, `activeType`, `metrics`, `bean`, `reponsetype`, `nomarket`, `disablevendor`) VALUES (430, 'hsa', 'adGroups', NULL, NULL, 'adGroupId,campaignId,impressions,clicks,cost,\r\nattributedSales14d,attributedSales14dSameSKU,attributedConversions14d,attributedConversions14dSameSKU,\r\nattributedDetailPageViewsClicks14d,attributedOrdersNewToBrand14d,attributedOrdersNewToBrandPercentage14d,attributedOrderRateNewToBrand14d,\r\nattributedSalesNewToBrand14d,attributedSalesNewToBrandPercentage14d,attributedUnitsOrderedNewToBrand14d,attributedUnitsOrderedNewToBrandPercentage14d,\r\nunitsSold14d,dpv14d,attributedBrandedSearches14d', 'amzAdvReportTreatAdgroupsHsaService', 'adGroup', NULL, b'0');
REPLACE INTO `t_amz_adv_report_request_type` (`id`, `campaigntype`, `reporttype`, `segment`, `activeType`, `metrics`, `bean`, `reponsetype`, `nomarket`, `disablevendor`) VALUES (431, 'hsa', 'adGroups', NULL, 'video', 'adGroupId,campaignId,\r\nimpressions,clicks,cost,\r\nattributedSales14d,attributedSales14dSameSKU,attributedConversions14d,attributedConversions14dSameSKU,\r\nviewableImpressions,videoFirstQuartileViews,videoMidpointViews,videoThirdQuartileViews,	\r\nvideoCompleteViews,video5SecondViews,video5SecondViewRate,videoUnmutes,vtr,vctr,attributedBrandedSearches14d', 'amzAdvReportTreatAdgroupsHsaService', 'adGroup', NULL, b'0');
