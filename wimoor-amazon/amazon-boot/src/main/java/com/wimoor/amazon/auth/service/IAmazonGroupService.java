package com.wimoor.amazon.auth.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wimoor.amazon.auth.pojo.entity.AmazonGroup;
import com.wimoor.common.user.UserInfo;
import java.util.List;
import java.util.Map;

public interface IAmazonGroupService extends IService<AmazonGroup> {

    List<AmazonGroup> getGroupByUser(UserInfo user);

    List<AmazonGroup> selectByShopId(String shopid);

    AmazonGroup findAmazonGroupByName(String groupname, String companyid);

    List<Map<String, Object>> selectTaskInfoList(String sellerid, String marketplaceid);
}
