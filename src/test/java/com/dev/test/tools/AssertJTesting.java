package com.dev.test.tools;


import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class AssertJTesting {

	@Test
	public void Learning(){
		List<Integer> numbers = Arrays.asList(10,20,30,40,50);
		
		assertThat(numbers)
							.hasSize(5)
							.contains(10,50)
							.allMatch(x -> x >10)
							.noneMatch(x -> x <0);
	}
}
