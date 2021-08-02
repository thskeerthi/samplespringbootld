package eurekademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = {"controller","service"})
public class EurekaApplication {

	public static void main(String[] args) {
		System.out.println("dddddddddddddddd");

		SpringApplication.run(EurekaApplication.class, args);
	}
	
}
