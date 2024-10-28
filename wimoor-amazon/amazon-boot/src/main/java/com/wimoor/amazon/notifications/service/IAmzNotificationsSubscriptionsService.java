package com.wimoor.amazon.notifications.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wimoor.amazon.auth.service.IRunAmazonService;
import com.wimoor.amazon.notifications.pojo.entity.AmzNotificationsSubscriptions;

/**
 * <p>
 * 订阅消息对象 服务类
 * </p>
 *
 * @author wimoor team
 * @since 2022-06-27
 */
public interface IAmzNotificationsSubscriptionsService extends IService<AmzNotificationsSubscriptions>,
        IRunAmazonService {

    public void deleteSubscriptions(String destinationid);
}
