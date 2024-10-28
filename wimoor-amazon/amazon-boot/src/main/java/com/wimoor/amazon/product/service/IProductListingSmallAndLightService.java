package com.wimoor.amazon.product.service;

import com.wimoor.amazon.auth.pojo.entity.AmazonAuthority;
import java.util.List;

public interface IProductListingSmallAndLightService {

    void refreshSmallAndLight(AmazonAuthority auth, String sku, List<String> marketplaces);

}
