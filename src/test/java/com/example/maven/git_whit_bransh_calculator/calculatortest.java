package com.example.maven.git_whit_bransh_calculator;

import static org.junit.Assert.*;

import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

public class calculatortest {
	
	Calculator c = new Calculator();
	static final Logger LOG = Logger.getLogger(Calculator.class.getName());

	@Test
	public void testAddMethod() {
		Random r = new Random();
		
		for(int i = 0; i <10 ;i++) {
			int firstNumber = 0;
			int seconNumber = 0;
			int result = 0;
			result = firstNumber + seconNumber;
			LOG.info("Testing the method add with" + firstNumber + " and " + seconNumber);
			assertEquals(c.add(firstNumber, seconNumber), result);
		}
	}

}
