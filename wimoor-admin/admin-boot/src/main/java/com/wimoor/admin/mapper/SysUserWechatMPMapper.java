package com.wimoor.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wimoor.admin.pojo.entity.SysUserWechatMP;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SysUserWechatMPMapper extends BaseMapper<SysUserWechatMP> {

    SysUserWechatMP selectByUserId(String userid);
}
