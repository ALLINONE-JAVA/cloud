package com.aio.cloud.sso;

import com.aio.cloud.common.config.AioBanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CloudSsoApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(CloudSsoApplication.class);
        application.setBanner(new AioBanner());
        application.run(args);
    }
}