package com.byelkawolf.objecttojson;


import com.google.gson.Gson;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ObjectToJsonApplication {

	public static void main(String[] args) {
		SpringApplication.run(ObjectToJsonApplication.class, args);
	}

	@Bean
	public Gson gson(){
		return new Gson();
	}
}
