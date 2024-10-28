package com.wimoor.amazon.adv.sb.dao;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;
import com.wimoor.amazon.adv.sb.pojo.AmzAdvProductTargeNegativaHsa;
import com.wimoor.amazon.base.BaseMapper;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AmzAdvProductTargeNegativaHsaMapper extends BaseMapper<AmzAdvProductTargeNegativaHsa> {

    int insertBatch(List<AmzAdvProductTargeNegativaHsa> list);

    PageList<Map<String, Object>> getProductNegativaTargeList(Map<String, Object> map, PageBounds pageBounds);

}