package com.wimoor.amazon.profit.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wimoor.amazon.profit.mapper.InplaceFeeFormatMapper;
import com.wimoor.amazon.profit.pojo.entity.InplaceFeeFormat;
import com.wimoor.amazon.profit.service.IInplaceFeeFormatService;
import java.io.Serializable;
import javax.annotation.Resource;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;


@Service("inplaceFeeFormatService")
@RequiredArgsConstructor
public class InplaceFeeFormatServiceImpl extends ServiceImpl<InplaceFeeFormatMapper, InplaceFeeFormat> implements
        IInplaceFeeFormatService {


    @Resource
    InplaceFeeFormatMapper inplaceFeeFormatMapper;

    @Cacheable(value = "inplaceFeeCache")
    public InplaceFeeFormat findByInvplaceFeeId(String invplaceFee, boolean isStandard, String country,
            String producttierId) {
        return this.baseMapper.findByInvplaceFeeId(invplaceFee, isStandard, country, producttierId);
    }

    @Cacheable(value = "inplaceFeeCache")
    public InplaceFeeFormat findByProductTierId(String productTierId) {
        return this.baseMapper.findByProductTierId(productTierId);
    }

    @Override
    @CacheEvict(value = "inplaceFeeCache", allEntries = true)
    public boolean save(InplaceFeeFormat entity) {
        return this.baseMapper.insert(entity) > 0;
    }

    @Override
    @CacheEvict(value = "inplaceFeeCache", allEntries = true)
    public boolean removeById(Serializable key) {
        return this.baseMapper.deleteById(key) > 0;
    }

    @Override
    @CacheEvict(value = "inplaceFeeCache", allEntries = true)
    public boolean updateById(InplaceFeeFormat entity) {
        return this.baseMapper.updateById(entity) > 0;
    }


}
