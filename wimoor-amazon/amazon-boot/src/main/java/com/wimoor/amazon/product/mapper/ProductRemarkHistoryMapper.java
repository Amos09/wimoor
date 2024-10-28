package com.wimoor.amazon.product.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wimoor.amazon.product.pojo.entity.ProductRemarkHistory;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ProductRemarkHistoryMapper extends BaseMapper<ProductRemarkHistory> {

    List<Map<String, Object>> getProRemarkHisByPid(@Param("pid") String pid, @Param("ftype") String ftype);
}
