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
			LOG.info("Testing the subtract add with" + firstNumber + " and " + seconNumber);
			assertEquals(c.subtract(firstNumber, seconNumber), result);
		}
	}
	
	@Test
	public void testMulitiplyMethod() {
		for(int i = 0; i <10 ;i++) {
			int firstNumber = r.nextInt(100);
			int seconNumber = r.nextInt(100);
			int result = 0;
			result = firstNumber * seconNumber;
			LOG.info("Testing the mulitiply add with" + firstNumber + " and " + seconNumber);
			assertEquals(c.mulitiply(firstNumber, seconNumber), result);
		}
	}
	
	@Test
	public void testDivideMethod() {
		
		for(int i = 0;i<100;i++) {
			int firstNumber = r.nextInt(100);
			int seconNumber = r.nextInt(100);
			int result = 0;
			result = firstNumber / seconNumber;
			
			LOG.info("Testing the method divide with: "+ firstNumber +" and " + seconNumber);
			assertEquals(Math.round(c.divide(firstNumber, seconNumber)), Math.round(result),1);
			//assertEquals(c.divide(firstNumber, seconNumber), result);			
		}
	}
}
