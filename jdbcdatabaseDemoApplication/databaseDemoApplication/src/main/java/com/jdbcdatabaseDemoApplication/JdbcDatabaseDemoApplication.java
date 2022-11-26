package com.jdbcdatabaseDemoApplication;

import com.jdbcdatabaseDemoApplication.Entity.Person;
import com.jdbcdatabaseDemoApplication.repository.PersonDaoJdbc;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JdbcDatabaseDemoApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonDaoJdbc repository;

	public static void main(String[] args) {
		SpringApplication.run(JdbcDatabaseDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{
		logger.info("All users ->{}", repository.findAll());
		logger.info("user id 10001 ->{}", repository.findAll());
		logger.info("deleting id 10002 -> No of Rows deleted -{}",
				repository.deleteById(10002));
		logger.info("inserting 10004 ->{}",
				repository.insert(new Person(10004, "Rolex", "Martins", "London", "23/05/2019")));
		logger.info("updating 10003 ->{}",
				repository.update(new Person(10003, "Chris", "Abdi", "Marsabit", "12/10/2012")));
	}

}
