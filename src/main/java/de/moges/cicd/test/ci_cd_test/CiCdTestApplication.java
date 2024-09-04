package de.moges.cicd.test.ci_cd_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CiCdTestApplication {

	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to ci-cd testing using GitActions.";
	}

	public static void main(String[] args) {
		SpringApplication.run(CiCdTestApplication.class, args);
	}

}

/*
 * echo "# githubActions-cicd-example" >> README.md
 * git init
 * git status
 * git add src
 * git add pom.xml
 * git add README.md
 * git commit -m "first commit"
 * git branch -M main
 * git remote add origin
 * https://github.com/dmoges/githubActions-cicd-example.git
 * git push -u origin main
 * 
 */