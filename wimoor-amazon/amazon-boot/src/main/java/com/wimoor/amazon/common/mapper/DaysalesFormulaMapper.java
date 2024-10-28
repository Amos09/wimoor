package com.wimoor.amazon.common.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wimoor.amazon.common.pojo.entity.DaysalesFormula;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DaysalesFormulaMapper extends BaseMapper<DaysalesFormula> {

    DaysalesFormula selectByShopid(String shopid);

}