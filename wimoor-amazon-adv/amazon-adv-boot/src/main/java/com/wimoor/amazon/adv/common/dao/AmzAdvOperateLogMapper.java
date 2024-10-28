package com.wimoor.amazon.adv.common.dao;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;
import com.wimoor.amazon.adv.common.pojo.AmzAdvOperateLog;
import com.wimoor.amazon.base.BaseMapper;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AmzAdvOperateLogMapper extends BaseMapper<AmzAdvOperateLog> {

    PageList<Map<String, Object>> getOperateLogList(Map<String, Object> map, PageBounds pageBounds);
}