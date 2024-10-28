package com.wimoor.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wimoor.admin.pojo.entity.SystemSubscription;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SystemSubscriptionMapper extends BaseMapper<SystemSubscription> {

    List<SystemSubscription> findByUser(String userid);

    public List<String> myLongRunningRrxMonitor();

    void executeLongRunningSQLKill(Map<String, Object> maps);

}