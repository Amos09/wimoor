package com.wimoor.amazon.profit.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wimoor.amazon.profit.mapper.ProductTierMapper;
import com.wimoor.amazon.profit.pojo.entity.ProductTier;
import com.wimoor.amazon.profit.service.IProductTierService;
import javax.annotation.Resource;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;


@Service("productTierService")
@RequiredArgsConstructor
public class ProductTierServiceImpl extends ServiceImpl<ProductTierMapper, ProductTier> implements IProductTierService {


    @Resource
    ProductTierMapper productTierMapper;

    @Cacheable(value = "productTierCache")
    public ProductTier selectByPKey(String productTierId) {
        return this.getById(productTierId);
    }

    @Override
    @CacheEvict(value = "productTierCache", allEntries = true)
    public boolean save(ProductTier entity) {
        return this.baseMapper.insert(entity) > 0 ? true : false;
    }

    @CacheEvict(value = "productTierCache", allEntries = true)
    public boolean removeById(String key) {
        return this.baseMapper.deleteById(key) > 0 ? true : false;
    }

    @CacheEvict(value = "productTierCache", allEntries = true)
    public boolean updateById(ProductTier entity) {
        return this.baseMapper.updateById(entity) > 0 ? true : false;
    }

}
