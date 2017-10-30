package com.redstrikers.predictions.config;

import com.redstrikers.predictions.processor.PredictionsProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class EnvironmentConfig {

    @Bean
    public PredictionsProcessor getPredictionsProcessor() {
        return new PredictionsProcessor();
    }

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
