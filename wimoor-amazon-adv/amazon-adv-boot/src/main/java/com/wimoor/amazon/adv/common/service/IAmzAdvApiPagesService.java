package com.wimoor.amazon.adv.common.service;

import com.wimoor.amazon.adv.common.pojo.AmzAdvApiPages;
import java.math.BigInteger;

public interface IAmzAdvApiPagesService extends IService<AmzAdvApiPages> {

    AmzAdvApiPages getPage(BigInteger profileid, String apipath);

    void savePage(BigInteger profileid, String apipath, int pageindex);

    public void savePage(BigInteger profileid, String apipath, String nexttoken);

    void savePage(BigInteger profileid, String apipath, int pageindex, String message);

    void savePage(BigInteger profileid, String apipath, String nexttoken, String message);
}
