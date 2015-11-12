package com.caltest;

//import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import com.calculator.Calculator;

//import junit.framework.Assert;

public class CalTest {

	@Test
	public void test() {

		Calculator cal = new Calculator();
		Assert.assertTrue(cal.Add(10, 20) == 30);
				
	}

}
