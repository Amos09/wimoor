package com.wimoor.amazon.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wimoor.amazon.product.pojo.entity.MerchantShippingGroup;
import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author wimoor team
 * @since 2023-07-12
 */
public interface IMerchantShippingGroupService extends IService<MerchantShippingGroup> {

    List<MerchantShippingGroup> listGroups(String amazonauthid, String marketplaceid);

    public List<MerchantShippingGroup> refreshListGroups(String amazonauthid, String marketplaceid);
}
