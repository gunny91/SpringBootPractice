package com.ghsoft.controller;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

/*
 * @SpringBootApplication
 *  = @Configuration + @EnableAutoConfiguration + @ComponentScan
 * @Configuration : 현재 클래스가 스프링의 설정 파일임을 Spring Context에게 알려주는
 * 					애노테이션
 * @EnableAutoConfiguration : 스프링 부트 클래스, 패스, 세팅 및 다양한 Bean 추가 등을
 * 					시켜주는 애노테이션
 * @ComponentScan : 다른 컴포너트, 서비스, 설정 등을 찾을 수 있게 도와주는
 *                  애노테이션
 *                  
 * @MapperScan : Mapper 인터페이스를 인식할 수 있도록 설정한다.
 *   value={"com.edu.sboard.mapper"} 값에 파일이름은 포함시키지 않는다.
 */


@SpringBootApplication(scanBasePackages = {"com.ghsoft"})
//@ComponentScan({"com.ghsoft.board.service"})
@MapperScan(value = {"com.ghsoft.mapper"})
public class BoardProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoardProjectApplication.class, args);
	}

	
	/**
	 * Adding bean annotation to use spring object
	 * We are using SqlSessionFactory to use Mybatis 
	 * setDataSource(datasource) is coming from application.properties
	 * @param dataSource 
	 * @return sessionFactory's object
	 * @throws Exception
	 */
	@Bean
	public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception{
		
		SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
		//application.properties에 기술된 DataSource를 주입한다.
		sessionFactory.setDataSource(dataSource);		
		return sessionFactory.getObject();
	}
}
