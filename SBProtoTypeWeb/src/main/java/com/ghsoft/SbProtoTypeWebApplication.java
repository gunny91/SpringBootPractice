package com.ghsoft;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//(scanBasePackages = {"com.ghsoft", "com.ghsoft.domain.UserDTO", "com.ghsoft.mapper.UserMapper"})
//@MapperScan(value = {"com.ghsoft.mapper"})
public class SbProtoTypeWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbProtoTypeWebApplication.class, args);
	}

}
