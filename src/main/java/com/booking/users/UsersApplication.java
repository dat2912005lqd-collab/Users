package com.booking.users;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
<<<<<<< HEAD
=======
@EnableJpaRepositories(basePackages = "com.booking.users.repository")
@EntityScan(basePackages = "com.booking.users.entity")
>>>>>>> 32d8831aa8a55afb4aa4a61b1bc05a56d05b875a
@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.booking.users.repository")
@EntityScan(basePackages = "com.booking.users.model")
public class UsersApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsersApplication.class, args);
	}

}
