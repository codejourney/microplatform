package com.datajiang.cloud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ApplicationContext;

@EnableDiscoveryClient
@EnableEurekaClient
@SpringBootApplication
public class ConfigClientApplication extends SpringBootServletInitializer {

    private static Logger logger = LoggerFactory.getLogger(ConfigClientApplication.class);

    public static void main(String[] args) throws Exception {
        ApplicationContext application = SpringApplication.run(ConfigClientApplication.class, args);
        if (logger.isDebugEnabled()) {
            String[] beanDefinitionNames = application.getBeanDefinitionNames();
            for (String beanName : beanDefinitionNames) {
                logger.debug(beanName);
            }
        }
    }
}