package springboot;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringwithstaticwebsiteApplication {
	
	private static final Logger logger = LogManager.getLogger(SpringwithstaticwebsiteApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringwithstaticwebsiteApplication.class, args);
		logger.info("############# app started ##################");
	}

}
