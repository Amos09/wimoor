package com.wimoor.admin.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.math.BigInteger;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@TableName("t_sys_role_permission")
public class SysRolePermission {

    private BigInteger roleId;
    private BigInteger permissionId;
}
