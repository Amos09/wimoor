package com.wimoor.amazon.profit.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wimoor.amazon.profit.pojo.entity.ProfitConfigCountry;
import java.util.List;


public interface IProfitCfgCountryService extends IService<ProfitConfigCountry> {

    int update(ProfitConfigCountry temp);

    int insert(ProfitConfigCountry temp);

    List<ProfitConfigCountry> findByProfitId(String profitCfgId);

}
