package org.sang.trade;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"org.sang.dao.*","org.sang.trade.*","org.sang.beans.*"})
public class TradeApp  {

    public static void main(String[] args) {
        SpringApplication.run(TradeApp.class,args);
    }

}
