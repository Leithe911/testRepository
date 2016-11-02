package com.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.lesson.Calculator;

public class TestCalculator {

	/*eclemma*/
	
	private static Calculator calculator;
	
	@BeforeClass
	public static void init(){
		calculator = new Calculator();
		System.out.println("beforeClass");
	}
	
	@AfterClass
	public static void destroy(){
		calculator = null;
		System.out.println("afterClass");
	}
	
//	@Ignore
	@Test
	public void testAdd(){
		
		int real = calculator.add(5, 5);
		int expected = 10;
		
//		Assert.assertEquals(expected, real);
		
		if(real != expected){
			Assert.fail("haahhaahahhaahhaha");
		}
		
	}
	
	
	@Test
	public void testSubstruct(){
		
		Assert.assertEquals("error substruct", calculator.substruct(10, 5), 5, 0.1);
		
	}
	
	@Test
	public void testMultuply(){
		
		Assert.assertEquals(calculator.multuply(4, 4), 16);
		
	}
	
	@Test
	public void testDevide(){
		
		Assert.assertEquals(calculator.devide(8, 2), 4, 0.1);
		
	}
	
	@Before
	public void beforEveryTest(){
		
		System.out.println("before every test");
		
	}
	
	@After
	public void afterEveryTest(){
		
		System.out.println("after every test");
		
	}
	
	@Test(expected=FileNotFoundException.class)
	public void read() throws FileNotFoundException{
		
		FileInputStream fileInputStream = new FileInputStream("test.txt");
		
	}
	
	
	
	
}
