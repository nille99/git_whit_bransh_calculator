package com.example.maven.git_whit_bransh_calculator;

import static org.junit.Assert.*;

import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

public class calculatortest {
	
	Calculator c = new Calculator();
	static final Logger LOG = Logger.getLogger(Calculator.class.getName());
	Random r = new Random();
	
	
	@Test
	public void testAddMethod() {
		for(int i = 0; i <10 ;i++) {
			int firstNumber = r.nextInt(100);
			int seconNumber = r.nextInt(100);
			int result = 0;
			result = firstNumber + seconNumber;
			LOG.info("Testing the method add with" + firstNumber + " and " + seconNumber);
			assertEquals(c.add(firstNumber, seconNumber), result);
		}
	}
	@Test
	public void testSubtractMethod() {
		for(int i = 0; i <10 ;i++) {
			int firstNumber = r.nextInt(100);
			int seconNumber = r.nextInt(100);
			int result = 0;
			result = firstNumber - seconNumber;
			LOG.info("Testing the Subtract add with" + firstNumber + " and " + seconNumber);
			assertEquals(c.Subtract(firstNumber, seconNumber), result);
		}
	}
}
