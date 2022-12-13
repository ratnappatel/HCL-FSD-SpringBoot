package com.boot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.boot.pojo.User;

@SpringBootApplication // == Configuration, EnableWeb, componentScan, propertySource
//@EnableWebMvc
public class Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User user=new User(101,"Ratna");
		System.out.println(user);
		user.setId(99);
		user.setName("Uttam");
		System.out.println(user);
		
	}

}
