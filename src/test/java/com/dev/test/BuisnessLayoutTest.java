package com.dev.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.dev.test.buisness.BuisnessLayout;

public class BuisnessLayoutTest {

	@Test
	public void test() {
		BuisnessLayout BL = new BuisnessLayout();
		int ActualResult = BL.PlusOperation(2, 2);
		int ExceptingResult  = 4;
		
		assertEquals(ActualResult, ExceptingResult);
	}

}
