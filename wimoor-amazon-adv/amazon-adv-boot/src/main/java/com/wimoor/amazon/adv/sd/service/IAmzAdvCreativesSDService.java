package com.wimoor.amazon.adv.sd.service;

import com.alibaba.fastjson.JSONObject;
import com.wimoor.common.user.UserInfo;
import java.math.BigInteger;

/**
 * 对应API文档 Product Targeting
 *
 * @author admin
 */
public interface IAmzAdvCreativesSDService {

    public String getListOfCreatives(UserInfo user, BigInteger profileId, JSONObject myParam);

    public String updatesCreatives(UserInfo user, BigInteger profileId, JSONObject myParam);

    public String requestCreatives(UserInfo user, BigInteger profileId, JSONObject myParam);

    public String getCreativePreviewHTML(UserInfo user, BigInteger profileId, JSONObject myParam);

    public String getListCreativeModerations(UserInfo user, BigInteger profileId, JSONObject myParam);
}
