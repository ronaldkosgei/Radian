package com.jpadatabaseDemoApplication;


import com.jpadatabaseDemoApplication.Entity.Employee;
import com.jpadatabaseDemoApplication.repository.EmployeejpaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaDatabaseDemoApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	EmployeejpaRepository employeejpaRepository;

	public static void main(String[] args) {
		SpringApplication.run(JpaDatabaseDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{

		logger.info("user id 1 ->{}", employeejpaRepository.findById(10001));

		Employee employee = employeejpaRepository.insert(new Employee( "Rolex", "Martins", "London", "23/05/2019"));

		logger.info("inserted with id ->{}", employee.getId());
		employee = employeejpaRepository.update(new Employee(employee.getId(), "Chris", "Abdi", "Marsabit", "12/10/2012"));

		logger.info("updated with id ->{}", employee.getId());

		employeejpaRepository.deleteById(employee.getId());

	}

}
