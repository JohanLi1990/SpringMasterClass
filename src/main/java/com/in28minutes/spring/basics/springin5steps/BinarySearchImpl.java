package com.in28minutes.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl{ // component is bean
	
	@Autowired
	private SortAlgorithm sortAlgorithm; //dependency injection
	
	public BinarySearchImpl(SortAlgorithm algo) {
		this.sortAlgorithm = algo;
	}
	
	public int binarySearch(int[] numbers, int index) {
		int[] sorted_num = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm.getClass());
		
		return 3;
	}
}
