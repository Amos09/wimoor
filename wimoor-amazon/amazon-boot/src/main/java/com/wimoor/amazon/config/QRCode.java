package com.wimoor.amazon.config;

import cn.hutool.extra.qrcode.QrConfig;
import java.awt.Color;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QRCode {

    @SuppressWarnings("deprecation")
    @Bean
    public QrConfig qrConfig() {
        QrConfig qrConfig = new QrConfig();
        qrConfig.setBackColor(Color.white.getRGB());
        qrConfig.setForeColor(Color.black.getRGB());
        return qrConfig;
    }
}
 