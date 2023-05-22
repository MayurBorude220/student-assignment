package com.student.crud.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.student.drud.api.controller")
@EnableJpaRepositories(basePackages = "com.student.crud.api.studentrepository1")
@EntityScan(basePackages = "com.student.crud.api.entity")
public class StudentRestapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentRestapiApplication.class, args);
	}

}
