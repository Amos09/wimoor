package com.wimoor.admin.controller;


import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author wimoor team
 * @since 2023-05-25
 */
@Api(tags = "多账号绑定接口")
@RestController
@RequestMapping("/api/v1/sysUserBind")
@RequiredArgsConstructor
public class SysUserBindController {

}

