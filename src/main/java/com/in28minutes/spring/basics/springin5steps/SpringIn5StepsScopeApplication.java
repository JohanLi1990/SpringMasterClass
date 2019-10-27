package com.in28minutes.spring.basics.springin5steps;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.in28minutes.spring.basics.springin5steps.scope.PersonDao;

@SpringBootApplication
public class SpringIn5StepsScopeApplication {
	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class);

	public static void main(String[] args) {
		//we need to tell spring framework:
		// 1. What are beans
		// 2. what are the dependencies of beans
		// 3. where to search for them
		// bean is like an object, in this case, sort Algorithm is a bean
//		BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
		ApplicationContext appContext = SpringApplication.run(SpringIn5StepsScopeApplication.class, args);
		PersonDao personDao = appContext.getBean(PersonDao.class);
		PersonDao personDao2 = appContext.getBean(PersonDao.class);
		LOGGER.info("{}", personDao);
		LOGGER.info("{}", personDao.getJdbcConnection());
		LOGGER.info("{}", personDao2);
		LOGGER.info("{}", personDao2.getJdbcConnection());
	}
}
