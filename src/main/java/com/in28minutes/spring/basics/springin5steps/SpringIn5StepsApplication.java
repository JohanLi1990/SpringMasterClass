package com.in28minutes.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringIn5StepsApplication {

	public static void main(String[] args) {
		BinarySearchImpl binarySearch = new BinarySearchImpl();
		binarySearch.binarySearch(new int[] {12, 4, 6}, 3);
		SpringApplication.run(SpringIn5StepsApplication.class, args);
	}

}
