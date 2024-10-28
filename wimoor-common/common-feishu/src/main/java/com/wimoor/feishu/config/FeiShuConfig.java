package com.wimoor.feishu.config;

import com.lark.oapi.sdk.servlet.ext.ServletAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeiShuConfig {

    @Bean
    public ServletAdapter getServletAdapter() {
        return new ServletAdapter();
    }
}
