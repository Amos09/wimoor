package com.wimoor.admin.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.wimoor.admin.pojo.dto.RolePermissionDTO;
import com.wimoor.admin.pojo.entity.SysRolePermission;
import java.math.BigInteger;
import java.util.List;

public interface ISysRolePermissionService extends IService<SysRolePermission> {

    List<BigInteger> listPermissionId(BigInteger moduleId, BigInteger roleId);

    List<BigInteger> listPermissionId(BigInteger roleId);

    boolean update(RolePermissionDTO rolePermission);

    List<BigInteger> listMenuPermissionId(BigInteger menuId);


}
