package org.sang.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableScheduling
@ComponentScan(basePackages = {"org.sang.dao.*","org.sang.beans.*","org.sang.system.*"})
public class SystemApp {
    public static void main(String[] args) {
        SpringApplication.run(SystemApp.class,args);
    }
}
