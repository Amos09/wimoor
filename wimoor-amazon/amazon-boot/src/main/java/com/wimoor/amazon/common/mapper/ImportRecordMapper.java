package com.wimoor.amazon.common.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wimoor.amazon.common.pojo.entity.ImportRecord;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ImportRecordMapper extends BaseMapper<ImportRecord> {

    List<ImportRecord> selectByShopid(@Param("shopid") String shopid, @Param("importtype") String importtype);
}
