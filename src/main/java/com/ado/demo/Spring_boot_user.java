package com.ado.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ado.demo.mapper")//将项目中对应的mapper类的路径加进来就可以了
public class Spring_boot_user {
	public static void main(String[] args) {
		SpringApplication.run(Spring_boot_user.class, args);
	}
}
