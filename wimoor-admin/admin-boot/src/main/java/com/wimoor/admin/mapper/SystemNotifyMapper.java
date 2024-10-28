package com.wimoor.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wimoor.admin.pojo.entity.SystemNotify;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SystemNotifyMapper extends BaseMapper<SystemNotify> {

    List<SystemNotify> findAnnounceAndRemaind(Map<String, Object> maps);

    List<SystemNotify> findRemindByLasttime(Map<String, Object> maps);

    List<SystemNotify> findMsgLimit();

    List<SystemNotify> findNoReadByUser(@Param("userid") String userid);

    Integer findNoReadByUserCount(@Param("userid") String userid);

    Map<String, Object> findMaxKey();

    List<Map<String, Object>> findNotifyNums(String userid);

    SystemNotify findAnnounceByNewUser();

    SystemNotify findRemindByLastOne(@Param("shopid") String shopid, @Param("target") String value);

    List<SystemNotify> findNoReadByUserAll(String userid);

    SystemNotify findHasNotifyToday(Map<String, Object> map);

}