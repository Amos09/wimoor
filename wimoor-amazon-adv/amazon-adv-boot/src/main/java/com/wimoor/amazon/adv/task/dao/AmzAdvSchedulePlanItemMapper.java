package com.wimoor.amazon.adv.task.dao;

import com.wimoor.amazon.adv.task.pojo.AmzAdvSchedulePlanItem;
import com.wimoor.amazon.base.BaseMapper;
import java.math.BigInteger;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AmzAdvSchedulePlanItemMapper extends BaseMapper<AmzAdvSchedulePlanItem> {

    List<Map<String, Object>> findPlanIdForProfile(@Param("profileid") BigInteger profileid);

}