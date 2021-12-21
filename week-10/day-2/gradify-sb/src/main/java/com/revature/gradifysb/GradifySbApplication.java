package com.revature.gradifysb;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.revature.gradifysb.dao.UserDao;
import com.revature.gradifysb.model.User;

@SpringBootApplication
public class GradifySbApplication {

	public static void main(String[] args) {
		SpringApplication.run(GradifySbApplication.class, args);
	}
	
	@Bean
	CommandLineRunner commandLineRunner(UserDao dao) {
		return args -> {
			User user = dao.findByUsernameAndPassword("bach_tran", "password123");
			
			System.out.println(user);
		};
	}

}
