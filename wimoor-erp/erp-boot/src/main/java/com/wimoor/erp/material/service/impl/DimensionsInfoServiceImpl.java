package com.wimoor.erp.material.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wimoor.erp.material.mapper.DimensionsInfoMapper;
import com.wimoor.erp.material.pojo.entity.DimensionsInfo;
import com.wimoor.erp.material.service.IDimensionsInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service("dimensionsInfoService")
@RequiredArgsConstructor
public class DimensionsInfoServiceImpl extends ServiceImpl<DimensionsInfoMapper, DimensionsInfo> implements
        IDimensionsInfoService {

}
