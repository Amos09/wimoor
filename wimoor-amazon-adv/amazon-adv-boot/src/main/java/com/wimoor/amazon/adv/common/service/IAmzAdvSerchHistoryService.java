package com.wimoor.amazon.adv.common.service;

import com.wimoor.amazon.adv.common.pojo.AmzAdvSerchHistory;
import java.util.List;


public interface IAmzAdvSerchHistoryService extends IService<AmzAdvSerchHistory> {

    int addSerchHistoryAction(String userId, String condition, String ftype);

    List<AmzAdvSerchHistory> getSerchHistoryAction(String userId, String ftype);

    int deleteSerchHistoryAction(String id);
}
