package umc.beanstalk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class BeanstalkApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeanstalkApplication.class, args);
	}

}
