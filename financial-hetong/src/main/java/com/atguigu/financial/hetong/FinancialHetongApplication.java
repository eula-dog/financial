package com.atguigu.financial.hetong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.atguigu.financial.hetong.mapper")
public class FinancialHetongApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinancialHetongApplication.class, args);
	}
}
