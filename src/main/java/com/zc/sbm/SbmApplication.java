package com.zc.sbm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zc.sbm.mapper")
public class SbmApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbmApplication.class, args);
    }
}
