package com.dev.test.tools;


import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class HamcreastTesting {

	@Test
	public void Learning(){
		List<Integer> numbers = Arrays.asList(10,20,30,40,50);
		
		assertThat(numbers,hasSize(5));      // nombre d'elements dans le tableau
		assertThat(numbers,hasItems(10,20)); // rechercher des items qui se trouve dans le tableau
		assertThat(numbers,everyItem(greaterThan(5))); // rechercher des items qui sont plus grand que 5
		assertThat(numbers,everyItem(lessThan(55))); // rechercher des items qui sont plus petite que 55
		assertThat("",isEmptyString());   // rechercher si il ne se trouve pas de caractere
		assertThat("TEST",containsString("TE"));  // rechercher si il se trouve des carateres dans cette chaine de caractere
		assertThat("TEST",startsWith("T")); // rechercher des items qui commence par T
	}
}
