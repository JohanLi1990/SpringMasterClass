package com.in28minutes.spring.basics.springin5steps.basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl{ // component is bean
	
	@Autowired
	@Qualifier("bubble")
	private SortAlgorithm sortAlgorithm; //dependency injection
	
	private Logger logger = LoggerFactory.getLogger(this.getClass()); 
		
	public int binarySearch(int[] numbers, int index) {
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm.getClass());
		
		return 3;
	}
	
	@PostConstruct
	public void postConstruct() {
		logger.info("Post Construct");
	}
	
	@PreDestroy
	public void preDestory() {
		logger.info("Pre Destroy");
	}
}
