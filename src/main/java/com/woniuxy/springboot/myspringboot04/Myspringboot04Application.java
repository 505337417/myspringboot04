package com.woniuxy.springboot.myspringboot04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
public class Myspringboot04Application {

	public static void main(String[] args) {
		SpringApplication.run(Myspringboot04Application.class, args);
	}

}
