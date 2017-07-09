package com.gelvt.oneshop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.gelvt.oneshop.mapper")
public class OneshopApplication {

    public static void main(String[] args) {
		SpringApplication.run(OneshopApplication.class, args);
	}

}
