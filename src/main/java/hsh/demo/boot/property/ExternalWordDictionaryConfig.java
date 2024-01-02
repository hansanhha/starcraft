package hsh.demo.boot.property;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExternalWordDictionaryConfig {

    @Bean(initMethod = "init")
    @ConfigurationProperties(prefix = "external.word")
    public ExternalWordDictionary externalWordDictionary() {
        return new ExternalWordDictionary();
    }
}
