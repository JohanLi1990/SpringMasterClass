package com.in28minutes.spring.basics.springin5steps;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.in28minutes.spring.basics.componentscan.ComponentDao;

@SpringBootApplication
@ComponentScan("com.in28minutes.spring.basics.componentscan")
public class SpringIn5StepsComponentScanApplication {
	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsComponentScanApplication.class);

	public static void main(String[] args) {
		//we need to tell spring framework:
		// 1. What are beans
		// 2. what are the dependencies of beans
		// 3. where to search for them
		// bean is like an object, in this case, sort Algorithm is a bean
//		BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
		ApplicationContext appContext = SpringApplication.run(SpringIn5StepsComponentScanApplication.class, args);
		ComponentDao componentDao = appContext.getBean(ComponentDao.class);
		LOGGER.info("{}", componentDao);
	}
}
