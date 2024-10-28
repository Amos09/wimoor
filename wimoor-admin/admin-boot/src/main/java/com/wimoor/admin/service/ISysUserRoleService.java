package com.wimoor.admin.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.wimoor.admin.pojo.entity.SysUserRole;
import java.util.List;

public interface ISysUserRoleService extends IService<SysUserRole> {

    public List<SysUserRole> findByUserId(String userid);
}
