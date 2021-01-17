package com.fi.knowit.springrestapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages= {"com.fi.knowit.springrestapi.restapi,com.fi.knowit.springrestapi.service"})

public class SpringrestapiApplication {

	public static void main(String[] args) 
	{
		SpringApplication.run(SpringrestapiApplication.class, args);
	}

}
