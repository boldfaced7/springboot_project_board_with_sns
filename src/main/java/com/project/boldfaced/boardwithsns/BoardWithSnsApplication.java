package com.project.boldfaced.boardwithsns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class BoardWithSnsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoardWithSnsApplication.class, args);
	}

}
