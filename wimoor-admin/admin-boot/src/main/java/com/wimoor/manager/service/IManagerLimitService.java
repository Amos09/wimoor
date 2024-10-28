package com.wimoor.manager.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wimoor.manager.pojo.entity.ManagerLimit;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author wimoor team
 * @since 2022-09-27
 */
public interface IManagerLimitService extends IService<ManagerLimit> {

    public String getCompanyRole(String companyid);

    public List<Map<String, Object>> summary();

    public IPage<Map<String, Object>> getCompanyList(Page<Object> page, Map<String, Object> param);

    public Map<String, Object> findManagerLimitByShopId(String companyid);
}
