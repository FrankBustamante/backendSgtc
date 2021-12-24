package ebusiness.carvajal.sgtc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "ebusiness.carvajal")
@SpringBootApplication
public class SgtcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SgtcApplication.class, args);
	}

}
