package com.wimoor.erp.material.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wimoor.erp.material.pojo.entity.MaterialCategory;
import java.util.List;

public interface IMaterialCategoryService extends IService<MaterialCategory> {

    List<MaterialCategory> findAllCategory(String shopid);

    IPage<MaterialCategory> findByCondition(Page<?> page, String shopid, String search);

    List<MaterialCategory> findCategory(String shopid, String type);
}
