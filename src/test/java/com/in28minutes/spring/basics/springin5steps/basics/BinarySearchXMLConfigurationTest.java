package com.in28minutes.spring.basics.springin5steps.basics;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.in28minutes.spring.basics.springin5steps.SpringIn5StepsBasicApplication;
import com.in28minutes.spring.basics.springin5steps.basic.BinarySearchImpl;

//load the context
@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "/testContext.xml")
public class BinarySearchXMLConfigurationTest {
	//get the bean from the context
	@Autowired
	BinarySearchImpl binarySearchImpl;

	@Test
	public void testBasicScenario() {
		//call method on binarySearch
//		check if value is correct
		int result = binarySearchImpl.binarySearch(new int[] {}, 3);
		assertEquals(result, 3);
		
	}

}
