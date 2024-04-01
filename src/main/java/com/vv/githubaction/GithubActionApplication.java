package com.vv.githubaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GithubActionApplication {

	public static void main(String[] args) {
		System.out.println("Hello Vinny!");
		SpringApplication.run(GithubActionApplication.class, args);
	}

}
