package com.cmsz.mvn_test;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculateTest {

/*	@Test
	public void test() {
		fail("Not yet implemented");
	}
*/	
	@Test
	public void addTest(){
		assertEquals(6, new Calculate().add(3,3));
	}
	
	@Test
	public void substractTest(){
		assertEquals(6, new Calculate().substract(9, 3));
	}
	
	@Test
	public void multiplyTest(){
		assertEquals(12, new Calculate().multiply(3, 4));
	}
	
	@Test
	public void divideTest(){
		assertEquals(2, new Calculate().divide(6, 3));
	}
}





