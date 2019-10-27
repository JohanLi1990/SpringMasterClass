package com.in28minutes.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.in28minutes.spring.basics.springin5steps.basic.BinarySearchImpl;

@SpringBootApplication
public class SpringIn5StepsBasicApplication {

	public static void main(String[] args) {
		//we need to tell spring framework:
		// 1. What are beans
		// 2. what are the dependencies of beans
		// 3. where to search for them
		// bean is like an object, in this case, sort Algorithm is a bean
//		BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
		ApplicationContext appContext = SpringApplication.run(SpringIn5StepsBasicApplication.class, args);
		BinarySearchImpl binarySearch = appContext.getBean(BinarySearchImpl.class);
		int result = binarySearch.binarySearch(new int[] {12, 4, 6}, 3);
		System.out.println(result);
	}

}
