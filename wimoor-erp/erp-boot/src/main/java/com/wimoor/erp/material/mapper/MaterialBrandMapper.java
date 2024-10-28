package com.wimoor.erp.material.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wimoor.erp.material.pojo.entity.MaterialBrand;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MaterialBrandMapper extends BaseMapper<MaterialBrand> {

    IPage<MaterialBrand> findByCondition(Page<?> page, @Param("shopid") String shopid, @Param("search") String search);
}