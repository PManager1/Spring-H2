package com.in28mins.database.H2DatabaseDemo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28mins.database.H2DatabaseDemo.entity.Person;
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
//		logger.info("All users -> {}", dao.findAll());
//		logger.info("User id 10001 -> {}", dao.findById(10001));
		
		
		logger.info("Deleting id 10001 -> {}", dao.deleteById(10001));
		
//		logger.info("User id 10001 -> {}", dao.findByName("Ranga"));
		
//		logger.info("All users -> {}", dao.findAll());
		
//		
		
		logger.info("Inserting 20004 -> {}", dao.insert( new Person(20004, "Tara", "Berlin", new Date() )) );
		logger.info("All users -> {}", dao.findAll());		
	}

}



