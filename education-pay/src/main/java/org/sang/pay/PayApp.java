package org.sang.pay;

import org.sang.pay.unionpay.acp.sdk.SDKConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.sang.dao.dao2")
public class PayApp implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(PayApp.class,args);
    }

    @Override
    public void run(String... args) throws Exception {
        SDKConfig.getConfig().loadPropertiesFromSrc();
    }
}
