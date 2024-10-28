package com.wimoor.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wimoor.admin.pojo.entity.SysUserDatalimit;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 用户数据权限，放在用户信息中，登录后将在所有模块生效 Mapper 接口
 * </p>
 *
 * @author wimoor team
 * @since 2022-09-29
 */
@Mapper
public interface SysUserDatalimitMapper extends BaseMapper<SysUserDatalimit> {

}
