package com.wimoor.amazon.profit.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wimoor.amazon.profit.mapper.InplaceFeeMapper;
import com.wimoor.amazon.profit.pojo.entity.InplaceFee;
import com.wimoor.amazon.profit.service.IInplaceFeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service("inplaceFeeService")
@RequiredArgsConstructor
public class InplaceFeeServiceImpl extends ServiceImpl<InplaceFeeMapper, InplaceFee> implements IInplaceFeeService {


}
