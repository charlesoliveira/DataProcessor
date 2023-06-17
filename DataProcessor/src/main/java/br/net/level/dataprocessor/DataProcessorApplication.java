package br.net.level.dataprocessor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "br.net.level.dataprocessor")
public class DataProcessorApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataProcessorApplication.class, args);
	}

}
