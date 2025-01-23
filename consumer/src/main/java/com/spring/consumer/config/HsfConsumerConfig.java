package com.spring.consumer.config;

import com.spring.api.CustomerApi;
import io.github.projecthsf.annotation.HsfConsumer;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HsfConsumerConfig {
    @HsfConsumer
    private CustomerApi customerApi;
}
