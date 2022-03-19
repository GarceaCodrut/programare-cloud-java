package com.unitbv.profiles.programatically;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class AppConfig {

    @Bean
    @Profile({"dev","default"})
    public DevDataSourceConfig devDataSourceConfigDev(){
        return new DevDataSourceConfig();
    }

    @Bean
    @Profile("prod")
    public ProdDataSourceConfig prodDataSourceConfig(){
        return new ProdDataSourceConfig();
    }
}
