package com.java.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.java.springboot.model.User;
import com.java.springboot.repository.UserRepository;

@SpringBootApplication
public class SpringBootBackendApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBackendApplication.class, args);
	}
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		this.userRepository.save(new User("Saket","Sourav", "souravsaket31@gmail.com"));
		this.userRepository.save(new User("Raunak","Raj", "raunakraj5454@gmail.com"));
		this.userRepository.save(new User("Rahul","Gupta", "abc@gmail.com"));
		this.userRepository.save(new User("Rohit","Kumar", "xyz@gmail.com"));
		
	}

}
