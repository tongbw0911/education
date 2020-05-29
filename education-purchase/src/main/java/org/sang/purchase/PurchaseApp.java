package org.sang.purchase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"org.sang.dao.*","org.sang.purchase.*","org.sang.beans.*"})
public class PurchaseApp {
    public static void main(String[] args) {
        SpringApplication.run(PurchaseApp.class,args);
    }
}
