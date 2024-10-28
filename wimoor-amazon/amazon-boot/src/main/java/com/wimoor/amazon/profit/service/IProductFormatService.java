package com.wimoor.amazon.profit.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wimoor.amazon.profit.pojo.entity.ProductFormat;
import java.util.List;
import java.util.Map;

public interface IProductFormatService extends IService<ProductFormat> {

    List<Map<String, Object>> findTierFormatByCountry(String country);

    List<Map<String, Object>> findSmlProductTierByCountry(String country);

}
