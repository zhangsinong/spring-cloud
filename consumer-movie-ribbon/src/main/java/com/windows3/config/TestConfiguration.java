package com.windows3.config;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by 3 on 2018/10/28.
 */
@Configuration
public class TestConfiguration {
    @Autowired
   private IClientConfig config;

    @Bean
    public IRule ribbonRule(IClientConfig config) {
        return new RandomRule();
    }
}

