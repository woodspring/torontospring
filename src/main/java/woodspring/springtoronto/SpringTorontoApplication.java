package woodspring.springtoronto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import woodspring.springtoronto.config.SpringTorontoConfiguration;

@Import(SpringTorontoConfiguration.class)
@SpringBootApplication(scanBasePackages={"woodspring.springtoronto"})
public class SpringTorontoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTorontoApplication.class, args);
	}
}