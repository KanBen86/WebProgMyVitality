package de.dhbw.myvitality;

import de.dhbw.myvitality.entities.*;
import de.dhbw.myvitality.enums.ENUM_DEPARTMENT;
import de.dhbw.myvitality.enums.ENUM_ROLL;
import de.dhbw.myvitality.repositories.CustomerRepository;
import de.dhbw.myvitality.repositories.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.Optional;

/**
 * Applicationsklasse mit Mainmethode
 * @author tamino.fischer
 *
 */
@SpringBootApplication
public class MyVitalityApplication extends SpringBootServletInitializer {

	private static final Logger log = LoggerFactory.getLogger(MyVitalityApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(MyVitalityApplication.class, args);
	}
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(MyVitalityApplication.class);
	}

	@Bean
	public CommandLineRunner demoEmployee(EmployeeRepository empRepos){
		return (args) -> {
			// save a couple of employees
			log.info("Erzeuge Employees und speichere sie");
			empRepos.save(new Employee("11111", ENUM_DEPARTMENT.CONTROLLING, ENUM_ROLL.ADMIN, null));
			empRepos.save(new Employee("22222", ENUM_DEPARTMENT.CONTROLLING, ENUM_ROLL.ADMIN, "11111"));
			empRepos.save(new Employee("33333", ENUM_DEPARTMENT.CONTROLLING, ENUM_ROLL.ADMIN, "11111"));
			// fetch all customers
			log.info("Employee found with findAll:");
			log.info("----------------------------");
			for (Employee employee : empRepos.findAll()){
				log.info(employee.toString());
			}
			Optional<Employee> employee = empRepos.findById("mvu11111");
			log.info("----------------------------");
			log.info("Employee found with findById");
			log.info(employee.get().toString());
			log.info("----------------------------");
			log.info("Update the field superior of Employee mvu11111");
			employee.get().setSuperior("00000");
			empRepos.save(employee.get());
			log.info("----------------------------");
			log.info("Employee nach dem Update");
			log.info(empRepos.findById(employee.get().getEmployeeId()).toString());
		};
	}

	@Bean
    public CommandLineRunner demoCustomer(CustomerRepository customerRepository){
	    return (args) -> {
	        //save a couple of customers
            log.info("Erzeuge Customer und speichere sie");
            log.info("----------------------------------");
            customerRepository.save(new Customer("11111", null, null, null, null, null, "Banküberweisung"));
            log.info("Customer nach Id suchen");
            log.info("----------------------------------");
            Optional<Customer> customer = customerRepository.findById("11111");
            log.info(customer.get().toString());
        };
    }
}