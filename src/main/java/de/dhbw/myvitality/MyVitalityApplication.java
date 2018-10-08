package de.dhbw.myvitality;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
/**
 * Applicationsklasse mit Mainmethode
 * @author tamino.fischer
 *
 */
@SpringBootApplication
public class MyVitalityApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(MyVitalityApplication.class, args);
	}
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(MyVitalityApplication.class);
	}
}