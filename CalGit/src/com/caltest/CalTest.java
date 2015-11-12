package com.caltest;

import org.junit.After;

//import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.calculator.Calculator;

//import junit.framework.Assert;

public class CalTest {

	Calculator cal;
	
	@Before
	public void init(){
		cal = new Calculator();
	}
	
	@After
	public void cleanup(){
		cal = null;
	}
	@Test
	public void AddTest() {

		//Calculator cal = new Calculator();
		Assert.assertTrue(cal.Add(10, 20) == 30);
				
	}
	
	@Test
	public void DivTest(){
		Assert.assertTrue(cal.Div(20, 10)== 2);
	}

	@Test
	public void SubTest(){
		Assert.assertTrue(cal.Sub(20, 10) == 10 );
	}
	
}
