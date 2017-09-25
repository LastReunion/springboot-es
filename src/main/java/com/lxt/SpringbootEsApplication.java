package com.lxt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;


@SpringBootApplication
public class SpringbootEsApplication {

	@GetMapping("/")
	public String index() {
		return "index";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootEsApplication.class, args);
	}
}
