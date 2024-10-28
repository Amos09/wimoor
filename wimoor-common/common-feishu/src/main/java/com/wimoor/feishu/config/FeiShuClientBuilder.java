package com.wimoor.feishu.config;


import com.lark.oapi.Client;
import com.wimoor.feishu.pojo.entity.Auth;
import com.wimoor.feishu.service.IAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;


@Configuration
public class FeiShuClientBuilder {

    @Autowired
    IAuthService iAuthService;

    public Client getClient(String appid) {
        Auth auth = iAuthService.getById(appid);
        Client client = Client.newBuilder(auth.getAppId(), auth.getAppSecret()).logReqAtDebug(true).build();
        return client;
    }

}