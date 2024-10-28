package com.wimoor.erp.material.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wimoor.erp.material.pojo.entity.MaterialBrand;
import java.util.List;

public interface IMaterialBrandService extends IService<MaterialBrand> {

    List<MaterialBrand> findAllBrand(String shopid);

    IPage<MaterialBrand> findByCondition(Page<?> page, String shopid, String search);
}
