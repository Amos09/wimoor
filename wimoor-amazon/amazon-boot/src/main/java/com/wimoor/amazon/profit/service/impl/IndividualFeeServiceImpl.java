package com.wimoor.amazon.profit.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wimoor.amazon.profit.mapper.IndividualFeeMapper;
import com.wimoor.amazon.profit.pojo.entity.IndividualFee;
import com.wimoor.amazon.profit.service.IIndividualFeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service("individualFeeService")
@RequiredArgsConstructor
public class IndividualFeeServiceImpl extends ServiceImpl<IndividualFeeMapper, IndividualFee> implements
        IIndividualFeeService {

}
