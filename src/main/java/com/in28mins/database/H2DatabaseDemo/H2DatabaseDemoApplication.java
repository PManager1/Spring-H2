package com.in28mins.database.H2DatabaseDemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.in28mins.database.H2DatabaseDemo.jdbc.PersonJdbcDao;

@SpringBootApplication
public class H2DatabaseDemoApplication implements CommandLineRunner {
	
//	private Logger logger = (Logger) LoggerFactory.getLogger(this.getClass());
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonJdbcDao dao; 

	public static void main(String[] args) {
		SpringApplication.run(H2DatabaseDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		logger.info("All users -> {}", dao.findAll());
		
	}

}



