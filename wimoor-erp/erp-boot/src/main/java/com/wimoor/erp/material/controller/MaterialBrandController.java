package com.wimoor.erp.material.controller;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.wimoor.common.mvc.BizException;
import com.wimoor.common.result.Result;
import com.wimoor.common.user.UserInfo;
import com.wimoor.common.user.UserInfoContext;
import com.wimoor.erp.material.pojo.dto.MaterialCateDTO;
import com.wimoor.erp.material.pojo.entity.MaterialBrand;
import com.wimoor.erp.material.service.IMaterialBrandService;
import com.wimoor.erp.util.UUIDUtil;
import io.swagger.annotations.Api;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "产品品牌接口")
@RestController
@RequestMapping("/api/v1/materialBrand")
@RequiredArgsConstructor
public class MaterialBrandController {

    final IMaterialBrandService materialBrandService;

    @PostMapping("/saveData")
    public Result<Map<String, Object>> saveDataAction(@RequestBody MaterialBrand entity) {
        Map<String, Object> map = new HashMap<String, Object>();
        UserInfo userinfo = UserInfoContext.get();
        String shopid = userinfo.getCompanyid();
        entity.setOpttime(new Date());
        entity.setShopid(shopid);
        entity.setOperator(userinfo.getId());
        entity.setRemark(entity.getRemark());
        QueryWrapper<MaterialBrand> queryWrapper = new QueryWrapper<MaterialBrand>();
        queryWrapper.eq("name", entity.getName());
        queryWrapper.eq("shopid", shopid);
        List<MaterialBrand> list = materialBrandService.list(queryWrapper);
        boolean result = false;
        if (StrUtil.isEmpty(entity.getId())) {
            //新增
            if (list.size() > 0) {
                throw new BizException("品牌名称不能重复");
            }
            entity.setId(UUIDUtil.getUUIDshort());
            result = materialBrandService.save(entity);
        } else {
            //修改
            if (list != null && list.size() > 0) {
                if (list.get(0).getId().equals(entity.getId()) && list.size() == 1) {
                    result = materialBrandService.updateById(entity);
                } else {
                    throw new BizException("品牌名称不能重复");
                }
            } else {
                result = materialBrandService.updateById(entity);
            }

        }
        if (result == true) {
            map.put("msg", "添加成功");
        } else {
            map.put("msg", "添加失败");
        }
        return Result.success(map);
    }


    @PostMapping("/list")
    public Result<IPage<MaterialBrand>> getListData(@RequestBody MaterialCateDTO dto) {
        UserInfo userinfo = UserInfoContext.get();
        String shopid = userinfo.getCompanyid();
        String search = dto.getSearch();
        return Result.success(materialBrandService.findByCondition(dto.getPage(), shopid, search));
    }

    @GetMapping("/getBrand")
    public Result<List<MaterialBrand>> getCategoryAction() {
        UserInfo userinfo = UserInfoContext.get();
        String shopid = userinfo.getCompanyid();
        List<MaterialBrand> catelist = materialBrandService.findAllBrand(shopid);
        return Result.success(catelist);
    }

    @GetMapping("/delBrand")
    public Result<Map<String, Object>> delDataAction(String id) {
        Map<String, Object> map = new HashMap<String, Object>();
        boolean result = materialBrandService.removeById(id);
        if (result == true) {
            map.put("msg", "删除成功");
        } else {
            map.put("msg", "删除失败");
        }
        return Result.success(map);
    }

}
