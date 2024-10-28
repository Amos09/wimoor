package com.wimoor.admin.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.wimoor.admin.pojo.entity.SysRole;
import java.math.BigInteger;
import java.util.List;

public interface ISysRoleService extends IService<SysRole> {

    boolean delete(List<BigInteger> ids);
}
