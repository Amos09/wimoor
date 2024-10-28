package com.wimoor.amazon.adv.task.service;


import com.wimoor.amazon.adv.common.service.IService;
import com.wimoor.amazon.adv.task.pojo.AmzAdvSchedulePlanItem;
import java.math.BigInteger;
import java.util.List;
import java.util.Map;

public interface IAdvSchedulePlanItemService extends IService<AmzAdvSchedulePlanItem> {

    List<Map<String, Object>> findPlanIdForProfile(BigInteger profileid);

}
