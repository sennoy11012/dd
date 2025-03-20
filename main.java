package com.shareworks.sm.autoconfigure;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("system.llm.api-keys")
@Getter
@Setter
public class ApiKeyProperties {

    private String openai;
    private String claude;
}
