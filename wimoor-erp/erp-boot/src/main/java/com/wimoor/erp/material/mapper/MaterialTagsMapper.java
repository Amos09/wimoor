package com.wimoor.erp.material.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wimoor.erp.material.pojo.entity.MaterialTags;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MaterialTagsMapper extends BaseMapper<MaterialTags> {

    List<String> getmskuList(Map<String, Object> param);

    List<String> getmskuListWithout(Map<String, Object> param);

    List<String> getMidList(@Param("taglist") List<String> taglist);

    List<Map<String, String>> getTagsBySku(Map<String, Object> param);
}
