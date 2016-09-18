package com.xlinyu.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by gavin on 18/09/2016.
 */
@Configuration
public class WebAppConfigurer extends WebMvcConfigurerAdapter {

    //http://127.0.0.1:9090/spring-boot/res/app.js
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/res/**").addResourceLocations("classpath:/res/");
        super.addResourceHandlers(registry);
    }
}
