package com.wimoor.amazon.adv.common.service;

import com.wimoor.amazon.adv.common.pojo.AmzAdvRemark;
import java.util.List;


public interface IAmzAdvRemarkService extends IService<AmzAdvRemark> {

    int addRemark(List<AmzAdvRemark> list);

    int updateRemark(List<AmzAdvRemark> list);
}
