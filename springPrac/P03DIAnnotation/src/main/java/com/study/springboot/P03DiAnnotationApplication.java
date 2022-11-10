package com.study.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class P03DiAnnotationApplication {

	public static void main(String[] args) {
		SpringApplication.run(P03DiAnnotationApplication.class, args);
	}

}
//@SpringBootApplication
//@Configuration(각종 설정)
//+ @EnableAutoConfiguration(application context 관련 자동 설정)
//+ @ComponentScan( @Component @Configuration이 붙은 클래스 스캔)