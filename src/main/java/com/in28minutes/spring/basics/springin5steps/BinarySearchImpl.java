package com.in28minutes.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl implements SortAlgorithm { // component is bean
	
	@Autowired
	private SortAlgorithm sortAlgorithm; //dependency injection
	
	public BinarySearchImpl(SortAlgorithm algo) {
		super();
		this.sortAlgorithm = algo;
	}
	
	@Override
	public int binarySearch(int[] numbers, int target) {
		// return this.sortAlgorithm.binarySearch();
		return this.sortAlgorithm.binarySearch(numbers, target);
	}

}
