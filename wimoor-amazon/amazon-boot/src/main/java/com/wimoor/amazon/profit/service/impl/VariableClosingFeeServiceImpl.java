package com.wimoor.amazon.profit.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wimoor.amazon.profit.mapper.VariableClosingFeeMapper;
import com.wimoor.amazon.profit.pojo.entity.VariableClosingFee;
import com.wimoor.amazon.profit.service.IVariableClosingFeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service("variableClosingFeeService")
@RequiredArgsConstructor
public class VariableClosingFeeServiceImpl extends ServiceImpl<VariableClosingFeeMapper, VariableClosingFee> implements
        IVariableClosingFeeService {

}
