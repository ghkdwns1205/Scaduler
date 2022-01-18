package jh.scaduler.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "jh.scaduler")
public class ScadulerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScadulerApplication.class, args);
	}

}
