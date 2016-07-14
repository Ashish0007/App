

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
@ComponentScan("com")
public class AttendanceAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AttendanceAppApplication.class, args);
	}
}
