package com.igt.configuration;

import com.igt.MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan(basePackages = "com.igt")
@EnableScheduling
public class AppConfig {
    @Bean
    public MyBean bean() {
        return new MyBean();
    }
}
