package com.ghsoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication//(scanBasePackages = {"com.ghsoft", "com.ghsoft.domain.UserDTO", "com.ghsoft.mapper.UserMapper"})
//@MapperScan(value = {"com.ghsoft.mapper"})
@ComponentScan(basePackages= {"webSocket", "com.ghsoft"})
public class SbProtoTypeWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbProtoTypeWebApplication.class, args);
	}

}
