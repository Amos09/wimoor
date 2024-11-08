package com.wimoor.erp.ship.controller;

import com.wimoor.common.service.impl.SystemControllerLog;
import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "FBA发货规划接口")
@RestController
@RequestMapping("/api/v1/ship/plan")
@SystemControllerLog("FBA发货规划")
@RequiredArgsConstructor
public class ShipPlanController {

}
