package com.wimoor.amazon.inbound.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wimoor.amazon.inbound.pojo.entity.AmzInboundFbaCycle;
import java.math.BigInteger;
import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author wimoor team
 * @since 2022-11-28
 */
public interface IAmzInboundFbaCycleService extends IService<AmzInboundFbaCycle> {

    public List<AmzInboundFbaCycle> getInboundFbaCycle(String shopid, String marketplaceid);

    public AmzInboundFbaCycle getDefaultInboundFbaCycle(List<AmzInboundFbaCycle> cycleList);

    public AmzInboundFbaCycle getTransInboundFbaCycle(List<AmzInboundFbaCycle> cycleList, BigInteger transtype);
}
