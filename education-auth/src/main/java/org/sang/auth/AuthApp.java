package org.sang.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"org.sang.auth.*","org.sang.beans.*", "org.sang.dao.*"})
public class AuthApp {
    public static void main(String[] args) {
        SpringApplication.run(AuthApp.class,args);
    }
}
