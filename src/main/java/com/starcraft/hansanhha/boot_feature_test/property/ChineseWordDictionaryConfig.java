package com.starcraft.hansanhha.boot_feature_test.property;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ChineseWordDictionaryConfig {

    @Bean(initMethod = "init")
    @ConfigurationProperties(prefix = "chinese.word")
    public ChineseWordDictionary externalWordDictionary() {
        return new ChineseWordDictionary();
    }
}
