package com.webint.api_voletos_aereos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class ApiVoletosAereosApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiVoletosAereosApplication.class, args);
    }

}
