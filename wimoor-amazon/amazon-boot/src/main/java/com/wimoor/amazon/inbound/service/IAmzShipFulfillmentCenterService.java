package com.wimoor.amazon.inbound.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wimoor.amazon.inbound.pojo.entity.AmzShipFulfillmentCenter;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author wimoor team
 * @since 2022-12-29
 */
public interface IAmzShipFulfillmentCenterService extends IService<AmzShipFulfillmentCenter> {

    AmzShipFulfillmentCenter getByCode(String destinationfulfillmentcenterid);

}
