package com.wimoor.admin.pojo.dto;

import java.math.BigInteger;
import java.util.List;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class RolePermissionDTO {

    private BigInteger roleId;
    private List<BigInteger> permissionIds;
    private BigInteger menuId;
}
