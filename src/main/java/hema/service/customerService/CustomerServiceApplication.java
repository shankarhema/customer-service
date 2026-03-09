package hema.service.customerService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.TimeZone;

@SpringBootApplication
public class CustomerServiceApplication {

	static {
		TimeZone.setDefault(TimeZone.getTimeZone("UTC")); // or "Asia/Kolkata"
		System.setProperty("user.timezone", "UTC");
	}

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}

}
