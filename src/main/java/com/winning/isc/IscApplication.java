package com.winning.isc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan({"com.winning.isc.model"})
@EnableTransactionManagement
public class IscApplication {

    public static void main(String[] args) {
        SpringApplication.run(IscApplication.class, args);
    }
}
